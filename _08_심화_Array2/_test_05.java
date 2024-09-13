package _08_심화_Array2;

public class _test_05 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 출력되어야하는 답의 형태
		 * 1 2 3 4 5
		 * 14 15 16 17 6
		 * 13 20 19 18 7
		 * 12 11 10 9 8
		 */
		
		//사고과정.
		// 숫자가 1부터 20까지 증가하는 형태로 필요 - 이에 맞게 일차적으로 배열값 입력
		// 배열의 길이는 행4, 열5로 정해져있으므로 문제에 맞게 출력하기 위해서는 
		// 처음 값을 입력하는 순서가 중요함
		// 따라서 입력 순서를 생각해보면,
		// 1. 0행에서 0,1,2,3,4열순으로 4에도달했을때(열의 최대값에 도달했을때)
		// 2. 열의 최대값인 4열에서 1,2,3행으로 진행(또다시 행의 최대값에 도달했을때)
		// 3. 3행에서 3,2,1,0열으로 진행(열의 최소값에 도달했을 때)   
		// 4. 0열에서 3,2,1행으로 진행(행의 최소값+1에 도달했을때) / 1바퀴
		// 5. 1행(최소값+1)에서 1,2,3열(열최대값-1)
		// 6. 3열에서 1,2행(행 최대값-1)
		// 7. 2행에서 3,2,1열 / 2바퀴
		// 각 바퀴로 계산했을 때, 행과열의 최대 - 최소값에 따라서 반복의 횟수가 결정되고
		// 그 최대 최소값은 바퀴를 돌때마다 수가 바뀌는 패턴
		
		// 배열 값 입력
		int rmin = 0;
		int rmax = a.length-1;
		int cmin =0;
		int cmax = a[0].length-1;
		int cnt=1;
		
		for (;num<=(a.length*a[0].length)-1;) {
			if(cnt%4==1) {
				for (int j = cmin; j <= cmax; j++) {
					a[rmin][j]=num;
					num++;
					if(j==cmax) {
//						System.out.println(a[rmin][j]);
						cnt++;
						rmin++;	
						// 0행의 4열은 이미 채워졌고, 그 다음은 4열의 1,2,3행을 채울것이기때문에 rmin(0행)에 1증가
					}
				}
			}
			
			
			if(cnt%4==2) {
				for (int j = rmin; j <= rmax; j++) {
					a[j][cmax]=num;
					num++;
					if(j==rmax) {
//						System.out.println(a[j][cmax]);
						cmax--;
						cnt++;
					}
				}
			}
			if(cnt%4==3) {
				for (int j = cmax; j >= cmin; j--) {
					a[rmax][j]=num;
					num++;
					if(j==cmin) {
//						System.out.println(a[rmax][j]);
						rmax--;
						cnt++;
					}
				}
			}
			if(cnt%4==0) {
				for (int j = rmax; j >= rmin; j--) {
					a[j][cmin]=num;
					num++;
					if(j==rmin) {
//						System.out.println(a[cmin][j]);
						cmin++;
						cnt++;
					}
				}
			}
			
		}
		
		
		// 배열 값 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
