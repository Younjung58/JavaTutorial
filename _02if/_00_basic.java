package _02if;

public class _00_basic {

	public static void main(String[] args) {
		// 조건식으로 참과 거짓을 구분하여 코드를 분리하는 if
		// 조건 타입
		// 조건이 하나인 경우
		// 1차 조건, 2차 조건, 3차 조건이 순서 판별하면서 하나의 조건에 해당하는 경우
		// 1차조건 판별 후 2차 조건을 만족, 즉 순차적으로 조건을 판별
		
		// 시나리오 1 - 조건이 1개인 경우 참과 거짓으로 코드를 분리
		// 키가 160미만이면 집에 가시오..
		int cm=163;
		if(cm < 160) {
			System.out.println("집에 가시오");
		}
		// 키가 160미만이면 집에 가시오.. 160이상이면 환영
		if(cm < 160) {
			System.out.println("집에 가시오");
		}else {
			System.out.println("환영");
		}
		// 점수(point)가 있다. 만약 점수가 홀수라면 +10을 하시오.
		int point = 9;
		// 코드작성 step1: 조건식을 만든다.
		System.out.println(point%2==1);  // 또는 (point%2)!=0 도 가능함
		// step2 조건에 따라 참과 거짓을 분리하는 코드, 문제는 참일 경우만
		if(point%2==1) {
			point+=10;
		}
		System.out.println(point);  // 이때 변경된 point값을 정상 출력
		
		// 시나리오 타입2. 조건이 여러개 있는데 이중에 하나를 선택
		// 키가 180이상이면 A조, 170-179면 B조, 170미만이면 C조
		// step1 조건을 만든다.
		int cm1=185;
		System.out.println(cm1 >= 180);  // A조 조건
		System.out.println(cm1 >= 170 && cm1 < 180);  // B조 조건
		System.out.println(cm1 < 170);  // C조 조건
		// 나눈 조건에 따라서 코드를 작성
		if(cm >= 180) {
			System.out.println("A조");
		}else if(cm1 >= 170) {
			System.out.println("B조");
		}else if(cm1 < 170) {
			System.out.println("C조");
		}
		// else if와 if의 차이 알아보기
		// 아래 if는 위 예제랑 비슷해 보이지만 단독 if가 세개이다.
		// 즉, 위에 if문과는 완전히 다른 것이다.
		if(cm1 >= 180) {
			System.out.println("A조");
		}if(cm1 >= 170) {
			System.out.println("B조");
		}if(cm1 < 170) {
			System.out.println("C조");
		}
		
		// 시나리오3 - 조건1에 참인 후에 다시 조건을 순차적으로 판별
		// 출석이 100%이고, 과제 제출 횟수가 90% 이상인 경우
		int cnt = 100;	// 출석
		int cntAnswer = 95;	 // 과제 제출
		if(cnt==100) {
			if(cntAnswer >= 90) {
				System.out.println("MVP");
			}else {
				System.out.println("MVP가 아닙니다.");
			}
		}else {
			System.out.println("출석률 미달로 자격요건이 안됩니다.");
		}
	}
}
