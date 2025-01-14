package _09_Class_Test3_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_all {

	// 최대 고객이 5명이라고 정의 -> 그 주소를 저장하기 위하여 길이가 5인 배열을 사용하여 선언
//	Customer_one [] cus = new Customer_one[5];
	
	// 위 배열의 형태를 ArrayList 자료형으로 변경하여 전체 코드 재작성 해보기 *****
	ArrayList<Customer_one> clist = new ArrayList<>();
	Customer_one id = null;
	Scanner in = new Scanner(System.in);
	Event_all a = null;
	public void Customer_all() {
		while(true) {
			save(a);
		// TODO Auto-generated constructor stub
			System.out.println("*****고객관리 프로그램입니다.*****");
			System.out.println("1. 고객 가입하기");
			System.out.println("2. 고객 정보보기");
			System.out.println("3. 고객 정보수정하기");
			System.out.println("4. 고객 정보삭제하기");
			System.out.println("5. 등록된 이벤트 보기");
			System.out.println("6. 메인화면으로 돌아가기");
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
//				save(a);
				a.allList_E();
			}else if(selNum == 6) {
				break;
			}
		}
	}
	

	public void save(Event_all event) {	// Manage_main class에서 생성된 event의 주소를 받을 메서드 정의
		// TODO Auto-generated method stub
		a = event;
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
//		for (int i = 0; i < cus.length; i++) {
//			if(cus[i]==null) {
//				cus[i] = customer;
//				break;
//			}
//		}
		clist.add(customer);
		
	}
	
	private void view_C() {		// 고객 정보 조회 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보보기를 선택하셨습니다.*");
		System.out.println("조회를 원하시는 고객의 아이디를 입력하세요. > ");
		String b = in.nextLine();
//		save(a);
//		for (int i = 0; i < cus.length; i++) {		// 고객 아이디는 중복이 안되고, 유니크하다고 가정
//			if(cus[i]!=null) {
//				if(cus[i].cus_id().equals(b)) {
//					cus[i].prt();
//					for (int j = 0; j < a.evt.length; j++) {
//						if(a.evt[j]!=null) {
//							if(b.equals(a.evt[j].member_id())) {
//								a.evt[j].prt();
//							}							
//						}
//					}
//					break;
//				}
//			}
//			if(i==cus.length-1) {
//				System.out.println("해당 아이디는 존재하지 않습니다.");
//				break;
//			}
//		}
		for (int i = 0; i < clist.size(); i++) {
			if(clist.get(i).cus_id().equals(b)) {
				clist.get(i).prt();
				for (int j = 0; j < a.evt.length; j++) {
					if(a.evt[j]!=null) {
						if(b.equals(a.evt[j].member_id())) {
							a.evt[j].prt();
						}							
					}
				}
				break;
			}
		}
		
	}
	
	private void mod_C() {		// 고객 정보 변경 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보변경을 선택하셨습니다.*");
		System.out.println("변경을 원하시는 고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
//		for (int i = 0; i < cus.length; i++) {
//			if(cus[i]!=null) {
//				if(cus[i].cus_id().equals(a)) {
//					System.out.println("변경하실 고객의 아이디를 입력하세요.(현재 아이디: "+cus[i].cus_id()+")");
//					a = in.nextLine();
//					cus[i].customer_id(a);
//					System.out.println("변경하실 고객의 이름을 입력하세요.(현재 고객명: "+cus[i].cus_name()+")");
//					a=in.nextLine();
//					cus[i].cutomer_name(a);
//					break;
//				}
//			}
//			if(i == cus.length-1) {
//				System.out.println("해당 아이디는 존재하지 않습니다.");
//				break;
//			}
//		}
		for (int i = 0; i < clist.size(); i++) {
			if(clist.get(i).cus_id().equals(a)) {
				System.out.println("변경하실 고객의 아이디를 입력하세요.(현재 아이디: "+clist.get(i).cus_id()+")");
				a = in.nextLine();
				clist.get(i).customer_id(a);
				System.out.println("변경하실 고객의 이름을 입력하세요.(현재 고객명: "+clist.get(i).cus_name()+")");
				a=in.nextLine();
				clist.get(i).cutomer_name(a);
			}
		}
	}

	private void del_C() {		// 고객 정보 삭제 기능의 메소드를 정의
		// TODO Auto-generated method stub
		System.out.println("*고객 정보삭제를 선택하셨습니다.*");
		System.out.println("삭제를 원하시는 고객의 아이디를 입력하세요. > ");
		String a = in.nextLine();
//		for (int i = 0; i < cus.length; i++) {		// 고객 아이디는 중복이 안되고, 유니크하다고 가정
//			if(cus[i]!=null) {
//				if(cus[i].cus_id().equals(a)) {
//					cus[i]=null;
//					break;
//				}
//			}
//			if(i==cus.length-1) {
//				System.out.println("해당 아이디는 존재하지 않습니다.");
//				break;
//			}				
//		}
		for (int i = 0; i < clist.size(); i++) {
			if(clist.get(i).cus_id().equals(a)) {
				clist.remove(i);
			}
		}
	}

	
}