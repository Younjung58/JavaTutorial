package _05이중for문;

public class _01_필수코스Q4 {

	public static void main(String[] args) {
//		4. 
//		*******
//		0*****
//		00***
//		000*
		
		// 분석
//		총4줄
//		0-> 0 1 2 3(전역변수 j로 선언하여 0부터 3까지 증감)
//		*-> 7 5 3 1(지역변수 k는 0부터 총합에서 j의 갯수를 뺀만큼, 즉 i-j까지 반복)
//		총-> 7 6 5 4(4줄로 이용하는 i로 사용, 즉 i는 초기값 7이고, 4까지이며, 증감은 --)
		
		int j =0;
		for (int i =7; i > 3; i--) {
			for (j = 0; j < 7-i; j++) {
				System.out.print("0");
			}
			for (int k = 0; k <i-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
