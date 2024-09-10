package _05이중for문;

import java.util.Iterator;

public class _02_upgrade12_0 {

	public static void main(String[] args) {
//		12. 11번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
//		<11번>
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
		 * 0->0 / *-> 7				7	cnt=4	
		 * 0->1 / *-> 5				6	8	14-8			
		 * 0->2 / *-> 3				5	9	14-9
		 * 0->3 / *-> 1				4	10	14-10
		 */
		
		int cnt=0;
		for (int i = 4; ;) {
			cnt++;
			if(i>=8) {
				i=14-i;
			}
			if(i<8) {
				for (int j = 1; j < i+1; j++) {
					if(j<=7-i) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(cnt<=4) {
					i++;
				}else {
					i=1+(14-i);
				}
			}
			System.out.println();
			if(cnt==7) {
				break;
			}
		}
	}

}
