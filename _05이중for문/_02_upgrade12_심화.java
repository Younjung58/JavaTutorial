package _05이중for문;

public class _02_upgrade12_심화 {

	public static void main(String[] args) {
		//for문 2개, if문 2개만 사용해서,,    -> 다시 풀기
//		<11번>	
//		000*			7이 고정, (7-별의갯수(i)/2)만큼 별을찍음(j)
//		00***			별의 갯수  1(4) 3(3,4,5) 5 7 5 3 1(7까지는 +2/ 7이되면 -2)
//		0*****			행	    1 3 5 7 9 11 13 (i)
//		*******		즉, 5-9(14-9) 같은거실행 / 3-11(14-11)같은거실행 / 1-13(14-13)같은거실행
//		0*****		9
//		00***		11 ->6까지
//		000*		13 ->5까지
		
		//1->5까지   3->6까지  5->7까지    (7-((7-i)/2))까지
		
		// 분석
//			j		k				i
		/* 0->3 / *-> 1(i-j)		4		
		 * 0->2 / *-> 3				5		
		 * 0->1 / *-> 5				6		
		 * 0->0 / *-> 7				7	cnt=4	
		 * 0->1 / *-> 5				6	8	14-8			
		 * 0->2 / *-> 3				5	9	14-9
		 * 0->3 / *-> 1				4	10	14-10
		 */
		
		int s=0;
		for (int i = 1; i <14; i+=2) {
			if(i>=9) {
				s=i;
				i=14-i;
				for (int j = 1; j <= 7-((7-i)/2); j++) {
					if(j<=(7-i)/2) {
						System.out.print("0");
					}else{
						System.out.print("*");
					}
				}
				i=s;
			}else {
				for (int j = 1; j <= 7-((7-i)/2); j++) {
					if(j<=(7-i)/2) {
						System.out.print("0");
					}else{
						System.out.print("*");
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.println("-------------");
		
		int s1=1;
		for (int i = 1; i <14; i+=2) {
			if(i>=9) {
				s1=14-i;
			}
			for (int j = 1; j <= 7-((7-s1)/2); j++) {
				if(j<=(7-s1)/2) {
					System.out.print("0");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
			s1+=2;
		}
	}

}
