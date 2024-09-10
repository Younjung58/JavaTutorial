package _02if;

public class _00_Q3 {

	public static void main(String[] args) {
//		Q3
//		int a = 10;
//		int b = 20;
//		int my = 15;
//		문제 a와 b는 도로의 길이이며 위치이다.
//		my는 나의 위치이다.
//		내가 도로위에 있으면 도로위.. 도로위가 아니라면 도로가 아님이라고 출력하시오
//		
//		만약 내가 도로위라면
//		up1
//		a지점으로부터 5(my위치에 따라 달라짐)만큼 떨어져 있습니다. 라고 출력하시오
//
//		up2
//		up1에서 현재 my의 위치가 가가운 쪽 기준으로 출력한다.
//		예를들어 my 18이면 b에 더 가까우니 b에서부터 2거리 떨어져 있습니다.
//		같은 거리일 경우는 a가 우선한다.
		
		// step1 조건찾기
		int a = 10;
		int b = 20;
		int my = 18;
		System.out.println((my>=a)&&(my<=b));
		// step2
		if((my>=a)&&(my<=b)) {
			System.out.println("도로위입니다.");
		}else {
			System.out.println("도로위가 아닙니다.");
		}
		
		// up1 조건찾기
		System.out.println((my>=a)&&(my<=b));
		System.out.println(my-a);
		// step2
		if((my>=a)&&(my<=b)) {
			System.out.println("a지점으로부터 "+(my-a)+"만큼 떨어져 있습니다.");
		}else {
			System.out.println("도로위가 아닙니다.");
		}
		
		// up2 조건찾기
		System.out.println((my>=a)&&(my<=b));
		System.out.println((my-a)<=(b-my));
		// step2
		if((my>=a)&&(my<=b)) {
			if((my-a)<=(b-my)) {
				System.out.println("a지점으로부터 "+(my-a)+"만큼 떨어져 있습니다.");
			}
			else {
				System.out.println("b지점으로부터 "+(b-my)+"만큼 떨어져 있습니다.");
			}
		}else {
			System.out.println("도로위가 아닙니다.");
		}
	}
	
}
