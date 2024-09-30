package _13_접근제어자_01;

public class CatDTO {
	private String name = null;
	private int age = 1;
	// 멤버변수는 은닉화 시킨다. 무엇으로? 접근제어자로
	// 은닉화 시키면 CatDTO(Data Transfer Object/고양이 한마리에 대한 정보를 전달하는 객체)클래스 외부에서 변수에 참조를 어떻게 하려고?
	// 일단 은닉화하고, 멤버 변수에 저장 및 인출에 관련된 메서드를 만든다.
	// 저장하는 메서드를 setter
	// 인출하는 메서드를 getter 라고 부릅니다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chkname(name);
		this.name = name;
	}
	private void chkname(String name2) {
		// TODO Auto-generated method stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
