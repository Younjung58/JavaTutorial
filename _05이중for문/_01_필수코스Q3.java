package _05이중for문;

public class _01_필수코스Q3 {

	public static void main(String[] args) {
//		3.
//		000*
//		00***
//		0*****
//		*******
		// 분석
//		0과 *의 총합->4, 5, 6, 7  -> i(4번이자 총합으로 사용)
//		0 -> 3,2,1,0  -> j(0의 갯수와 i의 갯수의 합이 7이되면 됨)(즉 j는 7-i까지 반복)
//		*->1,3,5,7 -> i-j번
		
		int j =0;
		for (int i =4; i <8; i++) {
			for (j = 0; j < 7-i; j++) {
				System.out.print("0");
			}
			for (int k = 1; k <=i-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
	// 다른 풀이(2번과 동일하게 줄을 i, 열을 k로 봄)
//		k로 표현하면			i는
//		0 1 2 3				i=0			(0이 2(2-i)까지)
//		0 1 2 3 4			i=1			(0이 1까지)
//		0 1 2 3 4 5			i=2			(0이 0까지)
//		0 1 2 3 4 5 6		i=3
//		즉, j의 끝숫자는 3+i임
		
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 4+i ; k++) {
				if(k<=2-i) {
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
