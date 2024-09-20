package _09_Class_Test.as;

import java.util.Scanner;

public class CarCenter {
	CarOne [] carList = new CarOne[7];
	Scanner in = new Scanner(System.in);
	// 위 선언시에 사용한 변수는 멤버변수임.
	CarCenter(){
		int selNum = 0;
		// 위 선언시에 사용한 변수는 지역변수임.(메소드 종료시 소멸됨)
		// 생성자 메소드가 있을때만 생성됨(필요할때만 할당해서 사용)
		while(true) {
			menu();
			System.out.println("번호 선택>");
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				carAdd();
			}else if(selNum == 2) {
				carDel();
			}else if(selNum == 3) {
				carMod();
			}else if(selNum == 4) {
				carList();
			}else if(selNum == 5){
				break;
			}
		}
	}
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 전체보기");
		System.out.println("5. 종료");
	}
	public void carAdd() {
		// 순서
		// 새로운 차를 만든다.		new Carone()
		// 차에다가 값을 저장한다.
		// 차를 배열에 등록한다.		carList[]
		CarOne temp = new CarOne();
		System.out.println("자동차번호를 입력하세요.");
		temp.carNumber = in.nextLine();
		System.out.println("자동차 소유자 이름을 입력하세요.");
		temp.carUser = in.nextLine();
		// 배열에 저장...
		// 빈칸을 찾자 빈칸은 배열의 value값이 null이다.
		for (int i = 0; i < carList.length; i++) {
			if(carList[i]==null) {
				carList[i]=temp;		
				break;
			}
		}
	}
	public void carList() {
		// 메서드의 정의는 정의가 구체적인 것이 좋다.
		// carList 배열 참조변수의 0번부터 순회하면서
		// 저장된 주소값을 참조하여 carOne 객체의 정보를 출력
		for (int i = 0; i < carList.length; i++) {
			if(carList[i]!=null) {
//				System.out.println(carList[i].carNumber);
//				System.out.println(carList[i].carUser);
				// 각 정보마다 모두 참조해야하므로 객체가 참조할 주소에 전체정보를 조회하는 하나의 메소드를 정의해놓음
				carList[i].prt();  // 객체의 주소에 대해 전체정보 조회의 메소드를 참조
			}
		}
	}
	public void carMod() {
		// 시나리오 정의
		// 번호로 수정할 자동차 객체를 찾는다.
		// 번호는 수정이 불가능 / 삭제만 할 수 있고, 소유자이름만 수정이 가능
		System.out.println("수정할 자동차 번호를 입력하세요.");
		String a = in.nextLine();
		// 객체 찾기 > 배열순회 필요
		for (int i = 0; i < carList.length; i++) {
			if(carList[i] != null) {
				if(carList[i].carNumber.equals(a)) {
					System.out.println("아래 항목 중 원하는 번호를 입력하세요.");
					System.out.println("1. 등록 차량을 삭제 / 2. 소유자명 변경");
					int select = in.nextInt();
					in.nextLine();
					if(select==1) {		// 삭제 선택시 해당 등록 내용 삭제
						carList[i] = null;
						break;
					}else if(select==2) {	// 소유자명 변경 선택시 새로 이름 등록
						System.out.println("변경할 소유자명을 입력하세요.");
						String name = in.nextLine();
						// 입력된 값의 유효성을 체크 하는 등
						// 무결성 코드 추가가가능
						carList[i].carUser = name;
						break;						
					}else {
						break;
					}
				}
			}
		}
	}
	public void carDel() {
		// 시나리오 정의
		// 번호로 삭제할 자동차 객체를 찾는다. 그리고 삭제
		System.out.println("삭제할 자동차 번호를 입력하세요.");
		String delNumber = in.nextLine();
		// 객체찾기 > 배열순회 필요
		for (int i = 0; i < carList.length; i++) {
			if(carList[i]!=null) {
				if(carList[i].carNumber.equals(delNumber)) {
					carList[i]=null;
					break;
				}
			}
		}
	}
	
	
}
