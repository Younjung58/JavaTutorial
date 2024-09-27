package Box_Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character_One {
	Shop shop = null;
	Active active = new Active();
	Scanner in = new Scanner(System.in);
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
	
	public void myObj() {
		System.out.println("\n------------- 내 가방 -------------");
		for (int i=0; i<cobj.size(); i++) {
			System.out.print(cobj.get(i) + " ");
		}
		System.out.println("\n-----------------------------------");
	}
	
	
	public void myObjectList() {		// 현재 보유하고 있는 물품을 보여주는 메소드 정의
		boolean flag = true;
		System.out.println("현재 "+cname+" 님이 보유하고 있는 물품입니다.");
		if(cobj.size()>=0) {
			myObj();
			flag = false;		
		}
		if(flag) {
			System.out.println("--- 보유하고 있는 품목이 없습니다. ---");
		}
	}
	
	
	public boolean sellSelect(String obj, int price) {			// 물건과 가격의 매개변수를 정의하고, 그 값을 받아와서 선택에 따라서 boolean값을 리턴하는 메소드
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println(obj+"를 판매하시겠습니까? 지정된 가격은 "+price+"원 입니다.");
			System.out.println("( 예: Y / 아니오: N )");
			String sel = in.nextLine();
			
			if(sel.equals("y")||sel.equals("Y")) {
				return true;
			}else if(sel.equals("N")||sel.equals("n")) {
				System.out.println("판매를 종료합니다.");
				return false;
			}else {
				System.out.println("\n올바른 입력 방식이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}		
		}
	}
	
	
	public void myObjectSell() {	// 물품을 shop에 파는 기능을 하는 메소드 정의
		System.out.println("아래 물품에서 판매를 원하는 항목을 입력하세요.");
		myObj();
		System.out.println("▷ ");
		String obj = in.nextLine();
		int icount=0;
		int sNum = 0;
		String selNum=null;
		boolean flag = false;
		boolean flag1 = false;
		int price = 0;
		int a = 0;
		while(true) {
			for (int i = 0; i < cobj.size(); i++) {
				if(cobj.get(i).equals(obj)) {
					flag = true;
					a=i;
					break;
				}
			}
			if(flag==false) {
				System.out.println("해당 항목은 보유하지 않은 물품입니다.");
				break;				
			}else {
				for (int i=0; i<cobj.size(); i++) {
					if (cobj.get(i).equals(obj)) {
						icount++;
					}
				}
				while (true) {
					try {
						System.out.println("\n▷ '" + obj + "'(은)는 " + icount + "개 가지고 있습니다.");
						System.out.println("1개를 판매할까요? ▷ Y / N");
						String sel = in.nextLine();
						if(sel.equals("Y")||sel.equals("y")) {
							flag1=true;
						}else if(sel.equals("N")||sel.equals("n")) {
							System.out.println("판매를 종료합니다.");
							return;
						}else {
							System.out.println("\n올바른 입력 방식이 아닙니다.");
							System.out.println("다시 입력해주세요.");
						}
						
					} catch (Exception e) {
						System.out.println("\n올바른 입력 방식이 아닙니다.");
						System.out.println("다시 입력해주세요.");
						continue;
					}
					if(flag1){
						while(true) {
							String p = null;
							try {
								System.out.println("가격을 입력하세요.");
								System.out.println("▷ ");
								p=in.nextLine();
								price=Integer.parseInt(p);
								flag1 = sellSelect(obj,price);		// 상품등록을 선택했으면(y를 선택하여 flag 변수 저장값이 true라면 / 리턴값이 true경우) 상품등록 진행
								break;							
							}
							catch(Exception e){
								System.out.println("\n올바른 입력 방식이 아닙니다.");
								System.out.println("다시 입력해주세요.");
							}
						}
						break;
					}
				}
			}
			if(flag1){				// 상품등록 진행(flag 저장값 true일경우)
				for (int i = 0; i < cobj.size(); i++) {
					if(cobj.get(i).equals(obj)) {
						Item item = new Item();
						item.cname(cname);
						item.iname(obj);
						item.iprice(price);
						shop.item.add(item);
						shop.item.get(shop.item.size()-1).itemList();
						cobj.remove(i);
						break;
					}
				}
//				System.out.println(shop +"----sellFlag");
				System.out.println("상품이 등록되었습니다.");
				break;
			}else {
				break;
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
	public void saveShop(Shop shop) {		// Character_Manager에서 shop의 주소를 받아서 저장하는 기능의 메소드 정의
		this.shop = shop;
//		System.out.println(shop +"----saveShop");
	}

	public void mychr() {		// 캐릭터 정보를 출력하는 기능을 하는 메소드 정의
		System.out.println("캐릭터이름: "+cname+"("+cgender+")"+" / 보유 잔액: "+cmoney+"원");
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
