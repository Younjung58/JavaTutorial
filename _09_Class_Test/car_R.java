package _09_Class_Test;

// 자동차 각각의 정보(차번호와 소유자의 정보)를 저장할 클래스 생성(car_R)
public class car_R {
	// 필요한 멤버변수 선언
	int car_num = 0;	// 차번호
	String car_owner = "";	// 소유주명
	int car_ownerage = 0;	// 소유주나이
	
	// 정보 조회시 실행될 부분 작성
	public void prt() {
		System.out.println("----자동차 조회----");
		System.out.println("자동차 번호는: "+car_num);
		System.out.println("자동차 소유주: "+car_owner);
		System.out.println("자동차 소유주 나이: "+car_ownerage);
	}
}
