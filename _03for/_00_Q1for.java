package _03for;

public class _00_Q1for {
	public static void main(String[] args) {
		int [] a = {30,40,50,55,65};
		// 1번 : 65 55 50 40 30 순으로 결과 만들기
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}
		System.out.println("---------------------");
		// 2번 : 40 50 55 65 30 순으로 결과 만들기
		for(int k=1;k<=5;k++) {
			System.out.println(a[k%5]);
		}
		System.out.println("---------------------");
//		for(int k=0;k<=4;k++) {
//			System.out.println(a[k+1]%5);
//		} 의 코드도 동일하게 실행 가능
//		이왕이면 k=0의 부분을 유지하며 코드를 바꿔보기
		
		// 배열 순회를 반복하면서 값의 조건 판단 후 출력(데이터 정제의 기본원리)
		// 3번 : a배열에서 value의 값이 50 이상인 값만 도출하기
		for(int i=0;i<5;i++) {
			if(a[i]>=50) {
			System.out.println(a[i]);
			}
		}
		// 이것을 응용해서 50 이상인 것의 갯수를 구해라
		// 이것을 응용해서 50 이상인 것의 합산을 구해라 
		// 도 구할 수 있음
		System.out.println("---------------------");
		
		// 4번 : 50 이상의 점수를 합하시오
		int add = 0;
		for(int i=0;i<5;i++) {
			if(a[i]>=50) {
			add += a[i];
			}
		}
		System.out.println(add);
		System.out.println("---------------------");
		
		// 5번 : 50 이상의 평균을 구하시오
		add = 0;
		int cnt = 0;
		double avg = 0;
		for(int i=0;i<5;i++) {
			if(a[i]>=50) {
				add += a[i];
				cnt++;
			}
		}
		avg = add/(double)cnt;
		System.out.println(avg);
		System.out.println("---------------------");
		
		// 6번 : 최저 점수를 포함하지 않은 점수의 평균을 구하시오
		int minValue = 10000;
		add = 0;
		cnt = 0;
		for(int i=0;i<5;i++) {
			if(a[i]<=minValue) {
				minValue = a[i];
			}
		}
		for(int i=0;i<5;i++) {
			if(a[i]!=minValue) {
				add+=a[i];
				cnt++;
			}
		}
//		System.out.println(minValue);
		avg = add/(double)cnt;
		System.out.println(avg);
		System.out.println("---------------------");
		
		// 6번 코드 줄이기
		minValue = 10000;
		add = 0;
		cnt = 0;
		for(int i=0;i<5;i++) {
			if(a[i]<=minValue) {
				minValue = a[i];
			}
			add+=a[i];
			cnt++;
		}
		System.out.println(minValue);
		avg = (double)(add-minValue)/(cnt-1);
		System.out.println(avg);
		System.out.println("---------------------");
	}
}
