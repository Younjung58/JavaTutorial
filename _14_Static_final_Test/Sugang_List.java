package _14_Static_final_Test;

import java.util.Scanner;

public class Sugang_List {
	
	Scanner in = new Scanner(System.in);
	String id = null;
	String cname = null;
	Student_One stu = null;
	Class_All cls = null;
	
	public void sugang() {
		id = stu.getId();
		System.out.println(id+"님 어서오세요!");
		boolean flag = false;
		System.out.println("-----수강신청 MENU------");
		System.out.println("아래 강의는 현재 등록된 강의 목록입니다.");
		while(true) {
			cls.classAllList();
			System.out.println("위 강의 중 수강신청을 원하시는 강의의 '과목명'을 입력하세요.");
			String name = in.nextLine();
			for (int i = 0; i < cls.studies.size(); i++) {
				if(cls.studies.get(i).getCname().equals(name)) {
					flag = true;
				}
			}
			if(flag) {
				System.out.println(name+"  ---> 해당 과목을 수강신청 하시겠습니까? (Y / N)");
				String ans = in.nextLine();
				if(ans.equals("Y")||ans.equals("y")) {
					stu.sugangList.add(name);
					System.out.println("아래와 같이 수강신청이 완료되었습니다.");
					System.out.println("학생 아이디: "+stu.getId()+" / 수강신청 과목: "+name);
					break;
				}
			}else {
				System.err.println("해당 과목은 존재하지 않습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void getStu(Student_One stu) {
		this.stu = stu;
	}
	public void getClass(Class_All cls) {
		this.cls = cls;
	}
}
