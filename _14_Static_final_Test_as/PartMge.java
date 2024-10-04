package _14_Static_final_Test_as;

import java.util.ArrayList;
import java.util.Scanner;

//교과목 관리 추상화 클래스
public class PartMge {

	// 교과목을 관리하려면 교과목이라는 객체가 필요하여 의존관계 생성
	ArrayList<Part> plist = new ArrayList<>();	// setter 필요없음

	public ArrayList<Part> getPlist() {
		return plist;
	}

	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록");
			System.out.println("2. 전체보기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				list();
			}else {
				break;
			}
		}
	}

	// 교과목 등록
	private void add() {
		Scanner in = new Scanner(System.in);
		Part newTemp = new Part();
		System.out.println("과목명 입력");
		String partName = in.nextLine();
		newTemp.setPartName(partName);
		plist.add(newTemp);
	}

	// 교과목 조회
	public void list() {

	}

}