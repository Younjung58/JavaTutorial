package _03for;

public class _00_BasicFor {
	public static void main(String[] args) {
//		for(int i=0;i<3;i++) {
//			System.out.println(i);
//		}
		// 결과는 0  1  2
//		for(int i=3;i>0;i--) {
//			System.out.println(i);
//		}
		// 결과는 3  2  1 
//		for(int i=0;i<100;) {
//			System.out.println(i);
//		}
		// i에 대한 증감식이 존재하지 않기때문에 i의 값이 변화가 없이 계속 0이기에 0<100라는 조건이 계속 만족함
		// 따라서 무한루프의 에러가 발생(0000000........)
//		for(int i=0;i<(i+1);i++) {
//			System.out.println(i);
//		}
		// 증감식에따라서 i가 1씩 증가할 때 모든 경우가 i<i+1이라는 조건을 만족함
		// 따라서 무한루프의 에러가 발생(0123456.......)
		
	}
	
}
