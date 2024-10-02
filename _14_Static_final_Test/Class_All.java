package _14_Static_final_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_All {
	
	Scanner in = new Scanner(System.in);
	ArrayList<Class_One> studies = new ArrayList<>();
	Class_One study = null;
	
	public void main() {
		while(true) {
			System.out.println("1. 교과목 등록하기");
			System.out.println("2. 교과목 조회하기");
			System.out.println("3. 메인화면으로");
			System.out.println("\n ▷ 원하는 항목을 입력하세요.");
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			
			if(sel == 1) {
				addClass();
			}else if(sel == 2) {
				classAllList();
			}else if(sel == 3) {
				break;
			}else {
				System.out.println("올바르지 않은 입력입니다.");
			}
		}
	}
	
	private boolean checkCname(String cname) {
		for (int i = 0; i < studies.size(); i++) {
			if(studies.get(i).getCname().equals(cname)) {
				return false;
			}
		}
		return true;
	}
	
	private void addClass() {
		// TODO Auto-generated method stub
		boolean flag = false;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("등록을 원하는 과목명을 입력하세요.");
			String cname = in.nextLine();
			flag = checkCname(cname);
			if(flag) {
				study = new Class_One();
				study.setCname(cname);
				break;
			}else {
				System.err.println("해당 과목명은 이미 존재하므로 등록 불가합니다. 다시입력하세요.");
			}
		}
		while(flag) {
			System.out.println("해당 과목의 강의실을 입력하세요.('000호' 의 형식으로 입력)");
			String cclass = in.nextLine();
			if(cclass.lastIndexOf("호")==(cclass.length()-1)) {
				study.setCclass(cclass);
				break;
			}else {
				System.err.println("올바르지 않은 입력방식입니다. 다시 입력하세요.");
			}
		}
		while(flag) {
			System.out.println("해당 과목의 담당교수명을 입력하세요.");
			String ctname = in.nextLine();
			study.setCtname(ctname);
			break;
		}
		studies.add(study);
		System.out.println("아래와같이 과목 등록이 완료되었습니다 🌟");
		studies.get(studies.size()-1).classAll();
		
	}

	public void classAllList() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("현재 등록되어있는 과목 목록입니다.");
		for (int i = 0; i < studies.size(); i++) {
			studies.get(i).classAll();
		}
	}
}
