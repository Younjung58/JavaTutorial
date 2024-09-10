package _04Random;

import java.util.Random;

public class _03_Test {

	public static void main(String[] args) {
//		String[] word ={"apple",'banana","car","dog","cat","computer"}
//		단어를 출력할 때
//		순차적으로 출력하지 않고
//		랜덤으로 모든 단어를 출력하고 싶다.
//		단어는 딱 한 번만 출력할 수 있으며 모든 단어가 모두 출력되어야 한다.
		
		String[] word ={"apple","banana","car","dog","cat","computer"};
		Random r = new Random();
		for (int i = r.nextInt(word.length); i < word.length; ) {
			if(word[i]!="0") {
				System.out.print(word[i]+" ");
				word[i]="0";
				i = r.nextInt(word.length);
			}else {
				i = r.nextInt(word.length);
				continue;
			}
		}
		
	}

}
