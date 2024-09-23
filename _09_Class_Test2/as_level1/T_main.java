package _09_Class_Test2.as_level1;

public class T_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T_main(프로그램의 시작) -> T_Center(등록,보기,수정) -> T_one(기차 한대)
		// T_Center를 의존하기 때문에 변수가 필요
//		T_Center tcenter = null;
		// 현재, 의존관계는 판단할 수 있다.(참조변수를 선언했기때문)
		// BUT! 객체를 참조하기 위한 주소의 값이 null이므로 실제 참조는 불가능하다.
		T_Center tcenter = new T_Center();
								// 생성자(객체를 만들 때 제일 먼저 실행됨)
		// 따라서 위와 같이 코드를 바꿀 수 있다. 또한 2가지의 의미(해석)를 가진다.
		// 1. T_main class는 T_Center class를 참조하고 있다.
		// 2. T_main class는 T_Center class를 참조하기 위한 주소값을 직접 만들어서 가지고 있다.
		// 또다른 방법으로는 직접 만들지않고, 객체의 주소값을 누군가로부터 가져오면된다.
		// T_Center tcenter1 = tcenter;		(이런식으로..)
		// 위의 방법은 주소를 주입받았다고 표현한다. (개발자가 객체를 함부로 만들지 않는다는 것을 의미한다.)
	}

}
