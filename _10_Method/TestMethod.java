package _10_Method;

public class TestMethod {

	// 생성자는 눈에 안보이지만 생략되어 있음
	
	// 이름뒤에 마스킹을 해주는 메서드 만들기
	// 호출할 때 문자열로 마스킹 문자를 지정하면,
	// 이름뒤에 마스킹 문자를 연결하여 리턴한다.
	// 메소드명은 maskName으로!
	
	String name = null;
	public String getName2(String pwd) {
		if(pwd.equals("1111")){
			return name;
		}else {
			return null;
		}
	}
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	
	public String maskName(String mask) {
		String MaskingName = (name+mask);
		return MaskingName;
	}
}
