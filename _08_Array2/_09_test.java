package _08_Array2;

import java.util.Random;
import java.util.Scanner;

public class _09_test {

	public static void main(String[] args) {
		/*
		 * 1 1 0 2
		 * 3 2 1 2
		 * 0 0 3 2
		 * 4 4 4 4 
		 * 2 4 3 1
		 * 2 4 1 3
		 */
		// 9번. 키보드로 좌표를 입력하면, 좌표기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거가능
		//     제거가능이면 제거를하고, 위에 있는 숫자가 아래로 내려온다.
		//     맨위에 배열은 랜덤수로 채워진다.
		
		// y는 0 1 2 3 이 가능함
		// 같을수 있는 경우가
		// 입력받은 x좌표로부터 전으로 2개가 같거나 , 뒤로 2개가 같거나, 양옆이 같을때
		// 0일때는 뒤로 2개가 같을때만 , 1일때는 양옆으로 또는 뒤로 2개가 같을 때만 비교
		// 기준을 y=0  / y=3 / 그 외
		
		int[][] a = {{1,1,0,2},
		     		{3,2,1,2},
		     		{0,0,3,2},
		     		{4,4,4,4},
		     		{2,4,3,1},
		     		{2,4,1,3}};
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("좌표를 입력하세요.(x (공백) y)");
		int x=in.nextInt();
		int y=in.nextInt();
		int bomb = a[x][y];
		System.out.println("입력한 좌표: "+x+", "+y);
//		System.out.println(bomb);
		
		
		for (int i = x; ;) {
			if(y==0 && a[x][y+1]==bomb && a[x][y+2]==bomb) {
				for (; i >= 0; i--) {
					for (int j = y; j <= y+2; j++) {
						if(i!=0) {
							a[i][j]=a[i-1][j];
						}else if(i==0) {
							a[i][j]=r.nextInt(10);
						}	
					}
				}
			}else if(y==a[0].length-1 && a[x][y-1]==bomb && a[x][y-2]==bomb) {
				for (; i >= 0; i--) {
					for (int j = y; j >= y-2; j--) {
						if(i!=0) {
							a[i][j]=a[i-1][j];
						}else if(i==0) {
							a[i][j]=r.nextInt(10);
						}	
					}
				}
			}else if(y>0&&y<a[0].length-1&&a[x][y-1]==bomb && a[x][y+1]==bomb){
				for (; i >= 0; i--) {
					for (int j = y-1; j <= y+1; j++) {
						if(i!=0) {
							a[i][j]=a[i-1][j];
						}else if(i==0) {
							a[i][j]=r.nextInt(10);
						}	
					}
				}
			}
		break;
		}
		
		// 결과 확인
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
