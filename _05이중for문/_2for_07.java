package _05이중for문;

import java.util.Scanner;

public class _2for_07 {

	public static void main(String[] args) {
//		<이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
//		회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>
//		7.
//		키보드로 아이디를 입력 받는다.
//		입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
//		특수문자는 String sign="!@#$%^&*"로 정의한다.
//		특수문자가 몇 개 포함되었는지 출력합니다. 
		
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id=in.nextLine();
		String sign="!@#$%^&*";
		int a=0;
		for (int i = 0; i < sign.length(); i++) {
			for (int j = 0; j < id.length(); j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					a++;
				}
			}
		}
		System.out.println("특수문자는 총 "+a+"개 입니다.");
	}

}
