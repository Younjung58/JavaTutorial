package _10_Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestMethod r = new TestMethod();
		
		// Method study
		//		    123456
		String a = "880104";
		System.out.println(a.substring(0, 2));
		String year = a.substring(0, 2);
		System.out.println(year);
		System.out.println("19"+year);
		
		// 다음 에러의 원인을 서술하시오
		// 리턴타입이 string이다. 저장변수는 int타입, 미스매치타입
//		int month = a.substring(2, 4);
		// 즉, substring 메서드는 리턴값이 string으로 되어있기때문에 에러가 발생
		
		System.out.println(a.contains("8"));
		String w= "개나리";
		String title = "오늘 컨디션 참 개나리야 짜증!";
		System.out.println(title.contains(w));
		if(title.contains(w)) {
			System.out.println("욕하지 마세요.");
		}else {
			System.out.println("제목은 올바른 표현입니다.");
		}
//		System.out.println(title.indexOf(w));
		
		// 과제: 제목에서 개나리 부분을 ***으로 바꾸시오
		System.out.println(title.replaceAll(w, "***"));
		
		// 과제: 제목에서 개나라는 단어가 포함된 부분을 가져오세요
		//		단어가 포함된 기준은 개나리단어의 시작부터 스페이스까지
		//		위 샘플에서는 [개나리야]를 가져오는겁니다.
		// 이 문제는 개나리야부터 잘라내면 된다. > substring
		// 시작점은 indexOf(w)로하고, 끝점은 indexof(" ");
		title.indexOf("개나리야");
		title.lastIndexOf(" ");
		title.indexOf(w);
//		System.out.println(title.indexOf(w));
		title.indexOf(" ", title.indexOf(w));
//		System.out.println(title.indexOf(" ", title.indexOf(w)));
		title.substring(title.indexOf(w), title.indexOf(" ", title.indexOf(w)));
		System.out.println(title.substring(title.indexOf(w), title.indexOf(" ", title.indexOf(w))));
		
	}

}
