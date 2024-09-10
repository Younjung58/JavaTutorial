package 수정중_프로젝트;

import java.util.Scanner;

public class Level {

	public static void level(Scanner in, int[] cnt, int select ) {
		if (select == 1) {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=5-i;
			}
		} else if (select == 2) {
			for (int i = 0; i  < cnt.length; i++) {
				cnt[i]=3;
			}
		} else {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=i+1;
			}
		}
	}
}
