package _05이중for문;

public class _2for_03 {

	public static void main(String[] args) {
//		3. 팩토리얼의 합 구하기 (2중 for로 해결)
//		1부터 10까지 숫자의 각패토리얼의 합을 구하시오
//		예를들어 4의 팩토리얼은  1*2*3*4
//		             5의 팩토리얼은 1*2*3*4*5
		int fact=1;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				fact*=j;
			}
			System.out.println(i+"일때 팩토리얼: "+fact);
			sum+=fact;
			fact=1;
		}System.out.println("총합: "+sum);

	}

}
