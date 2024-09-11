package _08_0_Array2;

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
		
		// 사고과정.
		// 같을수 있는 경우를 현재는 가로만 비교, 즉, 열의 번호로만 비교해서 3개 이상인지 비교하면 됨.
		// 입력받은 x좌표로부터 앞으로 2개 이상이 같거나 , 뒤로 2개 이상이 같거나, 양옆으로 2개이상 같을때
		// 0일때는 앞으로만 비교, 행의 끝번호일때는 뒤로만 비교, 그 외는 앞뒤로 비교 
		// 따라서 이에따라 기준을 y=0  / y=끝번호  / 그 외의 경우로 나누어서 생각(if문으로 구별) -- 사고 1
		// 해당하는 좌표에서 제거할 부분을 찾는 것과
		// 그 제거한 부분으로 부터 위에 숫자들이 내려와서 대입될 부분과
		// 최종 출력의 단계를 나누어서 작성해보자			-- 사고 2
		
		
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
		int cnt =1;		// 연속되는 길이 찾기 위해 선언
		int num =1;		// 입력받은 좌표로부터 숫자가 연속되는 왼쪽 부분의 찾기 위해 선언
		int str =1;		// 수를 바꿀 시작 부분을 찾을 정수 선언
		
		// 3개 이상인 부분도 찾아야하고(어디까지 연속적인지) -> 그래야지 제거 대상을 확정할수 있고  - 사고 of 사고1
		// 새로운 값을 넣을때 제일 입력받은 좌표의 행부터 0번의 행까지 숫자를 새로 대입하되
		// 0행은 아예 랜덤값  /  나머지는 x-1의 행에 값을 받으면 됨    - 대입 부분 조건
		// 즉 제거가 일어나면 변경할 행의 범위는 정해져있고,  열의 범위를 찾아서 지정해줘야하는 것임.. 
		
		for (int i = x; ;) {
			if(y==0) {
				for (int j = y; j < a[x].length-1; j++) {
					if(a[x][j]==a[x][j+1]) {
						cnt++;
					}else{
						cnt=1;
					}
					if(cnt>=3) {
						for (int k = j-1; k < a[x].length; k++) {    // 사고 of 사고1(제거 끝 부분찾기)
							if(a[i][k]==bomb) {
								str = k;
							}else {
								cnt=1;
								break;
							}
						}
					}
				}
				for (int j = x; j >= 0; j--) {			// 해당 부분의 숫자 변경
					for (int k = 0; k <= str; k++) {
						if(j!=0) {
							a[j][k]=a[j-1][k];
						}else if(j==0) {
							a[j][k]=r.nextInt(10);
						}
					}
				}	
			}else if(y==a[0].length-1) {
				for (int j = y; j >= 1; j--) {
					if(a[x][j]==a[x][j-1]) {
						cnt++;
					}else{
						cnt=1;
					}
					if(cnt>=3) {
						for (int k = j+1; k >= 0; k--) {    // 사고 of 사고1(제거 시작 부분찾기)
							if(a[i][k]==bomb) {
								str = k;
							}else {
								cnt=1;
								break;
							}
						}
					}	
				}
				for (int j = x; j >= 0; j--) {			// 해당 부분의 숫자 변경
					for (int k = str; k <= y; k++) {
						if(j!=0) {
							a[j][k]=a[j-1][k];
						}else if(j==0) {
							a[j][k]=r.nextInt(10);
						}
					}
				}			
			}else{			
				for (int j = y; j >= 0; j--) {	// 행 내에서 어디서 부터 시작 비교 할것인지의 열을 알아야함(즉 제거 시작부분)
					if(a[x][j]==bomb) {
						num = j;
					}else{
						break;
					}
				}
				for (int j = num; j < a[x].length-1; j++) {
					if(a[x][j]==a[x][j+1]) {
						cnt++;
					}else{
						cnt=1;
					}
					if(cnt>=3) {
						for (int k = j-1; k < a[x].length; k++) {    // 사고 of 사고1(제거 끝 부분찾기)
							if(a[i][k]==bomb) {
								str = k;
							}else {
								cnt=1;
								break;
							}
						}
					}
				}
				for (int j = x; j >= 0; j--) {			// 해당 부분의 숫자 변경
					for (int k = num; k < str; k++) {
						if(j!=0) {
							a[j][k]=a[j-1][k];
						}else if(j==0) {
							a[j][k]=r.nextInt(10);
						}
					}
				}			
			}
		break;
		}
		
		
		// 결과 확인
		System.out.println("---------------------------------");
		System.out.println("게임의 결과");
		System.out.println("---------------------------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
