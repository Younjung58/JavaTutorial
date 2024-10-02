package _14_Static_final_Test;

import java.util.ArrayList;

public class Student_One {
	private String id = null;
	private String name = null;
	private String number = null;
	private int grade = 0;
	public static final int MAXSTUDENT = 10;
	public ArrayList<String> sugangList = new ArrayList<>();
	
	public void main() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void student(){
		System.out.println("아이디: "+id+" / 이름: "+name+" / 전화번호: "+number+" / 학년 : "+grade+" / 현재 신청과목수: "+sugangList.size());
		System.out.println("-----------------------------");
	}
	
	public void sugang() {
		System.out.println("---현재 수강 신청한 과목 내역---");
		for (int i = 0; i < sugangList.size(); i++) {
			System.out.println((i+1)+"."+"\n"+sugangList.get(i));
		}
	}
	
}
