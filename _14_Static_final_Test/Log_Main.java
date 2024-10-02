package _14_Static_final_Test;

import java.util.Scanner;

public class Log_Main {
	Student_All stu = null;
	Class_All cls = null;
	Scanner in = new Scanner(System.in);
	Sugang_List sugang = null;
	int a = 0;
	
	public void main() {
		System.out.println("-----LOG IN-----");
		login();
	}
	private void login() {
		boolean flag = false;
		while(true) {
			System.out.println("아이디 입력: ");
			System.out.println("\n ▷ ");
			String id = in.nextLine();
			for (int i = 0; i < stu.students.size(); i++) {
				if(stu.students.get(i).getId().equals(id)) {
					flag = true;
					a = i;
				}
			}
			if(flag) {
				System.out.println("이름 입력: ");
				System.out.println("\n ▷ ");
				String name = in.nextLine();
				if(stu.students.get(a).getName().equals(name)) {
					System.out.println("🌟 로그인 되었습니다 🌟  ----- 어서오세요! "+name+"님!");
					System.out.println("----원하는 항목을 선택하세요.----");
					while(true) {
						System.out.println("1. 수강신청 메뉴 / 2. 나의 신청리스트 메뉴 / 3. 메인메뉴로 ");
						int sel = in.nextInt();
						if(sel == 1) {
							sugangMenu();
						}else if(sel == 2) {
							registerList();
						}else if(sel == 3) {
							break;
						}else {
							System.err.println("올바르지 않은 입력입니다. 다시 입력해주세요.");
						}
					}
					break;
				}else {
					System.err.println("아이디와 이름이 일치하지 않습니다. 다시 입력하세요.");
				}
			}else {
				System.err.println("해당 아이디는 존재하지 않습니다. 다시 입력하세요.");
			}
			
		}
	}
	private void sugangMenu() {
		sugang = new Sugang_List();
		sugang.getStu(stu.students.get(a));
		sugang.getClass(cls);
		sugang.sugang();
	}
	private void registerList() {
		System.out.println("-----나의 신청 LIST------");
		System.out.println(stu.students.get(a).getId()+"님이 현재 신청한 목록입니다.");
		stu.students.get(a).sugang();
	}
	
	public void getStudent(Student_All stu) {
		this.stu = stu;
	}
	public void getClass(Class_All cls) {
		this.cls = cls;
	}
}
