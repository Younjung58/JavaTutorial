package _09_Class_Test2.as_level2;

import java.util.Scanner;

public class T_center {
	
	Company_T infoT = null;
	T_one[] tlist = new T_one[5];
	
	public T_center() { // 생략이 된 상태
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.println("메뉴선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				mod();
			}else if(selNum == 3) {
				listAll();
			}else if(selNum == 4) {
				break;
			}
		}
	}

	private void listAll() {
		// TODO Auto-generated method stub
		
	}

	private void mod() {
		// TODO Auto-generated method stub
		
	}

	private void add() {
		// TODO Auto-generated method stub
		
	}
}
