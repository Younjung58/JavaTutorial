package _14_Static_final;

public class MemberADM {
	
	public String name = null;
	public static String companyName = "Human";
	// MemberADM 객체 2개를 만들면 name은 2개 생성 / companyName은 1개로 공용사용
	// companyName은 기억공간은 하나만 차지함
	// Main class에서 test1으로 증명해보자
	
	public static final String teamName = "KimTeam";
	// 변수 성질에 final을 붙이면 초기값 설정 이후에는 값 변경 불가(상수로 칭하겠다)
	// test2로 증명해보자
	
	public final String nametest = "abc";
	// 객체를 생성하면 따로 만들어지고(메모리부여), 변수의 값은 변경이 불가하다.
	
	MemberADM(){
		String name = Thread.currentThread().getName();
		System.out.println(name+"스레드가 MemberADM 생성자 실행");
//		this.nametest = "aaa";		//	에러발생. 상수는 초기값이 결정된 후 변경불가하므로
	}
	public static void prt() {
//		System.out.println(name);
	}
}