package Box_Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character_One {
	Shop shop = null;
	Active active = new Active();
	
	String cname = null;	// 캐릭터 이름
	String cgender = null;		// 캐릭터 성별
	int cmoney = 0;		// 캐릭터 돈
	String cpwd = null;
	ArrayList<String> cobj = new ArrayList<>();		// 캐릭터 물품
	
	public Character_One() {
		// TODO Auto-generated constructor stub
	}
	
	public void menu() {
		while(true) {
			System.out.println("----------------");
			System.out.println("1. 나의 물품보기");
			System.out.println("2. 나의 물품팔기");
			System.out.println("3. 상점 둘러보기");
			System.out.println("4. 외부 활동하기");
			System.out.println("5. 메인화면으로 가기");
			System.out.println("원하는 항목을 선택하세요 > ");
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			if(sel == 1) {
				myObjectList();
			}else if(sel == 2) {
				myObjectSell();
			}else if(sel == 3) {
				goShop();
			}else if(sel == 4) {
				goActive();
			}else if(sel == 5) {
				break;
			}			
		}
	}
	
	
	public void myObjectList() {		// 현재 보유하고 있는 물품을 보여주는 메소드 정의
		System.out.println("현재 "+cname+"이 보유하고 있는 물품입니다.");
		cobj();
	}
	
	
	public boolean sellSelect(String obj, int price) {			// 물건과 가격의 매개변수를 정의하고, 그 값을 받아와서 선택에 따라서 boolean값을 리턴하는 메소드
		Scanner in = new Scanner(System.in);
		System.out.println(obj+"를 판매하시겠습니까? 지정된 가격은 "+price+"입니다.");
		System.out.println("( 예: Y / 아니오: N )");
		String sel = in.nextLine();
		
		if(sel.equals("y")||sel.equals("Y")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void myObjectSell() {	// 물품을 shop에 파는 기능을 하는 메소드 정의
		System.out.println("아래 물품에서 판매를 원하는 항목을 입력하세요.");
		cobj();
		Scanner in = new Scanner(System.in);
		String obj = in.nextLine();
		boolean flag = false;
		int price = 0;
		while(true) {
		for (int i = 0; i < cobj.size(); i++) {		// 판매품목 결정
			if(cobj.get(i).equals(obj)) {
				price=in.nextInt();
				in.nextLine();
				flag = sellSelect(obj,price);		// 상품등록을 선택했으면(y를 선택하여 flag 변수 저장값이 true라면 / 리턴값이 true경우) 상품등록 진행
			}else {
				System.out.println("해당 항목은 보유하지 않은 물품입니다.");
				break;
			}
			if(flag) {				// 상품등록 진행(flag 저장값 true일경우)
				shop.item.get(i).cname(cname);
				shop.item.get(i).iname(obj);
				shop.item.get(i).iprice(price);
				System.out.println("상품이 등록되었습니다.");
				shop.item.get(i).itemList();
			}else {		// flag 저장값 false인 경우
				System.out.println(obj+"판매를 취소하였습니다.");
				System.out.println("가격을 다시 입력하시겠습니까?");		// 랜덤 가격 다시 
				System.out.println("( 예: Y / 아니오: N )");
				String sel = in.nextLine();
				if(sel.equals("y")||sel.equals("Y")) {	
					continue;
				}else {
					break;						
					}
				}
			}			
		}
	}

	public void goShop() {
		shop.menu();
	}

	public void goActive() {
		active.menu();
	}
	
	
	// 부가 기능을 하는 메소드들
	public void savsShop(Shop shop) {		// Character_Manager에서 shop의 주소를 받아서 저장하는 기능의 메소드 정의
		this.shop = shop;
	}
	
	public void mychr() {		// 캐릭터 정보를 출력하는 기능을 하는 메소드 정의
		System.out.println("캐릭터이름: "+cname+"("+cgender+")"+" / 보유 잔액: "+cmoney);
	}
	
	public void cobj() {		// 물품 조회 기능을 하느느 메소드 정의	-> 보여주기 / 팔기에 사용
		for (int i = 0; i < cobj.size(); i++) {
			cobj.get(i);
		}
	}
	
	public int price(String obj) {		// 물품 판매시 가격을 생성하는 메소드
		Random r = new Random();
		int price = 100*(r.nextInt(10)+1);   // 1~10까지 랜덤값
		return price;
	}
	
	// 캐릭터 값 저장
	public void cname(String cname) {
		this.cname=cname;
	}
	public void cgender(String cgender) {
		this.cgender=cgender;
	}
	public void cpwd(String cpwd) {
		this.cpwd=cpwd;
	}
}
