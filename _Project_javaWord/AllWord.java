package _Project_javaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class AllWord {
	// 의존 관계 설정
//	OneWord class로 생성한 객체의 주소값을 저장하기 위해서 ArrayList를 선언, 초기값을 null로
	ArrayList <OneWord> words = null;
	Scanner in = new Scanner(System.in);
	WordGame wg = null;
	
	public AllWord() {
		// 생성자 메서드를 통하여 초기화 작업 진행
		if(words==null) {
			words = new ArrayList<>();
		}
		prt();
	}
	
	public void save(WordGame a) {
		wg = a;
	}
		
	public void prt() {
		while(true) {
//			System.out.println(words.size());
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 검색");
			System.out.println("3. 단어 전체조회");
			System.out.println("4. 단어 삭제(권한이 필요)");
			System.out.println("5. 단어 수정(권한이 필요)");
			System.out.println("6. 단어장 종료");
			System.out.println("해당 기능중 원하는 항목을 선택하세요. > ");
			int sel = in.nextInt();
			in.nextLine();
			if(sel==1) {
				addWord();
			}else if(sel==2) {
				oneWord();
			}else if(sel==3) {
				allWord();
			}else if(sel==4) {
				delWord();
			}else if(sel==5) {
				modWord();
			}else if(sel==6) {
				break;
			}	
		}
	}
	
	public void addWord() {		// 단어 등록의 기능을 하는 메소드 정의
		System.out.println("--단어등록을 선택하셨습니다--");
		OneWord word = new OneWord();
		System.out.println("등록하실 단어를 입력하세요. (영어)");
		String eword = in.nextLine();
		boolean flag = true;			// 중복된 값이 있는지 찾기위하여 boolean타입의 변수 선언
		if(words.size()>=1) {
			for (int i = 0; i < words.size(); i++) {
				if(words.get(i).g_eng().equals(eword)) {
					System.out.println("해당 단어는 이미 존재하는 단어입니다.");
					flag = false;		// 중복된 값이 발견되면 boolean값이 false로 변경되어 저장
					break;
				}
			}
		}
		if(flag) {		// 위에서 중복값이 발견되어 boolean값이 초기값 true가 아니면 실행이 안될 것(단어등록 불가)
			word.t_eng(eword);
			System.out.println(eword+" -> 해당 단어의 뜻을 입력하세요. (한글)");
			eword = in.nextLine();
			word.t_kor(eword);
			words.add(word);
			System.out.println("단어 등록이 완료되었습니다~!");
		}
	}
	
	public void oneWord() {		// 단어 검색의 기능을 하는 메소드 정의
		System.out.println("--단어 검색을 선택하셨습니다--");
		System.out.println("1. 한글로 입력하여 검색하기");
		System.out.println("2. 영어로 입력하여 검색하기");
		System.out.println("원하시는 항목을 선택하세요 > ");
		int sel = in.nextInt();
		boolean flag = true;
		in.nextLine();
		if(sel == 1) {
			System.out.println("검색을 원하시는 단어를 입력하세요. (한글)");
			String word = in.nextLine();
			for (int i = 0; i < words.size(); i++) {
				if(words.get(i).g_kor().equals(word)) {
					words.get(i).prt1();
					flag = false;
					break;
				}
			}
			if(flag) {
					System.out.println("해당단어는 존재하지 않습니다.");
			}
		}else if(sel == 2) {
			System.out.println("검색을 원하시는 단어를 입력하세요. (영어)");
			String word = in.nextLine();
			for (int i = 0; i < words.size(); i++) {
				if(words.get(i).g_eng().equals(word)) {
					words.get(i).prt2();
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("해당 단어는 존재하지 않습니다.");
			}
		}
		
	}
	
	public void allWord() {		// 단어 전체조회의 기능을 하는 메소드를 정의
		System.out.println("--단어 전체조회를 선택하셨습니다--");
		System.out.println("현재 등록되어있는 단어 목록입니다.");
		for (int i = 0; i < words.size(); i++) {
			System.out.println((i+1)+"번째 단어입니다.");
			words.get(i).all();
		}
	}
	public void delWord() {		// 단어 삭제의 기능을 하는 메소드를 정의
		System.out.println("--단어 삭제를 선택하셨습니다--");
		System.out.println("삭제를 원하시는 단어를 입력하세요. (영어)");
		String word = in.nextLine();
		boolean flag = true;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).g_eng().equals(word)) {
				System.out.println("삭제 권한의 비밀번호를 입력하세요(숫자4자리)");
				String pwd = in.nextLine();
//				words.get(i).r_word(pwd);
				if(words.get(i).r_word(pwd).equals(word)) {	
					// 비밀번호가 일치하여 호출한 메소드로부터 해당하는 영단어를 리턴값으로 받은 경우(즉, 삭제 권한 가짐)
					System.out.println("해당 영단어는 삭제되었습니다.(삭제된 영단어 : "+word+"- 뜻: "+words.get(i).g_kor()+")");
					words.remove(i);
					flag =false;
					break;
				}else {
					System.out.println("삭제 권한이 존재하지 않습니다.");
					flag =false;
					break;
				}
			}
		}
		if(flag) {
				System.out.println("해당 단어는 존재하지 않습니다.");
		}
	}
	
	public void modWord() {			// 단어 수정의 기능을 하는 메소드를 정의
		System.out.println("--단어 수정을 선택하셨습니다--");
		System.out.println("수정을 원하시는 단어를 입력하세요. (영어)");
		String word = in.nextLine();
		boolean flag = true;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).g_eng().equals(word)) {
				System.out.println("수정 권한의 비밀번호를 입력하세요(숫자4자리)");
				String pwd = in.nextLine();
				if(words.get(i).r_word(pwd).equals(word)) {
				// 비밀번호가 일치하여 호출한 메소드로부터 해당하는 영단어를 리턴값으로 받은 경우(즉, 수정 권한 가짐)
					System.out.println("현재 단어의 정보입니다.");
					words.get(i).all();
					System.out.println("수정을 원하시는 부분을 선택하세요. - 1. 영어 / 2. 한글");
					int sel = in.nextInt();
					in.nextLine();
					if(sel==1) {
						System.out.println("수정할 영어를 입력하세요.");
						word = in.nextLine();
						words.get(i).t_eng(word);
						System.out.println("아래와같이 수정되었습니다.");
						words.get(i).all();
						flag = false;
						break;
					}else if(sel==2) {
						System.out.println("수정할 한글 뜻을 입력하세요.");
						word = in.nextLine();
						words.get(i).t_kor(word);
						System.out.println("아래와같이 수정되었습니다.");
						words.get(i).all();
						flag = false;
						break;
					}
				}else {
					System.out.println("수정 권한이 존재하지 않습니다.");
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("해당 단어는 존재하지 않습니다.");
	}
	}
}
