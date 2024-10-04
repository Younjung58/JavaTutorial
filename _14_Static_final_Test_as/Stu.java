package _14_Static_final_Test_as;

import java.util.ArrayList;
import java.util.Scanner;

//변수, 자료형, class와 객체, 추상화, 메서드, 접근제어자

//추상화 요구사항의 학생을 멤버변수와 메서드로 정의
public class Stu {
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade = -1;
	private PartMge partMge = null;

	// 로그인하면 수강신청 목록을 가지고있어야 하므로, 객체를 생성한다.
	// 관리자가 아닌 학생 한 명이 신청하고 목록보는 것으로 학생 한 명의 클래스에 생성한다.
	private ArrayList<Part> myList = new ArrayList<>();
	
	public void prt() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}

	// 학생 한 명이 로그인 시 사용할 수 있는 기능
	public void menu(PartMge pmge) {
		partMge = pmge;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 수강신청");
			System.out.println("2. 신청목록");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				list();
			}else {
				break;
			}
		}
	}
	
	
	private void add() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// 교과목의 리스트를 보여줘야하는데, 이 리스트는 PartMge에 있음
		ArrayList<Part> getList = partMge.getPlist();
		for (int i = 0; i < getList.size(); i++) {
			System.out.println("과목번호 : "+i);
			getList.get(i).prt();
		}
		System.out.println("번호 선택");
		int choiceNumber = in.nextInt();
		in.nextLine();
		myList.add(getList.get(choiceNumber));
		
	}
	private void list() {		// 수강신청 목록 조회
		// TODO Auto-generated method stub
		for (int i = 0; i < myList.size(); i++) {
			myList.get(i).prt();
		}
	}


	// private 접근제어자 사용했으므로 getter와 setter 필요
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}