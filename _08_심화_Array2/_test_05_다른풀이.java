package _08_심화_Array2;

public class _test_05_다른풀이 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 출력되어야하는 답의 형태
		 * 1 2 3 4 5
		 * 14 15 16 17 6
		 * 13 20 19 18 7
		 * 12 11 10 9 8
		 */
		
		// 앞 풀이를 좀더 간단하게 해보기 
		// -> 사각형 구조로 생각하여 꼭짓점을 변수 4개로 지정.
		// 그러한 꼭짓점을 사각형 모양대로 줄여가면서 진행함 
		//-> 구체적인 사고과정은 'test6_다른풀이'와 동일
		
		// 배열 값 입력
		int rmin = 0;
		int rmax = a.length-1;
		int cmin =0;
		int cmax = a[0].length-1;	// 초기 4개의 꼭짓점을 변수를 통하여 지정 
		
		
		for (;cmax/2!=0&&rmax/2!=0;rmin++,rmax--,cmin++,cmax--){	
			// 꼭짓점을 사각형 모양대로 줄이기, 사각형의 가로.세로 변이 존재할 동안만 for문을 진행
			for (int j = cmin; j <= cmax; j++) {	// 윗줄
				a[rmin][j]=num++;
//				System.out.println("*"+a[rmin][j]);
			}
			for (int j = rmin+1; j <= rmax; j++) {	// 오른쪽
				a[j][cmax]=num++;
//				System.out.println("**"+a[j][cmax]);
			}
			for (int j = cmax-1; j >= cmin; j--) {	// 아래줄
				a[rmax][j]=num++;
//				System.out.println("***"+a[rmax][j]);
			}
			for (int j = rmax-1; j >= rmin+1; j--) {	// 왼쪽
				a[j][cmin]=num++;
//				System.out.println("****"+a[j][cmin]);
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
