package _09_Class_Test2;

import java.util.Scanner;

// 전체 기차를 관리(수정,조회,수리)할 클래스 정의
public class TrainCenter {
	
	TrainOne[] Train = new TrainOne[5];		
	// TrainOne객체의 주소를 저장할 배열의 길이를 저장할 기차 갯수보다(기차번호 배열길이) 크게 선언하여 시스템 에러를 확인
	int [] T_num = {1111,2222,3333,4444};
	String [] T_name = {"무궁화","새마을","무궁화","새마을"};
	Scanner in = new Scanner(System.in);
	
	TrainCenter() {
		System.out.println("------기차 전광판(초기)------");
		T_origin();
		System.out.println("전광판의 모든 기차에 대한 도착시간을 입력하세요.");
		T_add();
		System.out.println("------기차 전광판(도착시간 추가)------");
		for (int i = 0; i < T_num.length; i++) { // 기준을 기차번호가 존재할때로 두어 null값에 대한 출력에러 방지
			Train[i].prt();
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
				T_mod();
			}else if(selNum==2) {
				T_allList();
			}else if(selNum==3) {
				T_fix();
			}else if(selNum==4) {
				T_fixSt();
			}else {
				break;
			}
			
		}
	}
	
	public void T_origin() {		// 기차의 기본정보 입력하는 메소드 정의
		for (int i = 0; i < T_num.length; i++) {	
			// 저장 기준이 기차 번호가 되도록 반복길이를 기차번호 저장 배열의 길이로 설정(기차 번호만큼 다른값이 모두 존재해야함)
			TrainOne a = new TrainOne();
			a.train_num = T_num[i];
			if(Train[i]==null) {
				Train[i] = a;
			}
			if(Train[i]!=null) {		// 기차 번호가 있다면, 기차이름을 저장하는 형태
				// 기차입력시 기차번호가 존재하지 않으면 입력오류이며 등록하지 않는다는 조건을 만족하기 위해 따로 조건 작성 
				a.train_cate = T_name[i];
				Train[i]=a;
			}
		}
		for (int i = 0; i < Train.length; i++) {		// 도착시간 추가전 초기버전 전광판 출력
			if(Train[i] != null) {
				Train[i].prt();
			}
		}
	}
	
	public void T_add() {
		for (int i = 0; i < T_num.length; i++) {	// 기준을 기차번호가 존재할때로 두어 null값에 대한 에러 방지
			if(Train[i]!=null) {
				System.out.println((i+1)+"번 기차의 도착시간을 입력하세요(숫자4자리 - 시/분)");
				String time = in.nextLine();
				Train[i].train_arrtime = time;
				System.out.println("기차번호 "+Train[i].train_num+" / 입력한 도착시간은 "+Train[i].train_arrtime);
			}
		}
	}
	
	public void T_mod() {		// 기차 도착시간을 수정가능하게 할 메소드 정의
		System.out.println("도착시간을 수정할 기차 번호를 입력하세요.");
		int modNum = in.nextInt();
		in.nextLine();
		int cnt=0;
		for (int i = 0; i < Train.length; i++) {
			if(Train[i]!=null) {
				if(Train[i].train_num==modNum) {
					System.out.println("수정 시간을 입력하세요(숫자4자리 - 시/분)");
					String time = in.nextLine();
					Train[i].train_arrtime = time;
					break;
				}
			}
			if(Train[i].train_num!=modNum) {	// 저장되어있는 전체 기차 중에 입력받은 기차가 존재하지 않을때 에러 발생
				cnt++;
				if(cnt==Train.length) {
					System.out.println("존재하지 않는 기차 번호입니다.  -- 에러발생");
					break;
				}
			}
		}
	}
	
	public void T_allList() {		// 전체 기차의 정보를 출력할 메소드 정의
		for (int i = 0; i < Train.length; i++) {
			if(Train[i]!=null) {
				if(Train[i].train_cate.equals("새마을")){
					Train[i].train_cate += '*';
				}
				if(Train[i].train_status!="수리중") {
					Train[i].prt();					
				}
			}
		}
	}
	
	public void T_fix() {		// 기차 수리중인 상태를 추가할 메소드 정의
		System.out.println("수리중으로 추가할 기차의 번호를 입력하세요.");
		int fixNum = in.nextInt();
		in.nextLine();
		int cnt=0;
		for (int i = 0; i < Train.length; i++) {
			if(Train[i]!=null) {
				if(Train[i].train_num==fixNum) {
					Train[i].train_status = "수리중";
					break;
				}
			}
			if(Train[i].train_num!=fixNum) {
				cnt++;
				if(cnt==Train.length) {
					System.out.println("존재하지 않는 기차 번호입니다.  -- 에러발생");
					break;
				}
			}
		}
	}
	
	public void T_fixSt() {		// 수리중인 기차의 목록을 출력할 메소드 정의
		for (int i = 0; i < Train.length; i++) {
			if(Train[i]!=null) {
				if(Train[i].train_status.equals("수리중")) {
					Train[i].fix();
				}
			}
		}
	}
	

}
