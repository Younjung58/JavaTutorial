package _13_접근제어자_02;

import _13_접근제어자_01.MemeberOne;		// package 13접근제어자 / 클래스 memberOne

public class Main {

	public static void main(String[] args) {
		MemeberOne m = new MemeberOne();
//		m.name = "hong";	//	err why? name변수는 접근제어자가 default
		m.prt(); 		// 가능
		m.setName("1234");		//	가능
		m.setName("4567");
	}

}
