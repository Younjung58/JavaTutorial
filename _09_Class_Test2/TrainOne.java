package _09_Class_Test2;

// 하나의 기차에 대한 정보를 관리할 클래스 정의
public class TrainOne {
	
	// 하나의 기차 정보에 필요한 멤버변수 선언
	int train_num = 0;
	String train_cate = "";
	String train_arrtime = "";
	String train_status = "";
	
	public void prt() {		// 기차의 전체 정보 조회를 위한 메소드 정의
		System.out.println(train_num+" : "+train_cate+" : "+train_arrtime);
	}
	public void fix() {		// 기차 수리 정보 조회를 위한 메소드 정의
		System.out.println("수리중인 기차번호 : " + train_num + " / 기차의 상태 : "+train_status);
	}

}
