package Box_Project;

public class Item {
	// 변수
	String cname = null;	// 등록한 사람의 이름
	String iname = null;	// 물품 이름
	int iprice = 0;			// 물품 가격
	
	public void itemList() {
		System.out.println("품목명 : " + iname + " / 가격 : " + iprice + "원 / 캐릭터명 : " + cname);
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
