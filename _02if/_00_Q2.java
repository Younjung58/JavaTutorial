package _02if;

public class _00_Q2 {

	public static void main(String[] args) {
//		Q2
//		수강관리 프로젝트를 진행한다.
//		학생의 정보는 이름 학번 나이 성적이다.(정보)
//		나이가 18세 미만은 수강신청을 할 수 없다.(조건 1)
//		성적이 60점 이상이면서 70점 미만인 학생은 수강신청 할 수 있지만 이름뒤에 별표를 추가한다.(조건 2)
//		성적을 기준으로
//		90점 이상은 A
//		80점 이상은 B
//		70점 이상은 C
//		60점 이상은 D
//		60점 미만은 F라고 출력한다.(조건 3)
		
		int age=15;
		int grade=90;
		String result ="결과";
		// step1 조건찾기
		System.out.println(age>=18);
		System.out.println(grade>=90);
		System.out.println(90>grade&&grade>=80);
		System.out.println(80>grade&&grade>=70);
		System.out.println(70>grade&&grade>=60);
		System.out.println(grade<60);
		// step2 코드 작성
		if(age>=18) {
			if(grade>=90) {
				result="A";
			}else if(grade>=80){
				result="B";
			}else if(grade>=70){
				result="C";
			}else if(grade>=60) {
				result="D"+"*";
			}else {
				result="F";
			}
		}else {
			result="수강신청 할 수 없습니다.";
		}System.out.println(result);
	} 
}
