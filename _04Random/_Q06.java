package _04Random;

import java.util.Random;

public class _Q06 {

	public static void main(String[] args) {
//		6. 
//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		오늘의 추천 로또 번호 하나를 출력하시오.  
//		만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		Random r = new Random();
		int [] lotto = new int[45];
		int k=0;
		int maxLotto=0;
		int maxNum=0;
		for(int i=0;i<10000;i++) {
			k=r.nextInt(45)+1;
			lotto[k-1]++;
			if(lotto[k-1]>=maxLotto) {
				maxLotto=lotto[k-1];
				maxNum=k;
//				System.out.print(maxNum+" ");
			}
			if(i==9999) {
				k=r.nextInt(45)+1;
				if((k>maxNum) && (k==maxLotto-1)) {
//					System.out.println(k);
					maxNum=k;
				}
			}
		}
//		System.out.println();
		System.out.println("오늘의 추천번호는 "+maxNum);
	}

}
