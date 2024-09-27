package Box_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	// 상점 물품 리스트 객체 생성
	ArrayList<Item> item = new ArrayList<>();
		
	// 입력 객체 생성
	Scanner in = new Scanner(System.in);
	
	Character_One chr = null;
	Character_Manager manage = null;
	// 생성자, 생략이 가능하다.
	Shop() {
		// menu()
	}
	
	// 메뉴
	public void menu() {
		String selNum = "";
		while (true) {
			System.out.println("◆ 상점 ◆");
			System.out.println("0.상점 나가기");
			System.out.println("1.상점 물품 구경하기");
			System.out.println("2.상점 물품 구매하기");
			System.out.println("3.상점 물품 가격 수정하기");
			System.out.println("4.상점 물품 삭제하기");
			
			System.out.println("▷ 번호를 선택해주세요.");
			System.out.print("▷ 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n상점을 나갑니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n상점에 올라온 물품을 구경합니다.");
				shopList();
			} else if (selNum.equals("2")) {
				System.out.println("\n상점에 올라온 물품을 구매합니다.");
				shoping();
			} else if (selNum.equals("3")) {
				System.out.println("\n등록한 물품의 가격을 수정합니다.");
				shopPriceMod();
			} else if (selNum.equals("4")) {
				System.out.println("\n등록한 물품을 삭제합니다.");
				shopDel();
			} else {
				System.out.println("\n잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
	public void chr(Character_One saveOne) {
		chr = saveOne;
	}
	
	public void manage(Character_Manager manage) {
		this.manage = manage;
	}
	// 상점 구매 조회
	private void buyList() {
		for (int i=0; i<item.size(); i++) {
			if(chr.cname.equals(item.get(i).cname)) {
				continue;
			}else {
				item.get(i).itemList();				
			}
		}
	}
	// 상점 물품 조회
	private void shopList() {
		for (int i=0; i<item.size(); i++) {
			item.get(i).itemList();				
		}
	}
	
	// 상점에 물품이 등록되어 있는지 체크
	private boolean shopingItemNameCheck(String iname) {
		for (int i=0; i<item.size(); i++) {
			if (item.get(i).iname.equals(iname)) {
				return true;
			}
		}
		return false;
	}
	// 상점 물품 구매
	private void shoping() {
		System.out.println("--------------- 물품 ---------------");
		buyList();
		System.out.println("-----------------------------------");
		
		System.out.println("▷ 구매하고 싶은 물품의 이름을 알려주세요.");
		System.out.print("▷ 물품 이름 : ");
		String iname = in.nextLine();
		
		if (shopingItemNameCheck(iname)) {
			int price = 999999999;		// 물품의 최저가를 저장할 변수
			int itemindex = 0;			// item 리스트의 index위치를 저장할 변수
			for (int i=0; i<item.size(); i++) {
				if (item.get(i).iname.equals(iname) && item.get(i).iprice <= price) {
					price = item.get(i).iprice;
					itemindex = i;
				}
			}
			
			String check = "";
			while (true) {
				System.out.println("▷ 구입하고자 하는 물품의 이름은 '" + iname + "' 입니다.");
				System.out.println("▷ 구입하고자 하는 물품의 최저가는 " + price + "원 입니다.");
				System.out.print("▷ 구입하시려는 물품이 맞으신가요? (Y/N) : ");
				check = in.nextLine();
				
				if (check.equals("y") || check.equals("Y")) {
					if (chr.cmoney >= price) {
						System.out.println("\n물품을 구매했습니다.");
						chr.cmoney -= price;
						for (int i = 0; i < manage.chr.size(); i++) {
							if(manage.chr.get(i).cname.equals(item.get(itemindex).cname)) {
								manage.chr.get(i).cmoney+=price;
							}
						}
						
						chr.cobj.add(iname);
						item.remove(itemindex);
						break;
					} else {
						System.out.println("\n" + (price-chr.cmoney) + "원이 부족합니다.");
						break;
					}
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n물품 구매를 취소합니다.");
					break;
				} else {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println(iname + "(이)라는 물품은 등록되어 있지 않아요...");
		}
	}
	// 상점 수정 권한 체크
	private boolean shopCharacterPwdCheck(String cpwd) {
		if (chr.cpwd.equals(cpwd)) {
			return true;
		}
		return false;
	}
	// 상점에 등록된 물품의 가격 수정
	private void shopPriceMod() {
		String cpwd = "";
		System.out.println("▷ 비밀번호가 무엇인가요?");
		System.out.print("▷ 비밀번호 : ");
		cpwd = in.nextLine();
		boolean flag = true;
		
		if (shopCharacterPwdCheck(cpwd)) {
			System.out.println("\n---------- " + chr.cname + "(이)가 등록한 물품 ----------");
			for (int i=0; i<item.size(); i++) {
				if (item.get(i).cname.equals(chr.cname)) {
					System.out.print(i + ".");
					item.get(i).itemList();
				}
			}
			System.out.println("-----------------------------------");
			
			while(true) {
				String itemindex = "";
				System.out.println("▷ 수정할 물품의 번호를 입력해주세요.");
				System.out.print("▷ 번호 : ");
				itemindex = in.nextLine();
				try {
					for (int i=0; i<item.size(); i++) {
						if (item.get(i).cname.equals(chr.cname) && (i == Integer.parseInt(itemindex))) {
							System.out.print("▷ ");
							item.get(i).itemList();
							
							while (true) {
								try {
									System.out.println("수정할 가격을 입력해주세요.");
									System.out.print("(현재 : " + item.get(i).iprice + "원) => ");
									item.get(i).iprice = in.nextInt();
									in.nextLine();
									break;
								} catch (Exception e) {
									System.out.println("\n올바른 입력 방식이 아닙니다.");
									System.out.println("다시 입력해주세요.");
								}
							}
							flag = true;
							System.out.println("\n가격이 수정되었습니다.");
							break;
						} else {
							flag=false;
						}
					}
					if(flag==false) {
						System.out.println("\n올바른 입력 방식이 아닙니다.");
						System.out.println("다시 입력해주세요.");
						
					}else {
						break;						
					}
				} catch (Exception e) {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	// 상점에 등록된 물품 삭제
	private void shopDel() {
		String cpwd = "";
		System.out.println("▷ 비밀번호가 무엇인가요?");
		System.out.print("▷ 비밀번호 : ");
		cpwd = in.nextLine();
		boolean flag = true;
		
		if (shopCharacterPwdCheck(cpwd)) {
			System.out.println("\n---------- " + chr.cname + "(이)가 등록한 물품 ----------");
			for (int i=0; i<item.size(); i++) {
				if (item.get(i).cname.equals(chr.cname)) {
					System.out.print(i + ".");
					item.get(i).itemList();
				}
			}
			System.out.println("-----------------------------------");
			
			while(true) {
				String itemindex = "";
				System.out.println("▷ 삭제할 물품의 번호를 입력해주세요.");
				System.out.print("▷ 번호 : ");
				itemindex = in.nextLine();
				
				try {
					String check = "";
					for (int i=0; i<item.size(); i++) {
						if (item.get(i).cname.equals(chr.cname) && (i == Integer.parseInt(itemindex))) {
							while (true) {
								System.out.print("\n정말로 물품을 내릴건가요? (Y/N) : ");
								check = in.nextLine();
								if (check.equals("y") || check.equals("Y")) {
									chr.cobj.add(item.get(i).iname);
									item.remove(i);
									System.out.println("\n등록된 물품을 내렸습니다.");
									flag=true;
									break;
								} else if (check.equals("n") || check.equals("N")) {
									System.out.println("\n물품 삭제를 취소합니다.");
									flag=true;
									break;
								} else {
									System.out.println("\n올바른 입력 방식이 아닙니다.");
									System.out.println("다시 입력해주세요.");
								}
							}
							break;
						} else {
							flag=false;
						}
					}
					if (flag == false) {
						System.out.println("\n올바른 입력 방식이 아닙니다.");
						System.out.println("다시 입력해주세요.");						
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	
}
