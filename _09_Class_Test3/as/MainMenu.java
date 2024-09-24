package _09_Class_Test3.as;

import java.util.Scanner;

public class MainMenu {
	// 의존관계 설정 시작
	EventAdmin eventAdm = null;
	MemberAdmin memberAdm = null;
		// 의존관계 변수만 설정하고 주소를
		// 저장하는 방법은 직접 객체를 만들거나
		// 주소를 주입받는 방식이 있으니
		// 이 부분을 생각해서 공부하자
	// 의존관계 설정 끝
	
	MainMenu(){
		// 생성자 -> 초기화 작업을 할 때 많이 사용함
		// 초기화 작업은 멤버변수의 값을 셋팅하는 느낌
		// 예) 데이터베이스에서 값을 가져와서 초기값 결정
		// 메뉴는 초기화 작업이라고 보기 어렵다.
		// 별도로 메서드 처리 하겠다.
		if(eventAdm == null) {
			eventAdm = new EventAdmin();
		}
		if(memberAdm == null) {
			memberAdm = new MemberAdmin();
		}
		menu();
	}
	private void menu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객 관리");
			System.out.println("2. 이벤트 관리");
			System.out.println("3. 프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
//				memberAdm = new MemberAdmin();
				memberAdm.menu();
			}else if(num==2) {
//				eventAdm = new EventAdmin();
				eventAdm.menu();
			}else if(num==3) {
				break;	// while문 종료
			}
		}
	}
}
