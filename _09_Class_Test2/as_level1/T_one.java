package _09_Class_Test2.as_level1;

public class T_one {
//	private String tNum = null;		// 멤버변수를 은닉화하는 방법(다른 class에서 직접 접근하지 못하도록)
	String tNum = null;
	String tTime = null;
	
	public void prt() {		// 메소드 유형 1: 실행만 하려는 것
		// void라는 성격은 호출한 쪽에 결과물을 넘겨줄 필요없이, 실행만 하면 되는 것
		System.out.println("----기차 전체 조회----");
		System.out.println("기차 번호 : "+tNum);
		System.out.println("기차 시간 : "+tTime);
	}
	
	public String gettNum() {	// 메소드 유형 2: 실행하고 결과물을 받으려는 것
		// String의 성격은 String의 자료형(문자열)을 결과값으로 호출한 쪽에 넘겨줘야한다는 것
		return tNum;
	}
}
