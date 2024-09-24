package _09_Class_Test3;

// 고객 각각의 정보를 관리할 class
public class Customer_one {
	
	private String c_id = "";
	private String c_name = "";
	
	public Customer_one() {
		// TODO Auto-generated constructor stub
	}
	
	public void prt() {		// 고객 정보를 보여줄 메소드를 정의
		System.out.println("---해당 고객의 정보입니다---");
		if(c_id.equals())
		
		
		System.out.println("고객의 아이디: "+c_id+" / 고객의 이름: "+c_name);
	}
	
	public void customer_id(String a) {		
		// 고객 등록시에 입력받은 아이디 값을 멤버변수 c_id에 저장하기 위하여 값을 받는 기능의 메소드 정의
		c_id = a;
	}
	
	public void cutomer_name(String a) {
		// 고객 등록시에 입력받은 이름 값을 멤버변수 c_name에 저장하기 위하여 값을 받는 기능의 메소드 정의
		c_name = a;
	}
	
	public String cus_id() {
		// 멤버변수 c_id에 저장된 값을 호출시에 반환해줄 메소드를 정의
		return c_id;
	}
	
	public String cus_name() {
		// 멤버변수 c_name에 저장된 값을 호출시에 반환해줄 메소드를 정의
		return c_name;
	}

}
