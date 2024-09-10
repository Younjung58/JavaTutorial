package _05이중for문;

public class _01_필수코스Q6 {

	public static void main(String[] args) {
//		6
//		int[] a ={34,55,23,56,34,45,34};
//		int[] b ={36,49};
//		b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
//		각각 카운팅 하시오 
//		출력은
//		 a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
//		 a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
		
		//분석
//		각각의 b의 배열값을 i로 지정
//		그에대해 각각 비교할 a의 배열값을 j로 지정하여 코드 작성
		// 또한 비교시마다 카운팅 할 int가 필요하며 카운팅하고 출력한 후에는 초기화
		
		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
		int cnt=0;
		for (int i=0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(b[i]<a[j]) {
					cnt++;
				}
			}
			System.out.println("a 배열의 값에는 "+b[i]+"번호보다 큰 숫자가 "+cnt+"개 있습니다.");
			cnt=0;
		}

	}

}
