package _08_1_Array2;

public class _test_05_2풀이최종일지도 {

	public static void main(String[] args) {
			int [][] a = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25}};
			
			System.out.println("기존 배열의 형태");
			System.out.println("---------------------");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			
			/* 위 배열의 형태를 아래와 같이 바꾸기
			 * 6	1	2	3	4
			 * 11	12	7	8	5
			 * 16	17	13	9	10
			 * 21	18	19	14	15
			 * 22	23	24	25	20
			 */
			
			// 앞 코드를 더 깔끔하게 해보기,,
			
			int rmin = 0;
			int rmax = a.length-1;
			int cmin =0;
			int cmax = a[0].length-1;	// 초기 꼭짓점 4개 선언
			int emp = 0;	// 재배치시 값 저장할 변수 선언
			
			// 배열 값 재배치가 일어날때 빈공간으로 사용할 수 있는 곳 -> 왼쪽 위 꼭짓점(초기에 0,0)
			// 배열 값 재배치
			for (;cmax/2!=0&rmax/2!=0;cmax--,cmin++,rmax--,rmin++) {	
				// 사각형의 가로.세로변이 있을때까지 진행하되,그 변의 길이를 한바퀴 돌때마다 감소 
				emp = a[rmin][cmax];	// 5를 emp에 저장
				for (int i = cmax; i > cmin; i--) {				// 사각형 윗변
					a[rmin][i] = a[rmin][i-1];
					if(i==cmin+1) {
						a[rmin][cmin]=emp;		// 빈공간 5저장
					}
				}
				emp = a[rmax][cmax];		// 25를 emp에 저장
				for (int i = rmax; i > rmin; i--) {		// 사각형 오른쪽변
					a[i][cmax] = a[i-1][cmax];
					if(i==rmin+1) {
						a[i][cmax]=a[rmin][cmin];	// 빈공간에 있던 5대입
						a[rmin][cmin]=emp;	// 빈공간 25 저장
					}
				}
				emp = a[rmax][cmin];	// 21을 emp에 저장
				for (int i = cmin; i < cmax; i++) {	// 사각형 아랫변
					a[rmax][i] = a[rmax][i+1];
					if(i==cmax-1) {
						a[rmax][i]=a[rmin][cmin];	// 빈공간에 있던 25 대입
					}
				}
				for (int i = rmin; i < rmax; i++) {		// 사각형	왼쪽변
					a[i][cmin] = a[i+1][cmin];
					if(i==rmax-1) {
						a[i][cmin]=emp;		// 마지막에 emp에 저장된 21을 대입
					}
				}
			}
			
			//최종 배열 변경 확인
			System.out.println();
			System.out.println("배열 재배치 후");
			System.out.println("---------------------------");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
		
	}

}
