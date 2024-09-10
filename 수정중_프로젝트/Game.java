package 수정중_프로젝트;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Game {
	public static volatile boolean stop = false;
	public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white    = "\u001B[37m" ;
    public static final String exit     = "\u001B[0m" ;
    public static int timeout = 100;
	
	public static void game(Arr a, Random r, Scanner in, int point, int[] cnt, int bomb,int select, Timer timer) {
		TimerTask timertask = new TimerTask() {
			public void run() {
				timeout--;
				if (timeout % 10 == 0) {		 //10초단위로 출력
					System.out.println();
					System.out.println(red+timeout+"초 남았습니다."+exit);
				} else if(timeout <= 0) {
					System.out.println(red+"타임오버입니다."+exit);
					timer.cancel();
				}
				
			}
		};
		timer.schedule(timertask, 0, 1000);  // 1초씩 카운트다운
		for(int i=r.nextInt(a.arr.length);;) {
			bomb=r.nextInt(10)+1;
			if(cnt[a.arr[i].length()-1]!=0) {
				if(bomb/3==0) {
					System.out.println();
					System.out.println("💣💣💣"+cyan+"폭탄 단어입니다!"+exit);
					System.out.println(red+" 틀리면 점수 두배감점!"+exit);
				}
				System.out.println();
				System.out.println("주어진 단어를 입력하세요.");
				System.out.println(a.arr[i]+"\n");
				String word=in.next();
				in.nextLine();
				if(a.arr[i].equals(word)) {
					System.out.println("현재점수는: "+point+"입니다.");
					System.out.println(blue+"৻(≧ᗜ≦৻) 정답입니다 ৻(≧ᗜ≦৻)"+exit);
					for (int j = 0; j < cnt.length; j++) {
						if(a.arr[i].length()-1==j) {
							cnt[j]--;		// 글자 길이수에 해당하는 갯수를 1개 감소시킴
						}
					}
					i = r.nextInt(a.arr.length);	// 새로운 i값 뽑기(새로운단어)
				}else {
					System.out.println(red+"(ʘ言ʘ╬) 오답입니다. (ʘ言ʘ╬)"+exit);
					if(bomb/3==0) {
						point-=2*(2*a.arr[i].length());
						System.out.println("💣"+red+"폭탄단어를 틀렸습니다!두배감점!"+exit);
						if (point <= 0) {
							point = 0;
						}
					}else {
						point-=(2*a.arr[i].length());
						if (point <= 0) {
							point = 0;
						}
					}
					System.out.println("현재점수는: "+point+"입니다.");
					i = r.nextInt(a.arr.length);
				}
			}else if(cnt[a.arr[i].length()-1]==0){		
				i = r.nextInt(a.arr.length);
			}
			if(cnt[0]+cnt[1]+cnt[2]+cnt[3]+cnt[4]==0) {
				System.out.println(yellow+"ദ്ദി ( ᵔ ᗜ ᵔ )"+exit);
				if (select == 1) {
					System.out.println("🎉🎉초보를 통과하였습니다!!!(점수는"+point+"입니다.)");
				}
				if (select == 2) {
					System.out.println("🎉🎉중급을 통과하였습니다!!!(점수는"+point+"입니다.)");
				}
				if (select == 3) {
					System.out.println("🎉🎉마스터를 통과하였습니다!!!(점수는"+point+"입니다.)");
				}
				timer.cancel();
				break;
			}
			if(point<=0) {
				System.out.println(green+"0점 입니다... "+exit);
				System.out.println(green+"더 연습하세요!!!"+exit); 
				break;
			}
			if (timeout <= 0) {
				break;
			}
		}
	}
}
