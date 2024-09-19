package _09_Class;

import java.util.Random;	// Random이라는 클래스임

public class _Sample {

	public static void main(String[] args) {
		// method임
		int a = 10;
		// 변수 값을저장하는 기억공간(저장하는 공간은 메모리)(int는 4바이트)(char는 2바이트)
		Random r = new Random();	// 객체생성 1
		// 내가 Random이라는 레시피가 있는데, 이걸로 Random이라는 객체를 만들어서 그 주소를 r에 저장해줘
		// 따라서, r은 현재 Random이라는 객체에 대한 주소를 저장하고 있음
		Random r1 = r;
		Random r2 = null;
		Random r3 = new Random();	// 객체생성 2
		// new연산자를 사용한 것이 객체를 만든것임
		// 원시변수는 a,  나머지는 다 참조변수(4개)
		// 원시변수는 실제값을 저장(10), 참조변수는 주소를 저장
		// 그 주소는 객체가 있는 곳의 주소임
		// 원시변수는 현금같은거, 참조변수는 카드같은거
		// 한 통장으로 여러카드를 생성 가능
		// 참조하는 연산자는 .
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
		System.out.println(r2.nextInt(4));
		System.out.println(r3.nextInt(4));
		
	}

}
