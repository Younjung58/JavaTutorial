package _Project_javaWord;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordGame {
	
	ArrayList<FailWord> f_words = new ArrayList<>();
	AllWord aw = null;
	Scanner in = new Scanner(System.in);

	public WordGame() {
		// TODO Auto-generated constructor stub
	}
	
	public void prt() {
		System.out.println("--게임룰 입니다--");
		System.out.println("한글이면 -> 영어를 / 영어라면 -> 한글을 입력하세요.");
		System.out.println("게임을 시작합니다.!!");
		for (int i = 0; i < aw.words.size(); i++) {
			System.out.println((i+1)+"번쨰 문제입니다.");
			aw.words.get(i).g_ame();
			System.out.println("답을 입력하세요.");
			String answer = in.nextLine();
			if(Pattern.matches("[가-힣]", aw.words.get(i).g_ame())) {
				if(aw.words.get(i).g_eng().equals(answer)) {
					System.out.println("정답입니다.");
				}else {
					System.out.println("오답입니다.");
					f_words.get(i).f_eng(answer);
					f_words.get(i).f_kor(answer);
				}
			}else {
				if(aw.words.get(i).g_kor().equals(answer)) {
					System.out.println("정답입니다.");
				}else {
					System.out.println("오답입니다.");
					f_words.get(i).f_eng(answer);
					f_words.get(i).f_kor(answer);
				}
			}
		}
		System.out.println("게임 오답 목록입니다.");
		for (int i = 0; i < f_words.size(); i++) {
			f_words.get(i).prt();
		}
	}
	public void save(AllWord a) {
		aw = a;
	}

}
