package _14_Static_final_Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student_All {
	
	ArrayList<Student_One> students = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	
	public void main() {
		while(true) {
			System.out.println("1. 학생 등록하기");
			System.out.println("2. 학생 검색하기");
			System.out.println("3. 학생 삭제하기");
			System.out.println("4. 학생 전체 조회하기");
			System.out.println("5. 메인화면으로");
			System.out.println("\n ▷ 원하는 항목을 입력하세요.");
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			
			if(sel == 1) {
				stuAdd();
			}else if(sel == 2) {
				stuSel();
			}else if(sel == 3) {
				stuDel();
			}else if(sel == 4) {
				stuAllList();
			}else if(sel == 5){
				break;
			}else {
				System.out.println("올바르지 않은 입력입니다. 다시 입력하세요.");
			}
		}
	}

	private int checkID (String id) {		// 아이디 중복 확인 메소드 정의
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getId().equals(id)) {		// 존재하는 아이디라면 false값 반환
				return i;
			}
		}
		return -1;
	}
	
	private void stuAdd() {		// 학생 등록 메소드 정의
		// TODO Auto-generated method stub
		boolean flag = false;
		Student_One student = null;
		while(true) {
			if(students.size()>= Student_One.MAXSTUDENT) {
				System.err.println("인원수 초과입니다. 학생을 더이상 등록할 수 없습니다.");
				break;
			}else {
				student = new Student_One(); 
				while(true) {		// 이름 등록
					System.out.println("------------------------------------");
					System.out.println("등록을 원하시는 아이디를 입력하세요.(영어와 숫자의 조합으로 입력할 것)");
					System.out.println("▷ ");
					String id = in.nextLine();
					flag = Pattern.matches("^[a-zA-Z0-9]*$",id);
					if(flag) {
						if(checkID(id)==-1) {
							flag = true;
							if(flag) {
								student.setId(id);
								break;							
							}else {
								System.err.println("해당 아이디는 이미 존재합니다. 다시 입력하세요.");
							}							
						}
					}else {
						System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
					}
				}
				while(true) {		// 
					System.out.println("------------------------------------");
					System.out.println("등록을 원하시는 학생의 이름을 입력하세요.(한글로 입력할 것)");
					System.out.println("▷ ");
					String name = in.nextLine();
					flag = Pattern.matches("^[ㄱ-ㅎ가-힣]*$",name);
					if(flag) {
						student.setName(name);
						break;
					}else {
						System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
					}
				}
				while(true) {		// 
					System.out.println("------------------------------------");
					System.out.println("핸드폰 번호를 입력하세요.(000-0000-0000 형태로 입력할 것)");
					System.out.println("▷ ");
					String number = in.nextLine();
					flag = Pattern.matches("^\\d{3}-\\d{3,4}-\\d{4}$",number);
					if(flag) {
						student.setNumber(number);
						break;
					}else {
						System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
					}
				}
				while(true) {		// 
					System.out.println("------------------------------------");
					System.out.println("학년을 입력하세요(학부: 1~4 / 대학원: 0)");
					System.out.println("▷ ");
					int grade = in.nextInt();
					in.nextLine();
					if(grade>=0 && grade <=4) {
						student.setGrade(grade);
						break;						
					}else {
						System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
					}
				}
				students.add(student);
				System.out.println("아래와같이 학생 등록이 완료되었습니다 🌟");
				students.get(students.size()-1).student();
				break;
			}
			
		}
		
	}
	
	private void stuSel() {
		// TODO Auto-generated method stub
		boolean flag = false;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("검색할 학생의 이름을 입력하세요.");
			System.out.println("▷ ");
			String name = in.nextLine();
			flag = Pattern.matches("^[ㄱ-ㅎ가-힣]*$",name);
			if(flag) {
				for (int i = 0; i < students.size(); i++) {
					if(students.get(i).getName().contains(name)){
						System.out.println("-----조회한 학생의 정보입니다.-----");
						students.get(i).student();
						flag = false;
					}
				}
				if(flag) {
					System.err.println("존재하지 않는 이름입니다. 다시 입력하세요.");
				}else {
					break;					
				}
			}else {
				System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			}
		}
		
	}
	private void stuDel() {
		// TODO Auto-generated method stub
		boolean flag = false;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("삭제할 학생의 아이디를 입력하세요.");
			System.out.println("▷ ");
			String id = in.nextLine();
			flag = Pattern.matches("^[a-zA-Z0-9]*$",id);
			if(flag) {
				if(checkID(id)!=-1) {
					students.remove(checkID(id));
					System.out.println("아이디 삭제를 완료하였습니다.(삭제 아이디: "+id+")");
					break;
				}else {
					System.err.println("해당 아이디는 존재하지 않습니다. 다시 입력하세요.");
				}
			}else {
				System.err.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			}
		}
		
	}
	public void stuAllList() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("현재 등록되있는 학생의 목록입니다.");
		for (int i = 0; i < students.size(); i++) {
			students.get(i).student();
		}
	}



}
