package _Project_javaWord;

import java.util.Scanner;

public class MainMenu {
	
	AllWord word = new AllWord();
	WordGame game = new WordGame();
	
	public MainMenu() {
		if(word==null) {
			word = new AllWord();
		}
		if(game==null) {
			game = new WordGame();
		}
		word.save(game);
		game.save(word);
		prt();
	}

	public void prt() {
		System.out.println("1. 단어장 사용");
		System.out.println("2. 단어 게임 하기");
		System.out.println("3. JAVA_WORD 종료");
		System.out.println("원하는 항목을 선택하세요. ->");
		Scanner in =  new Scanner(System.in);
		int sel = in.nextInt();
		in.nextLine();
		if(sel==1) {
			word.prt();
		}else if(sel==2) {
			game.prt();
		}
	}

}
