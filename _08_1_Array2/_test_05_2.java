package _08_1_Array2;

public class _test_05_2 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		
		/* 위 배열의 형태를 아래와 같이 바꾸기
		 * 6	1	2	3	4
		 * 11	12	7	8	5
		 * 16	17	13	9	10
		 * 21	18	19	14	15
		 * 22	23	24	25	20
		 */
		
		int rmin = 0;
		int rmax = a.length-1;
		int cmin = 0;
		int cmax = a[0].length-1;
		int cnt = 1;
		int emp = 0;
		
		for (; cnt < 2*(a.length/2)*(a[0].length/2); ) {
			if(cnt%4==1) {
				emp = a[rmin][cmax];
				System.out.println("*"+emp);
				for (int i = cmax; i > cmin; i--) {
					a[rmin][i] = a[rmin][i-1];
					if(i==(cmin+1)) {
						cnt++;
						rmin++;
					}
				}
				a[rmin][cmin]=a[rmin+1][cmin];
			}
			if(cnt%4==2) {
				a[rmin][cmax]=emp;
				emp = a[rmax][cmax];
				System.out.println("**"+emp);
				for (int i = rmax; i > rmin; i--) {
					a[i][cmax] = a[i-1][cmax];
					if(i==rmin+1) {
						cnt++;
						cmax--;
					}
				}
			}
			if(cnt%4==3) {
				a[rmax][cmax]=emp;
				emp=a[rmax][cmin];
				System.out.println("***"+emp);
				for (int i = cmin; i < cmax; i++) {
					a[rmax][i] = a[rmax][i+1];
					if(i==cmax-1) {
						cnt++;
						rmax--;
					}
				}
			}
			if(cnt%4==0) {
				a[rmax][cmin]=emp;
				for (int i = rmin; i < rmax; i++) {
					a[i][cmin]=a[i+1][cmin];
					if(i==rmax-1) {
						cnt++;
						cmin++;
					}
				}
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
