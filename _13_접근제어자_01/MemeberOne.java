package _13_접근제어자_01;

public class MemeberOne {

	String name = null;		// default 생량됨
	public void prt() {
		System.out.println("name");
	}
	public void setName(String n) {	// default 생량됨
		if(chkName(n)) {
			this.name = n;			
		}else {
			this.name = "err";
		}
		System.out.println(this.name);
	}
	private boolean chkName(String n) {
		if(n.charAt(0)=='4') {
			return false;
		}
		return true;
	}
	// chkName은 내부적으로 호출하는 메서드로 정의하였으므로 private가 적당함.

}
