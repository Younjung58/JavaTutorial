package _04Random;

import java.util.Scanner;

public class _Q01 {

	public static void main(String[] args) {
//		1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요");
		int a=in.nextInt();
		in.nextLine();
		int b=in.nextInt();
		System.out.println("두 숫자의 합은 "+(a+b)+"입니다.");

	}

}
