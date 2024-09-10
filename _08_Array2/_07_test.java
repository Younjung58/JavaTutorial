package _08_Array2;

import java.util.Iterator;

public class _07_test {

	public static void main(String[] args) {
		/*
		 * 1 1 0 2
		 * 3 2 1 2
		 * 0 0 3 2
		 * 4 4 4 4 
		 * 2 4 3 1
		 * 2 4 1 3
		 */
		
		//7. 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오 
		
		int[][] a = {{1,1,0,2},
				     {3,2,1,2},
				     {0,0,3,2},
				     {4,4,4,4},
				     {2,4,3,1},
				     {2,4,1,3}};
		
		int ers = 0;
		int cnt = 1;
		
		
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length-1; j++) {
//				System.out.print(a[j][i]+" ");
				if(a[j][i]==a[j+1][i]) {
					cnt++;
				}else {
					cnt=1;
				}
				if(cnt>=3) {
					System.out.println("제거대상의 번호는: "+a[j][i]);
					ers = a[j][i];
					for (int k = 0; k < a.length; k++) {
						if(a[k][i]==ers) {
							System.out.println("좌표는 "+k+", "+i);
						}
						cnt=1;
					}
				}
			}
		System.out.println();
		cnt=1;
		ers=0;
		}
	}

}
