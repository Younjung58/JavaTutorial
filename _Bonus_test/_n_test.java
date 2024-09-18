package _Bonus_test;

public class _n_test {

	public static void main(String[] args) {
		
		// 셀프 넘버 = 제네레이터가 없는 숫자
		//문제. 1이상이고 5000보다 작은 모든 셀프 넘버들의 함을 구하기
		
		int sum = 0;
		
		
		
		int bb=0;
		int summ=0;
		for (int i = 1; i <= 5000; i++) {
			for (int j = 0; j <= 10000; j++) {
				sum = (j/1000)+(j%1000)/100+(j%100)/10+j%10+j;
					if(i==sum) {
						bb++;
				}
			}
			if(bb==0) {
				summ+=i;
			}
			bb=0;
		}
		System.out.println(summ);
		// 답: 1227365
	}

}
