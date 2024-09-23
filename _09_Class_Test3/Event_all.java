package _09_Class_Test3;

import java.util.Scanner;

public class Event_all {
	// 이벤트 전체를 관리할 class정의
	
	// 최대 이벤트 등록수가 5개라고 정의 -> 그 주소를 저장하기 위하여 길이가 5인 배열을 사용하여 선언
	Event_one [] evt = new Event_one[5];
		
	Scanner in = new Scanner(System.in);
	
	public void Event_all() {
		// TODO Auto-generated constructor stub
		
		while(true) {
			System.out.println("*****이벤트관리 프로그램입니다.*****");
			System.out.println("1. 이벤트 등록하기");		// level 2의 기능추가
			System.out.println("2. 이벤트 전체보기");		// level 2의 기능추가
			System.out.println("3. 메인화면으로 돌아가기");
			System.out.println("원하는 항목을 선택하여 번호를 입력하세요 > ");
			
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum==1) {
				add_E();
			}else if(selNum==2) {
				allList_E();
			}else if(selNum==3) {
				break;
			}
		}
	}
	
	private void add_E() {		// 이벤트 등록하기 기능의 메소드를 정의
		// TODO Auto-generated method stub
		Event_one event = new Event_one();
		System.out.println("*이벤트 등록을 선택하셨습니다.* ");
		System.out.println("이벤트 제목을 입력하세요. > ");
		String a = in.nextLine();
		event.event_name(a);
		System.out.println("이벤트 내용을 입력하세요. > ");
		a = in.nextLine();
		event.evet_comment(a);
		for (int i = 0; i < evt.length; i++) {
			if(evt[i] == null) {
				evt[i] = event;
				break;
			}
		}
	}

	private void allList_E() {		// 이벤트 전체보기 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*이벤트 전체보기를 선택하셨습니다.*");
		for (int i = 0; i < evt.length; i++) {
			if(evt[i]!=null) {
				evt[i].prt();
			}else {
				break;
			}
		}
		
	}

}
