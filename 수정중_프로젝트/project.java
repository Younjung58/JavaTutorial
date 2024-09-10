package 수정중_프로젝트;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class project {
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
    static int count=3;
    
	public static void main(String[] args) {
		Arr a = new Arr();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int point = 100;
		int[] cnt = new int[5];
		int bomb = 0;
		Timer timer=new Timer();
		
		// 게임 룰 설명
		System.out.println("<게임 규칙 설명>");
		System.out.println("✊. 한글, 영어, 문자의 단어가 무작위로 제시됩니다.");
		System.out.println("☝. 레벨마다 주어진 시간제한은 100초로 모두 동일합니다.");
		System.out.println("✌. 주어진 점수는 100점으로, 글자당 감점되는 점수는 2점으로 동일합니다.");
		System.out.println("(한글자-2점 / 두글자-4점 / 세글자-6점 / 네글자-8점 / 다섯글자-10점)");
		System.out.println(red+"(단, 랜덤으로 나오는 💣폭탄 단어💣를 틀릴시에는 두배로 감점!)"+exit);
		System.out.println(green+"\n🟢 제한시간내에, 점수가 0점에 도달하지 않으면 성공하게 됩니다~!!"+exit);
		System.out.println("----------------------------------------------------------------");
		System.out.println("<1> 초급용 : 한글자-5개 / 두글자-4개 / 세글자-3개 / 네글자-2개 / 다섯글자-1개");
		System.out.println("<2> 중급용 : 한글자-3개 / 두글자-3개 / 세글자-3개 / 네글자-3개 / 다섯글자-3개");
		System.out.println("<3> 마스터용 : 한글자-1개 / 두글자-2개 / 세글자-3개 / 네글자-4개 / 다섯글자-5개");
		System.out.println("\n원하는 단계의 숫자를 입력하면 게임이 시작됩니다.");
		System.out.println("<1> 초급  <2> 중급  <3> 고급");
		
		// 난이도 선택 코드
		int select = in.nextInt();
		in.nextLine();
		Level.level(in, cnt, select);
		
		System.out.println("\n게임을 시작합니다.");
		
		// 난이도 선택 후 시작전 카운트 3초
		Timer timer1 = new Timer();
		TimerTask timertask1 = new TimerTask() {
		 public void run() {
					if(count>=1){ 		// count값이 1보다 크거나 같을때(즉 1~3초)
						System.out.println("[카운트다운 : "+count+"]");
						count--; //실행횟수 감소
					}	
					else{
						timer1.cancel();  //타이머 종료 
						System.out.println();
						System.out.println(green+"Game Start!!!"+exit);
					
						// 게임 실행 코드  -> 3초 카운트 뒤에 실행되도록 코드작성
						Game.game(a, r, in, point, cnt, bomb, select, timer);
					}
			    }
		};
		timer1.schedule(timertask1, 0 , 1000);	
		// 1초에 한번씩 출력(3초 카운트 다운 후 종료)
	}
}

