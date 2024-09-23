package _09_Class_Test3;

public class Event_one {
	
	private String e_name = "";
	private String e_comment = "";

	public Event_one() {
		
	}
	
	public void prt() {			// 이벤트 목록을 조회했을 때 보여줄 기능의 메소드 정의
		System.out.println("---등록된 이벤트입니다.---");
		System.out.println("이벤트 제목: "+e_name+" / 이벤트 내용: "+e_comment);
	}
	
	public void event_name(String a) {		
		// 이벤트 등록시에 입력받은 이벤트 제목을 멤버변수 e_name에 저장하기 위하여 값을 받는 기능의 메소드 정의
		e_name = a;
	}
	
	public void evet_comment(String a) {
		// 이벤트 등록시에 입력받은 이벤트 내용을 멤버변수 e_comment에 저장하기 위하여 값을 받는 기능의 메소드 정의
		e_comment = a;
	}
	
	public String evt_name() {
		// 멤버변수 e_name에 저장된 값을 호출시에 반환해줄 메소드를 정의
		return e_name;
	}
	
	public String evt_comment() {
		// 멤버변수 e_comment에 저장된 값을 호출시에 반환해줄 메소드를 정의
		return e_comment;
	}

}
