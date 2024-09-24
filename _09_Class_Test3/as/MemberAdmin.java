package _09_Class_Test3.as;

import java.util.Scanner;

// 고객관리 클래스
public class MemberAdmin {
	// 의존관계 설정, 중요한 것은 MemeberOne객체를 만든 것이 아니다.
	// MemberOne 객체의 주소값을 저장할 배열(길이 5)를 생성한 것이다.
	// 배열도 객체입니다.. mlist는 참조변수이고 MemberOne객체의 주소를
	// 저장한 배열의 주소를 저장하고 있다.
	MemberOne [] mlist = new MemberOne[5];
	
	MemberAdmin() {
		 
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객 등록");
			System.out.println("2. 전체보기");
			System.out.println("9. 이전 메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addUser();
			}else if(num==2) {
				allListUser();
			}else if(num==9) {
				break;	// while문 종료
			}
		}
	}
	
	private void addUser() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		MemberOne temp = new MemberOne();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		temp.id = id;
		if(duplexIDcheck(id)) {		// 아이디 중복체크		
			// call -> 실행 -> 리턴
			System.out.println("아이디 중복입니다. 다시 입력하세요.");
//			addUser();
		}else {
			System.out.println("이름을 입력하세요.");
			String name = in.nextLine();
			temp.name = name;
			
			for (int i = 0; i < mlist.length; i++) {
				if(mlist[i]==null) {
					mlist[i]=temp;
					break;
				}       
			}
			temp=null;	// temp에 저장된 주소값이 필요없어서 null처리
//				in.close();	// Scanner에 필요한 자원 반납
			
		}
	}
	private void allListUser() {
		// TODO Auto-generated method stub
		for (int i = 0; i < mlist.length; i++) {
			if(mlist[i]!=null) {
				mlist[i].prt();
			}
		}
	}
	
	// 재사용성을 높이기 위하여 아이디 중복체크를 해주는 메소드를 정의하여 사용
	public boolean duplexIDcheck(String id){		// 재사용성을 높이기 위하여 아이디 중복체크를 해주는 메소드를 정의
		for (int i = 0; i < mlist.length; i++) {
			if(mlist[i]!=null) {
				if(mlist[i].id.equals(id)) {
					return true;
					// return을 만나면 함수 종료되고
					// 호출부로 이동된다. break필요없음
					// 즉, 호출부로 값을 들고 이동하는 것 자체가 break기능을 포함.
				}
			}
		}
		return false;
	}
}
