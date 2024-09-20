package _09_Class_Test2;

import java.util.Scanner;

// 전체 기차를 관리(수정,조회,수리)할 클래스 정의                 -- 클래스명은 대문자로 시작, 변수와 메서드는 소문자로 시작.. 수정합시다. 아래로 쪽 살펴 보세요 ㅎ
public class TrainCenter {
	
	TrainOne[] train = new TrainOne[5];		
	// TrainOne객체의 주소를 저장할 배열의 길이를 기차번호 배열길이와 같게 선언(기차번호가 있을때만 기차등록이 가능하므로)
	int [] t_num = {1111,2222,3333,4444,5555};
	String [] t_name = {"무궁화","새마을","무궁화","새마을",""};
	Scanner in = new Scanner(System.in);
	
	TrainCenter() {
		System.out.println("------기차 전광판(초기)------");
		t_origin();
		System.out.println("전광판의 모든 기차에 대한 도착시간을 입력하세요.");
		t_add();
		System.out.println("------기차 전광판(도착시간 추가)------");
		for (int i = 0; i < t_num.length; i++) { // 기준을 기차번호가 존재할때로 두어 null값에 대한 출력에러 방지
			train[i].prt();
		}
		while(true) {
			System.out.println("원하는 항목을 선택하세요.");
			System.out.println("1. 기차시간 수정");
			System.out.println("2. 기차 전체 조회");
			System.out.println("3. 기차 수리정보 추가");
			System.out.println("4. 기차 수리정보 조회");
			System.out.println("---------------------");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				t_mod();
			}else if(selNum==2) {
				t_allList();
			}else if(selNum==3) {
				t_fix();
			}else if(selNum==4) {
				t_fixSt();
			}else {
				break;
			}
			
		}
	}
	
	public void t_origin() {		// 기차의 기본정보 입력하는 메소드 정의
		for (int i = 0; i < t_num.length; i++) {	
			// 저장 기준이 기차 번호가 되도록 반복길이를 기차번호 저장 배열의 길이로 설정(기차 번호만큼 다른값이 모두 존재해야함)
			TrainOne a = new TrainOne();
			a.train_num = t_num[i];
			a.train_cate = t_name[i];	
			if(train[i]==null) { 
				train[i] = a;
			}
		}
		for (int i = 0; i < train.length; i++) {		// 도착시간 추가전 초기버전 전광판 출력
			if(train[i] != null) {
				train[i].prt();
			}
		}
	}
	
	public void t_add() {
		for (int i = 0; i < t_num.length; i++) {	// 기준을 기차번호가 존재할때로 두어 null값에 대한 에러 방지
			if(train[i]!=null) {
				System.out.println((i+1)+"번 기차의 도착시간을 입력하세요(숫자4자리 - 시/분)");
				String time = in.nextLine();
				train[i].train_arrtime = time;
				System.out.println("기차번호 "+train[i].train_num+" / 입력한 도착시간은 "+train[i].train_arrtime);
			}
		}
	}
	
	public void t_mod() {		// 기차 도착시간을 수정가능하게 할 메소드 정의
		System.out.println("도착시간을 수정할 기차 번호를 입력하세요.");
		int modNum = in.nextInt();
		in.nextLine();
		for (int i = 0; i < train.length; i++) {
			if(train[i]!=null) {
				if(train[i].train_num==modNum){
					System.out.println("수정 시간을 입력하세요(숫자4자리 - 시/분)");
					String time = in.nextLine();
					train[i].train_arrtime = time;
					break;
				}
			}
			if(i==train.length-1) {
				// break가 걸리지않고, 끝번호까지 되었을때(즉, 해당 값이 존재하지 않는 기차번호일때) 에러발생 문구 출력
				// 저장되어있는 전체 기차 중에 입력받은 기차가 존재하지 않을때 에러 발생
				System.out.println("존재하지 않는 기차 번호입니다.  -- 에러발생");
				break;					
			}
		}
	}
	
	public void t_allList() {		// 전체 기차의 정보를 출력할 메소드 정의
		for (int i = 0; i < train.length; i++) {
			if(train[i]!=null) {
				if(train[i].train_cate.equals("새마을")){
					train[i].train_cate += '*';    //                                                                                     
				}
				if(train[i].train_status!="수리중") {
					train[i].prt();					
				}
			}
		}
	}
	
	public void t_fix() {		// 기차 수리중인 상태를 추가할 메소드 정의
		System.out.println("수리중으로 추가할 기차의 번호를 입력하세요.");
		int fixNum = in.nextInt();
		in.nextLine();
		for (int i = 0; i < train.length; i++) {
			if(train[i]!=null) {
				if(train[i].train_num==fixNum) {
					train[i].train_status = "수리중";
					break;
				}
			}
			if(i==train.length-1) {
				// break가 걸리지않고, 끝번호까지 되었을때(즉, 해당 값이 존재하지 않는 기차번호일때) 에러발생 문구 출력
				System.out.println("존재하지 않는 기차 번호입니다.  -- 에러발생");
				break;					
			}
		}
	}
	
	public void t_fixSt() {		// 수리중인 기차의 목록을 출력할 메소드 정의
		for (int i = 0; i < train.length; i++) {
			if(train[i]!=null) {
				if(train[i].train_status.equals("수리중")) {
					train[i].fix();
				}
			}
		}
	}
	

}
