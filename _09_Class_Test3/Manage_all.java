package _09_Class_Test3;

import java.util.Scanner;

public class Manage_all {

	// 최대 고객이 5명이라고 정의 -> 그 주소를 저장하기 위하여 길이가 5인 배열을 사용하여 선언
	Customer_one [] cus = new Customer_one[5];
	
	// 최대 이벤트 등록수가 5개라고 정의 -> 그 주소를 저장하기 위하여 길이가 5인 배열을 사용하여 선언
	Event_one [] evt = new Event_one[5];
	
	Scanner in = new Scanner(System.in);
	public Manage_all() {
		
		while(true) {
		// TODO Auto-generated constructor stub
			System.out.println("1. 고객 가입하기");
			System.out.println("2. 고객 정보보기");
			System.out.println("3. 고객 정보수정하기");
			System.out.println("4. 고객 정보삭제하기");
			System.out.println("5. 이벤트 등록하기");		// level 2의 기능추가
			System.out.println("6. 이벤트 전체보기");		// level 2의 기능추가
			System.out.println("7. 서비스 종료하기");
			System.out.println("원하는 항목을 선택하여 번호를 입력하세요 > ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum == 1) {
				add_C();
			}else if(selNum == 2) {
				view_C();
			}else if(selNum == 3) {
				mod_C();
			}else if(selNum == 4) {
				del_C();
			}else if(selNum == 5) {
				add_E();
			}else if(selNum == 6) {
				allList_E();
			}else if(selNum == 7) {
				break;
			}
		}
	}
	
	private void add_C() {		// 고객 가입 기능의 메소드를 정의
		// TODO Auto-generated method stub
		Customer_one customer = new Customer_one();		// 고객한명의 정보를 저장하기 위해서 생성한 객체의 주소 저장할 참조변수 customer에 저장
		System.out.println("*고객 가입을 선택하셨습니다.*");
		System.out.println("고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
		customer.customer_id(a);
		System.out.println("고객의 이름을 입력하세요.");
		a=in.nextLine();
		customer.cutomer_name(a);
		for (int i = 0; i < cus.length; i++) {
			if(cus[i]==null) {
				cus[i] = customer;
				break;
			}
		}
	}
	
	private void view_C() {		// 고객 정보 조회 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보보기를 선택하셨습니다.*");
		System.out.println("조회를 원하시는 고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
		for (int i = 0; i < cus.length; i++) {		// 고객 아이디는 중복이 안되고, 유니크하다고 가정
			if(cus[i]!=null) {
				if(cus[i].cus_id().equals(a)) {
					cus[i].prt();
					break;
				}
			}
			if(i==cus.length-1) {
				System.out.println("해당 아이디는 존재하지 않습니다.");
				break;
			}
		}	
	}
	
	private void mod_C() {		// 고객 정보 변경 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보변경을 선택하셨습니다.*");
		System.out.println("변경을 원하시는 고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
		for (int i = 0; i < cus.length; i++) {
			if(cus[i]!=null) {
				if(cus[i].cus_id().equals(a)) {
					System.out.println("변경하실 고객의 아이디를 입력하세요.(현재 아이디: "+cus[i].cus_id()+")");
					a = in.nextLine();
					cus[i].customer_id(a);
					System.out.println("변경하실 고객의 이름을 입력하세요.(현재 고객명: "+cus[i].cus_name()+")");
					a=in.nextLine();
					cus[i].cutomer_name(a);
					break;
				}
			}
			if(i == cus.length-1) {
				System.out.println("해당 아이디는 존재하지 않습니다.");
				break;
			}
		}
	}

	private void del_C() {		// 고객 정보 삭제 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보삭제를 선택하셨습니다.*");
		System.out.println("삭제를 원하시는 고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
		for (int i = 0; i < cus.length; i++) {		// 고객 아이디는 중복이 안되고, 유니크하다고 가정
			if(cus[i]!=null) {
				if(cus[i].cus_id().equals(a)) {
					cus[i]=null;
					break;
				}
			}
			if(i==cus.length-1) {
				System.out.println("해당 아이디는 존재하지 않습니다.");
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
