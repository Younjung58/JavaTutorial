package _05이중for문;

public class _01_필수코스Q5 {

	public static void main(String[] args) {
//		5. int[] a ={34,55,23,56,34,45,34};
//		40보다 큰 수는 모두 몇개인가?
		int[] a ={34,55,23,56,34,45,34};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>40) {
				cnt++;
			}
		}
		System.out.println("40보다 큰수는 "+cnt+"개입니다." );

	}

}
