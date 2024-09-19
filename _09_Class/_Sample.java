package _09_Class;

import java.util.Random;	// Random이라는 클래스임

public class _Sample {

	public static void main(String[] args) {
		// method임
		
		int a = 10;
		// 변수 값을저장하는 기억공간(저장하는 공간은 메모리)(int는 4바이트)(char는 2바이트)
		Random r = new Random();	// 객체생성 1
		// 내가 Random이라는 레시피(클래스)가 있는데, 이걸로 Random이라는 객체를 만들어서 그 주소를 r에 저장해줘
		// 클래스와 생성자의 이름이 동일한 것을 확인.
		// 앞 Random은 클래스명이고, 뒤 Random은 생성자명임.
		// 결과적으로, r은 현재 Random이라는 객체에 대한 주소를 저장하고 있음
		Random r1 = r;
		// r1에는 객체의 주소를 저장해야함, 그 자리에 r이 현재 가지고 있는 객체의 주소를 대입해주는 것임. 
		// 객체는 1개, 객체를 참조하고 있는 변수는 2개(r,r1)
		// 즉, 두개의 변수가 하나의 객체를 공유한다고 표현!!
		Random r2 = null; // 객체의 주소 없음
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
		// 객체를 참조할 주소가 없기때문에 에러가 발생
		System.out.println(r3.nextInt(4));
		
	}

}
