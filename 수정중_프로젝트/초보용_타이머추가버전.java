package 수정중_프로젝트;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
	
public class 초보용_타이머추가버전 {
	private static volatile boolean stop = false;
	public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white     = "\u001B[37m" ;
    public static final String exit     = "\u001B[0m" ;
	public static void main(String[] args) {
		Arr a = new Arr();
//		<초보용>  - 100초  (easy)
//		한글자->5개   	(cnt1)
//		두글자->4개	(cnt2)
//		세글자->3개	(cnt3)
//		네글자->2개	(cnt4)
//		다섯글자->1개	(cnt5)
		
		int point = 100;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int bomb=0;
		
		// 난이도 관련
		int[] cnt = new int[5];
		System.out.println("난이도를 선택하세요.");
		System.out.println("----------------------");
		System.out.println("초보단계 -> '1'을 입력하세요");
		System.out.println("중급단계 -> '2'을 입력하세요");
		System.out.println("마스터단계 -> '3'을 입력하세요");
		int select = in.nextInt();
		in.nextLine();
		System.out.println("----------------------");
		if (select == 1) {						// 초보용
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=5-i;			
			}
		} else if (select == 2) {				// 중급용
			for (int i = 0; i  < cnt.length; i++) {
				cnt[i]=3;
			}
		} else {								// 마스터용
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=i+1;
			}
		}

		
		// 시간 제한 관련
		new Thread(() -> {
            try {
                Thread.sleep(100000);  // 100초의 시간제한
                stop = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start(); 
		
		for(int i=r.nextInt(a.arr.length);;) {
//			System.out.println("남은시간: "+(EndTime-StartTime)/1000.0 + "초");
			bomb=r.nextInt(10)+1;
			if(cnt[a.arr[i].length()-1]!=0) {
				if(bomb/3==0) {
					System.out.println("💣💣💣"+cyan+"폭탄 단어입니다!"+exit);
					System.out.println(red+" 틀리면 점수 두배감점!"+exit);
				}
				System.out.println("주어진 단어를 입력하세요.");
				System.out.println(a.arr[i]);
				String word=in.next();
				in.nextLine();
			  // String비교시 사용하는 method
				if(a.arr[i].equals(word)) {
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
						System.out.println(purple+"폭탄당첨"+exit+"~💣 "+red+"두배감점!"+exit);
						point-=2*(2*a.arr[i].length());
					}else {
						point-=(2*a.arr[i].length());	
					}
					i = r.nextInt(a.arr.length);
				}
			}else if(cnt[a.arr[i].length()-1]==0){		
				// 이미 주어진 글자수의 갯수만큼 다 나온 경우는 다시 단어뽑기
				i = r.nextInt(a.arr.length);
			}
//			System.out.println("글자수의 남은 갯수");
//			for (int j = 0; j < cnt.length; j++) {
//				System.out.print(cnt[j]+" ");
//			}
			if(cnt[0]+cnt[1]+cnt[2]+cnt[3]+cnt[4]==0) {
				System.out.println("ദ്ദി ( ᵔ ᗜ ᵔ )");
				System.out.println("초보단계를 통과하였습니다!!!(점수는"+point+"입니다.)");
				break;
			}
			if(stop==true) {
				System.out.println();
				System.out.println(green+"타임아웃입니다.... "+exit);
				System.out.println(red+"더 연습하세요!!!"+exit);  //빨간글씨출력
				break;
			}
			if(point==0) {
				System.out.println(green+"0점 입니다... "+exit);
				System.out.println(red+"더 연습하세요!!!"+exit); 
				break;
			}
			System.out.println();
		}
		  	
	}
}
