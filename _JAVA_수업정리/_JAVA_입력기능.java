package _JAVA_수업정리;

public class _JAVA_입력기능 {
	
//		만약 키보드로 92하고 엔터키를 누른 다면   > 92엔터키가 같이 입력된다.
//		만약 키보드로 abc efe  하고 엔터키를 누른다면 > abc공백efe엔터키가 입력된다.		
//		입력된 값을 가져오는 메서드는
//		nextInt();   숫자만 가져온다. 그래서 엔터키가 남는다. 엔터키를 삭제해서 버퍼를 비운다.
//		엔터키까지 가져오는 메서드인  nextLine()을 다시 한 번 사용한다. 이것을 버퍼 지우기 라고 한다.
//		next();  공백까지만 가져온다. 엔터는 남는다. 버퍼 지우기 필요있음
//		nextLine();  엔터까지 가져온다. 즉 공백도 한꺼번에 가져온다. 엔터까지 가져오므로 버퍼 지우기 필요 없음
//	
//	
//		JDK(develope 개발시사용) vs JRE(runtime 실행할 때 사용)
//	
//		키보드 자체는 운영체제에 존재함
//		java는 운영체제에 속하지만, 그밖에 존재하는 키보드를 가지고 있지 않기에
//		scanner를 통해 운영체제에 '나 키보드 하나만 줘봐'한 것임(Scanner in=new Scanner();)
//		즉, 운영체제로부터 빌려온 것임
//		(이러한 과정에서 어떻게 가져올 것인지의 방법은 아래의 3가지가 있음)
//		-> next(): 공백까지 가져옴(엔터는 안가져옴)
//		    nextLine(): 엔터까지 가져옴
//		    nextInt(): 숫자까지만 가져옴(엔터안가져옴)
//	
//		예시 1)
//		abc(공백)e(엔터) 를 입력했을 때,
//		-> next(): abc    (남은거 e)
//		    nextLine(): abc(공백)e(엔터)
//		    nextInt(): 숫자없으므로 에러
//	
//		예시 2)
//		입력값이 aaa(공백)bbb(엔터)일때
//		a=in.next();     -> aaa가져옴      /   남은거: bbb(엔터)
//		b=in.next();    -> bbb가져옴     /    남은거: (엔터)
//		c=in.nextLine();   -> (엔터)가져옴   / 남은거: 없어져서 완전한 공백이 됨
//	
//		in.close();를 사용한 자원(키보드)를 끝에서 반납함
	
}
