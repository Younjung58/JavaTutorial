package _09_Class_Test3;

import java.util.Scanner;

public class Manage_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer_all custom = new Customer_all();	
		Event_all event = new Event_all();
		// 고객과 이벤트의 정보가 저장되어있어야하므로 하나의 객체의 주소로 각각을 저장하여 해당 메소드를 사용하는 개념으로 작성
		
		System.out.println("*****고객관리 및 이벤트관리 프로그램*****");
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
