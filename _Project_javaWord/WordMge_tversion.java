package _Project_javaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMge_tversion {
	ArrayList<OneWord> wordList = new ArrayList<>();	

	public WordMge_tversion() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.삭제");
			System.out.println("3.수정");
			System.out.println("4.전체보기");
			System.out.println("5.프로그램종료");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addWord();
			}else if(num==2) {
				delWord();
			}else if(num ==3) {
				modWord(); // while문 종료
			}else if(num ==4) {
				listWord(); // while문 종료
			}else if(num ==5) {
				break; // while문 종료
			}
		}	
	}
	public void addWord() {
		// ArrayList add()
		Scanner in = new Scanner(System.in);
		OneWord w = new OneWord();
		System.out.println("영어 단어 입력");
		String ename = in.nextLine();
		w.t_eng(ename);
		int idx=findIdx(ename);
		
		if(idx == -1) {
			wordList.add(w);
		}else {
			System.out.println("이미 단어가 등록 됨");
		}
		w=null;
	}

	public void delWord() {   // remove(i)
		Scanner in = new Scanner(System.in);
		System.out.println("영어 단어 입력");
		String ename = in.nextLine();
		
		// 영어 단어 찾는다..
		// 찾으면 바로 삭제를 했다..  검색하는 코드와 삭제하는 코드 분리
		
		//검색
		int idx=findIdx(ename);
	/*	for(int i=0; i < wordList.size(); i++) {
			if(wordList.get(i).ename.equals(ename)) {
				idx=i;
				break;
			}
		}*/
		//삭제
		if(idx != -1) {
			wordList.remove(idx);
		}	
	}; // 단어 삭제 - 내가
	public int findIdx(String ename) {
		for(int i=0; i < wordList.size(); i++) {
			if(wordList.get(i).g_eng().equals(ename)) {
				return i;		// return하면 break 같이됨.
			}
		}
		return -1;
	}
	public void modWord() {    // set()
		Scanner in = new Scanner(System.in);
		System.out.println("영어 단어 입력");
		String ename = in.nextLine();	
		//검색
	//	int idx=-1;
		int idx=findIdx(ename);
	/*	for(int i=0; i < wordList.size(); i++) {
			if(wordList.get(i).ename.equals(ename)) {
				idx=i;
				break;
			}
		}*/
		//수정
		if(idx != -1) {
			System.out.println("수정할 한글의 뜻을 입력하세요");
			String kname = in.nextLine();
			wordList.get(idx).t_kor(kname);
		}

	}; // 단어 수정 - 너가

	public void listWord() {    // get()
		for(OneWord w : wordList) {
			w.all();
		}

	}; // 전체보기 - 내가

	public boolean checkBadWord(String data) { // 너가
		// 내가 개발할때는
		return false;
	}
}
