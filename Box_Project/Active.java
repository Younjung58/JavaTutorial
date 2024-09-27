package Box_Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Active {
	Sleep sleep = new Sleep();
	Character_One chr = null;
	
	// 변수 : collectList(채집 아이템 리스트) fishList(낚시 아이템 리스트)	= 인덱스 0~9, 길이 10
	String[] collectList = {"나뭇잎","나뭇가지","지렁이","애벌레","무당벌레","달팽이","나비","잠자리","장수풍뎅이","사슴벌레"};
		/*	확률	확률값			인덱스	채집아이템명
		 * 	50% (0 1 2 3 4)		0~1		나뭇잎(0) 나뭇가지(1)
		 * 	40% (5 6 7 8)		2~7		지렁이(2) 애벌레(3) 무당벌레(4) 달팽이(5) 나비(6) 잠자리(7)
		 * 	10% (9)				8~9		장수풍뎅이(8) 사슴벌레(9)
		 */
	String[] fishList = {"돌멩이","빈깡통","송사리","붕어","광어","연어","우럭","문어","참돔","참치"};
		/*	확률	확률값			인덱스	낚시아이템명
		 * 	60% (0 1 2 3 4 5)	0~1		돌멩이(0) 빈깡통(1)
		 * 	30% (6 7 8)			2~6		송사리(2) 붕어(3) 광어(4) 연어(5) 우럭(6)
		 * 	10% (9)				7~9		문어(7) 참돔(8) 참치(9)
		 */
	
	// 채집한 채집물을 임시 보관할 리스트
	ArrayList<String> box = new ArrayList<>();
	
	// 입력 객체 생성
	Scanner in = new Scanner(System.in);
	
	// 생성자, 생략이 가능하다.
	Active() {
		// menu()
	}
	
	public void chr(Character_One saveOne) {
		chr = saveOne;
	}
	
	// 메뉴
	public void menu() {
		String selNum = "";
		while (true) {
			System.out.println("◆ 활동 ◆");
			System.out.println("0.활동 종료하기");
			System.out.println("1.채집하기");
			System.out.println("2.낚시하기");
			System.out.println("3.채집물 즉시 판매하기");		
			
			System.out.println("▷ 번호를 선택해주세요.");
			System.out.print("▷ 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n'아.. 힘들다..'");
				System.out.println("획득한 채집물들을 주섬주섬 챙겨서 돌아갑니다.");
				for (int i=0; i<box.size(); i++) {
					chr.cobj.add(box.get(i));
				}
				box.clear();
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n채집하러 갑니다.");
				collectingMenu();
			} else if (selNum.equals("2")) {
				System.out.println("\n낚시하러 갑니다.");
				fishingMenu();
			} else if (selNum.equals("3")) {
				System.out.println("\n획득한 채집물을 시가로 바로 판매합니다.");
				selling();
			} else {
				System.out.println("\n잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 채집 활동하기 메뉴
	private void collectingMenu() {
		String selNum = "";
		while (true) {
			System.out.println("◇ 채집하기 ◇");
			System.out.println("0.채집 종료하기");
			System.out.println("1.채집 시작하기");
			
			System.out.println("▷ 번호를 선택해주세요.");
			System.out.print("▷ 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n다시 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				collecting();
			} else {
				System.out.println("\n잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 채집 활동하기
	private void collecting() {
		Random iProbRan = new Random();		// 확률을 위한 난수
		Random colRan = new Random();		// 배열에 담긴 아이템의 인덱스를 위한 난수
		Random probRan = new Random();		// 아이템 획득 확률을 위한 난수

		int itemProbability = iProbRan.nextInt(10);		// 0~9, 확률을 위한 난수
		String iname = null;							// 아이템을 저장할 변수
		
		System.out.println("\n채집 하는 중...");
		sleep.Sleep(); 	// 5초 뒤에 실행
		
		// 0~9, 배열에 담긴 아이템의 인덱스를 결정
		if (itemProbability >= 9) {									// 확률 10% (9)
			iname = collectList[colRan.nextInt(2) + 8] ;			// 배열 인덱스 [8 9]
		} else if (itemProbability > 4 && itemProbability < 9) {	// 확률 40% (5 6 7 8)
			iname = collectList[colRan.nextInt(6) + 2];				// 배열 인덱스 [2 3 4 5 6 7]
		} else {													// 확률 50% (0 1 2 3 4)
			iname = collectList[colRan.nextInt(2)];					// 배열 인덱스 [0 1]
		}
		
		int successRate = probRan.nextInt(10);			// 성공(0~6)/실패(7~9) 아이템 획득 확률
		String check = "";
		
		if (iname.equals(collectList[0]) || iname.equals(collectList[1])) {
			// 만약 채집한 아이템이 나뭇잎, 나뭇가지라면 확률에 관계 없이 무조건 발견
			System.out.println("\n이게 뭐야.. " + iname + "(이)잖아..");
			while (true) {
				System.out.print(iname + "(을)를 챙기실건가요? (Y/N) : ");
				check = in.nextLine();
				if (check.equals("y") || check.equals("Y")) {
					System.out.println("\n" + iname + "(을)를 습득했습니다.");
					box.add(iname);
					break;
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n" + iname + "(을)를 버렸습니다.");
					break;
				} else {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else if (successRate < 7) {
			// 확률 변수의 값이 0~6이라면 성공, 7~9라면 실패
			System.out.println("\n" + iname + "(을)를 발견했다!");
			while (true) {
				System.out.print(iname + "(을)를 챙기실건가요? (Y/N) : ");
				check = in.nextLine();
				if (check.equals("y") || check.equals("Y")) {
					System.out.println("\n" + iname + "(을)를 습득했습니다.");
					box.add(iname);
					break;
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n" + iname + "(을)를 놓아줬습니다.");
					System.out.println("잘가! " + iname + "!");
					break;
				} else {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println("\n앗! " + iname + "(을)를 발견했지만 도망갔습니다..");
		}

	}
	// 낚시 활동하기 메뉴
	private void fishingMenu() {
		String selNum = "";
		while (true) {
			System.out.println("◇ 낚시하기 ◇");
			System.out.println("0.낚시 종료하기");
			System.out.println("1.낚시 시작하기");
			
			System.out.println("▷ 번호를 선택해주세요.");
			System.out.print("▷ 번호 : ");
			selNum = in.nextLine();
			if (selNum.equals("0")) {
				System.out.println("\n다시 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				fishing();
			} else {
				System.out.println("\n잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}

	}
	// 낚시 활동하기
	public void fishing(){
		Random iProbRan = new Random();		// 확률을 위한 난수
		Random fishRan = new Random();		// 배열에 담긴 아이템의 인덱스를 위한 난수
		Random probRan = new Random();		// 아이템 획득 확률을 위한 난수
		
		int itemProbability = iProbRan.nextInt(10);		// 0~9, 확률을 위한 난수
		String iname = null;							// 아이템을 저장할 변수
		
		// 0~9, 배열에 담긴 아이템의 인덱스를 결정
		if (itemProbability >= 9) {									// 확률 10% (9)
			iname = fishList[fishRan.nextInt(3) + 7];				// 배열 인덱스 [7 8 9]
		} else if (itemProbability > 5 && itemProbability < 9) {	// 확률 40% (5 6 7 8)
			iname = fishList[fishRan.nextInt(5) + 2];				// 배열 인덱스 [2 3 4 5 6]
		} else {													// 확률 50% (0 1 2 3 4)
			iname = fishList[fishRan.nextInt(2)];					// 배열 인덱스 [0 1]
		}
		
		int successRate = probRan.nextInt(10);			// 성공(0~6)/실패(7~9) 아이템 획득 확률
		String check = "";
		
		System.out.println("\n낚시 하는 중...");
		sleep.Sleep();
		if (iname.equals(fishList[0]) || iname.equals(fishList[1])) {
			// 만약 채집한 아이템이 돌멩이, 빈깡통이라면 확률에 관계 없이 무조건 발견
			System.out.println("\n이게 뭐야.. " + iname + "(이)잖아..");
			while (true) {
				System.out.print(iname + "(을)를 챙기실건가요? (Y/N) : ");
				check = in.nextLine();
				if (check.equals("y") || check.equals("Y")) {
					System.out.println("\n" + iname + "(을)를 습득했습니다.");
					box.add(iname);
					break;
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n" + iname + "(을)를 버렸습니다.");
					break;
				} else {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else if (successRate < 7) {
			System.out.println("\n" + iname + "(을)를 발견했다!");
			
			while (true) {
				System.out.print(iname + "(을)를 챙기실건가요? (Y/N) : ");
				check = in.nextLine();
				if (check.equals("y") || check.equals("Y")) {
					System.out.println("\n" + iname + "(을)를 습득했습니다.");
					box.add(iname);
					break;
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n" + iname + "(을)를 놓아줬습니다.");
					System.out.println("잘가! " + iname + "!");
					break;
				} else {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			// 확률 변수의 값이 0~6이라면 성공, 7~9라면 실패
			System.out.println("\n앗! " + iname + "(을)를 발견했지만 도망갔습니다..");
		}
	}	
	// 채집물 즉시 판매하기
	private void selling() {
		boolean icheck = false;
		if (box.size() != 0) {
			icheck = true;
		}
		
		if (icheck) {
			Random priceRan= new Random();		// 즉시 판매 시 랜덤 가격을 저장할 변수
			
			int sellPrice = priceRan.nextInt(10000) + 1;		// 1원~10000원
			
			System.out.println("\n------------- 잡은 채집물 -------------");
			for (int i=0; i<box.size(); i++) {
				System.out.print(box.get(i) + " ");
			}
			System.out.println("\n-----------------------------------");
			
			String selName = "";
			int icount = 0;
			while (true) {
				System.out.println("▷ 판매하시려는 채집물의 이름을 입력해주세요.");
				System.out.print("▷ 채집물명 : ");
				selName = in.nextLine();
				
				for (int i=0; i<box.size(); i++) {
					if (box.get(i).equals(selName)) {
						icount++;
					}
				}
				
				if (icount==0) {
					System.out.println("\n'" + selName + "'(이)라는 채집물을 가지고 있지 않습니다.");
					return;
				} else {
					break;
				}
			}
			
			String selNum = "";
			while (true) {
				int sNum = 0;
				try {
					System.out.println("\n▷ '" + selName + "'(은)는 " + icount + "개 가지고 있습니다.");
					System.out.println("▷ 몇 개를 판매하실 건가요?");
					System.out.print("▷ 개수 : ");
					selNum = in.nextLine();
					sNum = Integer.parseInt(selNum);
				} catch (Exception e) {
					System.out.println("\n올바른 입력 방식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
					continue;
				}
				
				if (sNum == 0 || icount < sNum) {
					System.out.println("\n" + sNum + "개는 판매할 수 없습니다.");
					System.out.println("다시 입력해주세요.");
				} else {
					String check = "";
					int sellMoney = 0;
					// 나뭇잎, 나뭇가지, 돌멩이, 빈깡통일 경우의 조건
					if (selName.equals("나뭇잎") || selName.equals("나뭇가지") || selName.equals("돌멩이") || selName.equals("빈깡통")) {
						sellMoney = sNum;
						
						System.out.println("\n▷ '" + selName + "'은 1원입니다.");
						System.out.print("▷ 총 " + sNum + "개를 " + sellMoney + "원에 판매하시겠습니까? (Y/N) : ");
						check = in.nextLine();
						
						if (check.equals("y") || check.equals("Y")) {
							System.out.println("\n" + selName + "(을)를 " + sNum + "개 판매했습니다.");
							chr.cmoney += sellMoney;
							System.out.println("총 수익 : " + sellMoney + "원 (내 지갑: "+chr.cmoney+"원)");
							for (int i = 0; i < sNum; i++) {
								for (int j=0; j<box.size(); j++) {
									String iname = box.get(j);
									if (iname.equals(selName)) {
										box.remove(j);
										break;
									}
								}
							}
							break;
						} else if (check.equals("n") || check.equals("N")) {
							System.out.println("\n판매를 취소합니다.");
							break;
						} else {
							System.out.println("\n올바른 입력 방식이 아닙니다.");
							System.out.println("다시 입력해주세요.");
						}
					} else {
						for (int i=0; i<box.size(); i++) {
							if (box.get(i).equals(selName)) {
								sellMoney += sellPrice;
							}
						}
						
						System.out.println("\n▷ '" + selName + "'의 현재 시가는 " + sellPrice + "원입니다.");
						System.out.print("▷ 총 " + sNum + "개를 " + sellMoney + "원에 판매하시겠습니까? (Y/N) : ");
						check = in.nextLine();
						
						if (check.equals("y") || check.equals("Y")) {
							System.out.println("\n" + selName + "(을)를 " + sNum + "개 판매했습니다.");
							chr.cmoney += sellMoney;
							System.out.println("총 수익 : " + sellMoney + "원 (내 지갑: "+chr.cmoney+"원)");
							for (int i = 0; i < sNum; i++) {
								for (int j=0; j<box.size(); j++) {
									String iname = box.get(j);
									if (iname.equals(selName)) {
										box.remove(j);
										break;
									}
								}
							}
							break;
						} else if (check.equals("n") || check.equals("N")) {
							System.out.println("\n판매를 취소합니다.");
							break;
						} else {
							System.out.println("\n올바른 입력 방식이 아닙니다.");
							System.out.println("다시 입력해주세요.");
						}
					}
				}
			}
		} else {
			System.out.println("\n가지고 있는 채집물이 없습니다.");
		}
	}
	
}