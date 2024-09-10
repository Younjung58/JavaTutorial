package _04Random;

import java.util.Random;

public class _Q03 {
	public static void main(String[] args) {
//		3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		Random r = new Random();
		for(int a=r.nextInt(100)+1;;) {
			if(a%7==0) {
				System.out.println(a+"는 행운의 숫자입니다.");
				break;
			}else {
				a=r.nextInt(100)+1;
				continue;
			}
		}
	}


}
