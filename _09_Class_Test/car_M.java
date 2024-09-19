package _09_Class_Test;

import java.util.Scanner;

// 자동차 등록, 조회, 전체보기, 삭제의 기능을 수행할 클래스 생성(car_M)
public class car_M {
	car_R [] carinfo = new car_R [7];
	// 자동차 7대를 저장할 배열 공간 생성(참조변수로 배열 생성시 초기값이 null)
	Scanner in = new Scanner(System.in);
		car_M() {
			while(true) {
			System.out.println("아래 옵션 중 원하는 번호를 선택하세요.");
			System.out.println("1. 자동차 등록");
			System.out.println("2. 자동차 조회");
			System.out.println("3. 자동차 전체보기");
			System.out.println("4. 자동차 삭제");
			int Num = in.nextInt();
			in.nextLine();
			if(Num==1) {
				add();
			}else if(Num==2) {
				Search();
			}else if(Num==3) {
				allList();
			}else if(Num==4) {
				Delete();
			}else {
				break;
			}
		}
	}
		public void add() {		// 차량 등록 메소드 생성
			car_R a = new car_R();
			System.out.println("등록할 자동차의 번호를 입력하세요(번호4자)");
			a.car_num = in.nextInt();
			in.nextLine();
			System.out.println("소유주의 이름을 입력하세요.");
			a.car_owner = in.nextLine();
			System.out.println("소유주의 나이를 입력하세요.");
			a.car_ownerage = in.nextInt();
			in.nextLine();
			for (int i = 0; i < carinfo.length; i++) {
				if(carinfo[i]==null) {
					carinfo[i] = a;
					break;
				}
			}
		}
		
		public void Search() {	// 차량 조회 메소드 생성
			System.out.println("조회할 차량 번호를 입력하세요(번호4자");
			int a = in.nextInt();
			for (int i = 0; i < carinfo.length; i++) {
				if(a==carinfo[i].car_num) {
					System.out.println("조회한 차량의 정보는 아래와 같습니다.");
					carinfo[i].prt();
					break;
				}
			}
		}
		
		public void allList() {		// 전체조회 메소드 생성
			System.out.println("전체조회를 선택하셨습니다.");
			for (int i = 0; i < carinfo.length; i++) {
				if(carinfo[i]!=null) {
					carinfo[i].prt();
				}
			}
		}
		
		public void Delete() {	// 차량 삭제 메소드 생성
			System.out.println("삭체할 차량의 번호를 입력하세요(번호 4자)");
			int a = in.nextInt();
			for (int i = 0; i < carinfo.length; i++) {
				if(a==carinfo[i].car_num) {
					carinfo[i] = null;
					break;
				}
			}
		}
		
}
