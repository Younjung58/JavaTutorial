package _05이중for문;

public class _02_upgrade11 {

	public static void main(String[] args) {
//		11.
//		000*
//		00***
//		0*****
//		*******
//		0*****
//		00***
//		000*
		
		// 분석
//			j		k				i
		/* 0->3 / *-> 1(i-j)		4		
		 * 0->2 / *-> 3				5		
		 * 0->1 / *-> 5				6		
		 * 0->0 / *-> 7				7		
		 * 0->1 / *-> 5				6					
		 * 0->2 / *-> 3				5		
		 * 0->3 / *-> 1				4		
		 */
		
		int j =0;
		int k =1;
		for (int i =4; i <8; i++) {
			for (j = 0; j < 7-i; j++) {
				System.out.print("0");
			}
			for (k = 1; k <=i-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =6; i >3; i--) {
			for (j = 0; j < 7-i; j++) {
				System.out.print("0");
			}
			for (k=1; k <=i-j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
