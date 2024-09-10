package _03for;

import java.util.Random;


public class _for_mission__09_12 {

	public static void main(String[] args) {
//		[9번 - 12번까지 문제 제시]
//		Random이라는 클래스로 객체를 만들어서 r이라는 참조변수로 참조해서 사용해 보자~
		Random r = new Random();  
//		int num = r.nextInt(45)+1;     
		// 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
		// 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
	    // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
	    // 리턴값을 보정하여  num변수의 값에 대입
//
//		위 코드를 이용하여
//
//		9
//		로또번호를 자동으로 생성하는 게임을 작성하시오.
//		중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		int [] a = new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(45)+1;
			System.out.print(a[i]+" ");
		}
		System.out.println("");
//
//		10
//		9번에서 중복이 되지 않게 하시오...  이때 for문은 한 개만 사용
		int [] a1 = new int[6];
//		int c=0;
		int n = r.nextInt(45)+1;
		for(int i=0;i<a1.length;) {
			if(n!=a[i]) {
				a[i]=n;
				n=r.nextInt(45)+1;
				i++;
			}else {
				i=0;
			}
		}
		
		
//		11
//		컴퓨터는 랜덤으로 번호를 먼저 뽑고, 키보드로 사용자가 번호를 입력하는 방식으로 가위 바위 보 게임을 작성하시오
//
//		12
//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.

	}
}


