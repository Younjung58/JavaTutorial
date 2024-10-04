package _14_Static_final_Test_as;

import java.util.ArrayList;
import java.util.Scanner;

//요구사항에서 학생을 관리하는 내용을 추상화
public class StuMge {

	// 학생관리를 하려면 학생이라는 객체가 필요하여 의존관계 생성
	private ArrayList<Stu> slist = new ArrayList<>();

	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 3) {
				list();
			}else if(selNum == 4) {
				delete();
			}else {
				break;
			}
		}
	}

	// 학생 전체 리스트 확인
	private void list() {
		for (int i = 0; i < slist.size(); i++) {
			slist.get(i).prt();
		}
	}

	// 학생 추가
	private void add() {
		Scanner in = new Scanner(System.in);
		Stu newTemp = new Stu();
		System.out.println("아이디 입력");
		String id = in.nextLine();
		int resultValue = findID(id);
		if(resultValue == -1) {
			System.out.println("이름 입력");
			String name = in.nextLine();
			newTemp.setId(id);
			newTemp.setName(name);
			slist.add(newTemp);			
		}else {
			System.out.println(id+"는 사용중");
		}
		
	}

	// 학생 검색
	private void search() {

	}

//	private 리턴타입? findID(매개변수?) {
	private int findID(String d){
		for (int i = 0; i < slist.size(); i++) {
			if(slist.get(i).getId().equals(d)) {
				return i;
			}
		}
		return -1;
	}
	
	// 학생 삭제
	private void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제 아이디 입력");
		String delId = in.nextLine();
		
//		slist.get(0).getId().equals(delId);
		// -> slist를 참조하여 0번째에 저장된 Stu 객체의 주소를 가져와 -> 그 주소를 참조하여 getId() 메소드를 호출해서 리턴값으로 리턴타입이 String인 id받아와
		//  -> 그 String에서 equals의 메소드 호출해서 delID를 매개변수로 넘겨주고 리턴값으로 리턴타입이 boolean인 true/ false를 받아와
		// 위와같이 나누어서 과정의 흐름대로 해석할 것.
		// 위와 같은 사고가 끝났으면, 배열의 모든값을 이런식으로 비교해야한다는 사고 ->  for문으로 최종작성
		
		// for문은 아이디를 찾는 반복문
		// 아이디를 찾는다는 것은, 검색이나 입력에서도 응용할 수 있다.
		// 그래서 이 코드의 재사용성을 높이기 위해서 메서드 분리
//		for (int i = 0; i < slist.size(); i++) {
//			if(slist.get(i).getId().equals(delId)) {
//				slist.remove(i);
//			}
//		}
		int returnValue = findID(delId);
		if(returnValue!=-1) {
			slist.remove(returnValue);		
			System.out.println("삭제됨");
		}else {
			System.out.println("해당 아이디는 등록되어있지 않습니다.");
		}
		
	}
	
	public Stu loginID(String id) {
		int idx = findID(id);
		if(idx != -1) {
			return slist.get(idx);
		}
		return null;
	}

}