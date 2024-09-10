package _03for;

public class _00_test2 {

	public static void main(String[] args) {
//		이 문제는 응용문제입니다. 할 수 있습니다. 풀어 봅시다~~
//		변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
//		9.  
//			String test = "abcdeabce";
//		    for(int i=0; i < 9; i ++){
//		    	char aaa = test.charAt(i);
//		    	sysout(aaa);
//		    }
//
//		   위 코드를 분석하여 test문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		    
			String test = "abcdeabce";
		    int cnt=0;
		    for(int i=0; i < 9; i ++){
		    	char aaa = test.charAt(i);
		    	if(aaa=='a') {
		    		cnt++;
		    	}
		    }System.out.println(cnt+"개");

	}
	
	// 선언문(자료형 변수=초기값)
	// 자료형에 따라서 연산자가 결정되어짐
	// 결론: 변수는 test, 변수는 문자열의 값, 초기문자열은"~"
	
	// java에서 대문자로 시작되는 자료형(String)은 .charAt과 같이 .을 사용가능(참조 타입)
	// 소문자로 시작되는경우(int, char, boolean, double, float)는 사용 불가능(원시 타입)
	// 예외: 배열은 .을 사용할 수 있다.
	// 결론: 객체는 참조타입과 밀접한 관련이 있다.
}
