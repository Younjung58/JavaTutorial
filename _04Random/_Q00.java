package _04Random;

import java.util.Scanner;

public class _Q00 {

	public static void main(String[] args) {
//		0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		System.out.println("한개의 숫자를 입력하세요.");
		int k=in.nextInt();
		if(k%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
