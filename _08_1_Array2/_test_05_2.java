package _08_1_Array2;

public class _test_05_2 {

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
		
		// 블록이 밀리면서 달팽이 모양을 이루는 형태
		// 값이 밀린다는건, 밀리기 전에 존재하던 값을 저장할 공간이 필요하고,
		// 각 숫자가 밀리는 형태로 재배치가 이루어진 후에, 그 전에 저장해놨던 값의 대입이 필요하다.
		
		// 반복의 총 횟수는 배열의 행을 2로 나눈 몫과, 열을 2로 나눈 몫의 곱에 2를 곱한 값 만큼이다.
		// (사각형을 이루는 형태로 재배치가 일어나기 때문) 
		
		int rmin = 0;
		int rmax = a.length-1;
		int cmin = 0;
		int cmax = a[0].length-1;
		int cnt = 1;
		int emp = 0;	// 처음에, 숫자 재배치 후 마지막에 대입할 변수 선언
		int emp1=0;		// 처음에, 끝번호를 먼저 저장해놓을 변수 선언
		// emp와 emp1은 끝번호의 저장과 , 이전에 저장해 놓은 번호의 대입이 한 바퀴 내에서 일어나야하므로 
		// 단계별 for문에서 역할이 한번씩 번갈아가면서 바뀜.(이전 for문에저 저장으로 사용 -> 다음 for문에서는 대입시 사용)
		
		for (; cnt < 2*(a.length/2)*(a[0].length/2); ) {		// 반복횟수 설정
			if(cnt%4==1) {
				emp = a[rmin+1][cmin];		// 바퀴를 도는 처음은 대입값을 저장하고 시작
				emp1 = a[rmin][cmax];		// 5를 저장
//				System.out.println("*"+emp);		// 이번 턴에서 대입될 값 확인
				for (int i = cmax; i > cmin; i--) {
					a[rmin][i] = a[rmin][i-1];
					if(i==(cmin+1)) {
						cnt++;
					}
				}
				a[rmin][cmin]=emp;
				rmin++;
			}
			if(cnt%4==2) {
				emp = a[rmax][cmax];	// 25저장
//				System.out.println("**"+emp1);		// 이번 턴에서 대입될 값 확인
				for (int i = rmax; i > rmin; i--) {
					a[i][cmax] = a[i-1][cmax];
					if(i==rmin+1) {
						cnt++;
					}
				}
				a[rmin][cmax]=emp1;			// 5대입
				cmax--;
			}
			if(cnt%4==3) {
				emp1=a[rmax][cmin];		// 21저장
//				System.out.println("***"+emp);		// 이번 턴에서 대입될 값 확인
				for (int i = cmin; i < cmax; i++) {
					a[rmax][i] = a[rmax][i+1];
					if(i==cmax-1) {
						cnt++;
					}
				}
				a[rmax][cmax]=emp;		// 25대입
				rmax--;
			}
			if(cnt%4==0) {
//				System.out.println("****"+emp1);		// 이번 턴에서 대입될 값 확인 
				for (int i = rmin; i < rmax; i++) {
					a[i][cmin]=a[i+1][cmin];
					if(i==rmax-1) {
						cnt++;
					}
				}
				a[rmax][cmin] = emp1;	// 21대입
				cmin++;
			}
		}
		
		System.out.println();
		System.out.println("변경 후 배열의 형태");
		System.out.println("---------------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
