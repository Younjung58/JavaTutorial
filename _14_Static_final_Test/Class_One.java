package _14_Static_final_Test;

public class Class_One {
	private String cname = null;
	private String cclass = null;
	private String ctname = null;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCclass() {
		return cclass;
	}
	public void setCclass(String cclass) {
		this.cclass = cclass;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public void classAll() {
		System.out.println("과목명: "+cname+" / 강의실: "+cclass+" / 담당교수: "+ctname);
		System.out.println("-----------------------------");
	}
}
