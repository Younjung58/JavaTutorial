package Box_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Character_Manager {
	ArrayList<Character_One> chr = new ArrayList<>();
	Shop shop = null;
	Character_One one = null;
	
	public Character_Manager() {
		// TODO Auto-generated constructor stub
		if(shop == null) {
			one = new Character_One();
			shop = new Shop();
		}
		one.saveShop(shop);
//		System.out.println(shop +"----Manager");
	}
	
	public void menu0() {
		menu();
		
	}
	
	public void menu() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1. 캐릭터 생성");
			System.out.println("2. 캐릭터 수정");
			System.out.println("3. 캐릭터 삭제");
			System.out.println("4. 캐릭터 선택(게임시작)");
			System.out.println("5. 게임 종료");
			System.out.println("원하는 항목을 선택하세요 > ");
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			if(sel==1) {
				chrAdd();
			}else if(sel==2) {
				chrMod();
			}else if(sel==3) {
				chrDel();
			}else if(sel==4) {
				chrSel();
			}else if(sel==5) {
				break;
			}			
		}
	}
	
	
	public void chrAdd() {			// 1. 캐릭터 생성의 기능을 하는 메소드 정의
		Scanner in = new Scanner(System.in);
		Character_One character = new Character_One();
		boolean flag = true;
		boolean flag1=true;	
		if(chr.size()> 5) {		// 최대 캐릭터 수 5명으로 지정
			System.err.println("캐릭터 수가 최대이므로 등록 불가합니다. 삭제 후 재등록 해주세요.");
			flag1=false;
		}
		while(flag1){
			while(true) {
				System.out.println("생성할 캐릭터의 이름을 입력하세요.");
				String cname = in.nextLine();
				if(check(cname)!=-1) {
					System.err.println("이미 존재하는 이름입니다. 다시 입력하세요.");
					flag = false;
				}else if(cname == ""){
					System.err.println("이름을 입력하셔야 합니다.");
				}else {
					character.cname(cname);
					flag = true;
					break;
				}				
			}
			if(flag) {
				System.out.println("캐릭터 성별을 선택하세요. - 남 / 여");
				String cgender = in.nextLine();
				if(cgender.equals("남") || cgender.equals("여")) {
					character.cgender(cgender);
					while(true) {
						System.out.println("비밀번호 4자리를 입력하세요.");
						String cpwd = in.nextLine();
						if(cpwd.length()==4) {
							character.cpwd(cpwd);
							System.out.println("캐릭터 생성이 완료되었습니다.");
							character.mychr();
							chr.add(character);
							flag1=false;
							break;
						}else {
							System.err.println("비밀번호 오류. 다시 입력하세요.");
						}
					}
				}else {
					System.err.println("오류입니다. 다시 생성하세요.");
				}
			}			
		}
	}
	
	
	public void chrMod() {		// 2. 캐릭터 정보 변경의 기능을 하는 메소드 정의
		int a = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("정보 변경을 원하는 캐릭터의 이름을 입력하세요.");
		String cname = in.nextLine();
		int num = 0;
		boolean flag = true;
		num = check(cname);
//		System.out.println(num+"***********");
		while(flag) {
			if(num!=-1) {
				while(flag) {
					flag = pwd(num,a);									
				}
			}else{
//				System.out.println(num+"++++++++++");
				System.err.println("해당이름은 존재하지 않습니다.");
				System.out.println("1. 변경 취소하기 / 2. 다시 이름 입력하기");
				int n = select();
				if(n==1) {
					break;
				}else if(n==2) {
					chrMod();
				}else {
					select();
				}
			}			
			break;
		}
	}
	
	private int check(String cname) {		// 추가. 이름 중복 확인
		for (int i = 0; i < chr.size(); i++) {
			if(cname.equals(chr.get(i).cname)) {
				return i;
			}
		}
		return -1;
	}
	
	private int select() {		// 추가. 사용자의 선택을 받는 기능의 메소드
		Scanner in = new Scanner(System.in);
		int sel = in.nextInt();
		in.nextLine();
		if(sel == 1) {
			return 1;
		}else if(sel==2) {
			return 2;
		}
		return 3;
	}
	
	private boolean chrModplus(int num) {		// 추가. 변경 확인
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("변경할 이름을 입력하세요.");
			String cname = in.nextLine();
			int check = check(cname);
			if(check==-1) {
				chr.get(num).cname(cname);
				System.out.println("아래와 같이 변경되었습니다.");
				chr.get(num).mychr();
				flag = false;
				return flag;
			}else{
				System.out.println("해당 이름은 이미 존재하는 이름입니다.");
				System.out.println("1. 변경 취소하기 / 2. 다시 이름 입력하기");
				int n = select();
				if(n==1) {
					return false;
				}else if(n==2) {
					chrModplus(num);
					break;
				}else {
					System.out.println("다시 선택하세요");
					select();
				}
			}
		}
		return false;
	}
	

	private boolean pwd(int num, int a) {		// 추가. 비번 확인 기능
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.println("비밀번호를 입력하세요.");
		String pwd = in.nextLine();
		if(pwd.equals(chr.get(num).cpwd)&&a==0) {
			flag=chrModplus(num);
			return flag;
		}else if(pwd.equals(chr.get(num).cpwd)&&a==1) {
			return false;
		}else {
			System.err.println("비밀번호가 일치하지 않습니다.");
			return true;
		}		
	}
	
	
	public void chrDel() {		// 3. 캐릭터 정보 삭제의 기능을 하는 메소드 정의
		int a = 1;
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.println("삭제를 원하는 캐릭터의 이름을 입력하세요.");
		String cname = in.nextLine();
		int num = check(cname);
		while(flag) {
			if(check(cname)!=-1) {
				while(flag){
					flag = pwd(num,a);					
				}
				chr.get(num).mychr();
				System.out.println("해당 정보의 캐릭터를 삭제하시겠습니까?");
				System.out.println("1. 삭제 취소하기 / 2. 삭제하기");
				int n = select();
				if(n==1) {
					break;
				}else if(n==2) {
					chr.remove(num);
					break;
				}else {
					System.out.println("다시 선택하세요");
					select();
					break;
				}
			}else{
				System.err.println("해당이름은 존재하지 않습니다.");
				System.out.println("1. 삭제 취소하기 / 2. 다시 이름 입력하기");
				int n = select();
				if(n==1) {
					break;
				}else if(n==2) {
					chrDel();
				}else {
					select();
				}
			}
			break;
		}
	}

	public void chrSel() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("원하는 캐릭터를 선택하세요.(해당 캐릭터 번호입력)");
			for (int i = 0; i < chr.size(); i++) {
				System.out.print((i+1)+": ");
				chr.get(i).mychr();
				System.out.println();
			}
			int sel = in.nextInt();
			if(sel<=chr.size()) {
				chr.get(sel-1).active.chr(chr.get(sel-1));
				shop.chr(chr.get(sel-1));
				chr.get(sel-1).saveShop(shop);
				chr.get(sel-1).menu();
				break;
			}else {
				System.out.println("존재하지 않는 캐릭터입니다.");
				System.out.println("1. 메인화면으로 가기 / 2. 다시 캐릭터 선택하기");
				if(select()==1) {
					break;
				}else if(select()==2) {
					continue;
				}else {
					select();
				}
			}			
		}
	}
}
