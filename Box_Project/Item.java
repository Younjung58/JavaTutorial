package Box_Project;

public class Item {
	String cname = null;
	String iname = null;
	int iprice = 0;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public void itemList() {
		System.out.println("진열 품목명: "+iname+" / 가격: "+iprice);
	}
	
	public void cname(String cname) {
		this.cname = cname;
	}
	
	public void iname(String iname) {
		this.iname = iname;
	}
	public void iprice(int iprice) {
		this.iprice = iprice;
	}
}
