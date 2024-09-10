package _05이중for문;

public class _시나리오 {

	public static void main(String[] args) {
//		시나리오1: 1단을 모두 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("1x"+i+"= "+(1*i));
		}
		System.out.println("---------------------------------------");		

//		시나리오2: 1단부터 4단을 출력  -2중 for문이 필요함(반복이 2부분인데 서로 영향을 줌)
		for (int i = 1; i < 5; i++) {		// 단을 의미하는 반복 for문
			System.out.println(i+"단");
			for (int k = 1; k < 10; k++) {		// 곱하는 수를 의미하는 반복 for문
				System.out.println(i+"x"+k+"= "+(i*k));
			}
		}
		System.out.println("---------------------------------------");	
		
		// '***'을 4줄 만들어서 출력
		for (int i=0; i<4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");		
		
		String id = "abc*^";
		String sign = "*^$";
		int cnt=0;
		// id에 특수문자가 있는가?
//		-> 1. id의 문자열의 각각 돌아야함(즉 문자열id 각각의 문자를 i로 지정)
//		-> 2. 그 문자 각각을 sign의 문자와 대조해서 비교해야함(즉 문자열 sign을 j로 지정)
		for (int i = 0; i < id.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if(id.charAt(i)==sign.charAt(j)) {
					cnt++;
					System.out.println("특수문자가 있습니다."+"("+id.charAt(i)+")");
				}
			}
		}if(cnt==0) {
			System.out.println("특수문자가 없습니다.");
		}
	}

}
