package _09_Class_Test3;

import java.util.Scanner;

import _09_Class_Test3.as.EventAdmin;
import _09_Class_Test3.as.MemberAdmin;

public class Manage_main {
	
	// 의존관계 설정 시작
	Customer_all custom = null;	
	Event_all event = null;
	// 고객과 이벤트의 정보가 저장되어있어야하므로 하나의 객체의 주소로 각각을 저장하여 해당 메소드를 사용하는 개념으로 작성
	// 하나의 객체의 주소만을 생성하여 그 주소값으로 계속 호출하면 그 클래스의 멤버변수에 저장된 값이 유지되므로 
	// 멤버변수로 객체를 생성하여 주소값을 저장
	
	// 의존관계 변수만 설정하고 주소를
		// 저장하는 방법은 직접 객체를 만들거나
		// 주소를 주입받는 방식이 있으니
		// 이 부분을 생각해서 공부하자
	// 의존관계 설정 끝
	
	Manage_main(){
			// 생성자 -> 초기화 작업을 할 때 많이 사용함
			// 초기화 작업은 멤버변수의 값을 셋팅하는 느낌
			// 예) 데이터베이스에서 값을 가져와서 초기값 결정
			// 메뉴는 초기화 작업이라고 보기 어렵다.
			// 별도로 메서드 처리 하겠다.
		if(custom == null) {
			custom = new Customer_all();
		}
		if(event == null) {
			event = new Event_all();
		}
		custom.save(event);
		event.c_name(custom);
		prt();
	}
	
	public void prt() {
		while(true) {
			System.out.println("+++메인화면 입니다.+++");
			System.out.println("1. 고객관리 서비스");
			System.out.println("2. 이벤트관리 서비스");
			System.out.println("3. 서비스 종료하기");
			System.out.println("원하시는 항목의 번호를 선택하세요. > ");
			
			Scanner in = new Scanner(System.in);
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				custom.Customer_all();		// 메서드를 호출	
			}else if(selNum==2) {
				event.Event_all();			// 메서드를 호출
			}else if(selNum==3) {
				break;
			}	
		}
	}
	
	

}