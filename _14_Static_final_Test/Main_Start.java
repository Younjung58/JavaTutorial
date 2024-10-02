package _14_Static_final_Test;

import java.util.Scanner;

public class Main_Start {
	
	Student_All student = null;
	Class_All study = null;
	Log_Main login = null;
	
	Main_Start(){
		if(student == null) {
			student = new Student_All();
		}
		if(study == null) {
			study = new Class_All();
		}
		if(login == null) {
			login = new Log_Main();
		}
		login.getStudent(student);
		login.getClass(study);
	}
	
	public void main() {
		while(true) {
			System.out.println("1. 학생관리 시스템");
			System.out.println("2. 교과목 관리 시스템");
			System.out.println("3. 학생 로그인");
			System.out.println("4. 프로그램 종료");
			System.out.println("\n ▷ 원하는 항목을 입력하세요.");
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			
			if(sel == 1) {
				student.main();
			}else if(sel == 2) {
				study.main();
			}else if(sel == 3) {
				login.main();
			}else if(sel == 4) {
				break;
			}else {
				System.out.println("올바르지 않은 입력입니다. 다시 입력하세요.");
			}
		}
	}

}
