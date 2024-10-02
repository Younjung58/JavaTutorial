package _14_Static_final;

public class Main {
// 접근제어자 공용변수 리턴타입 메서드명       매개변수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중
		// 스레드의 이름을 가져오라.
		System.out.println(name);	
		// 스레드가 처음 시작시 main method를 실행하므로 현재실행중인 스레드명으로는 main이 출력됨
		// 디폴트로 만들어지는 thread
		System.out.println(name+"스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
//		MemberADM m = new MemberADM();
		
		// static변수는 공용변수. 위치는 Method area
		// 			   모든 스레드가 공용해서 사용가능 > 즉, 변수값 접근 가능
		// 객체를 만들지 않고 클래스명과 변수 또는 메서드명으로 접근
		String a = MemberADM.companyName;
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		MemberADM.companyName = "HOMan";
		// 접근하여 그 값의 변경또한 가능함(보안에 취약)
		System.out.println(MemberADM.companyName);
		
		// ***** test1 증명 *****
		MemberADM mm = new MemberADM();
		mm.companyName = "abc";
		mm.name = "a";
		MemberADM mmm = new MemberADM();
		mmm.companyName = "kkk";		// mm과 mmm객체의 공용변수 companyName에 새로운 값 'kkk'를 대입
		mmm.name = "b";
		
		System.out.println(mm.name);	//	a출력
		System.out.println(mmm.name);	// b출력
		System.out.println(mmm.companyName);	// kkk출력
		
		
		// ***** test2 증명 *****
//		MemberADM.teamName = "kkk";
		// 변수 teamName이 값 변경 불가한 'final'의 성질을 가졌기때문에 에러가 발생
		// 공용으로 오픈은 해주겠지만, 고치지는 못하도록 보통 'static final'의 성격을 같이 부여
		
//		Thread t1 = new Thread();
//		// 새로운 thread를 생성할 수 있음을 보여줌
		// 새로운 thread를 하나 만들어서 멀티thread로 운용이 가능
//		t1.setName("task1_thread");
//		String tname = t1.getName();
//		System.out.println("새로만든 스레드 이름은 "+tname);
	}

}
