package _05이중for문;

public class _2for_05 {

	public static void main(String[] args) {
//		5.
//		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599}
//		int[] parking = new int[10];
//		   carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
//		   parking의 인덱스 번호가 주차번호이다. 
//		   자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
//		   만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
//		   (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
//
//		   주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오.
		// 자동차 번호의 마지막 번호를 추출
		// 그 번호를 index로 하여 parking에 자동차번호를 저장
		// 만약 parking에 저장값이 있으면(초기값인 0이 아니면)
		// -> index값에 +1을 하면서 0이나올때까지찾아서 break->조건, 반복
		// 1232->2, 1221->1, 1235->5, 1252->2+1(3), 1234->4, 4536->6, 
		// 3457->7, 3238->8, 3229->9, 2599->(9->0)
		
		// 코드작성
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599}; //자동차번호
		int[] parking = new int[10];	// 주차번호
		int p=0;
		for (int i = 0; i < carnum.length; i++) {
			p=carnum[i]%10;
			for (int j = p; j < parking.length; j++) {
				if(parking[p]==0) {
					parking[p]=carnum[i];
					break;
				}
				if(parking[p]!=0&&j!=parking.length-1) {
					for (int j2 = p+1; j2 < parking.length ; j2++) {
						if(parking[j2]==0) {
							parking[j2]=carnum[i];
							break;
						}if(j2==parking.length-1) {
							j2=0;
						}
					}
				break;	
				}
				if(p==parking.length-1&&parking[p]!=0) {
					for (int j2 = 0; j2 < parking.length; j2++) {
						if(parking[j2]==0) {
							parking[j2]=carnum[i];
						}
					}
				break;	
				}
			}
		}
		for (int i = 0; i < parking.length; i++) {
			System.out.print(parking[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		
		//깔끔한 풀이
		int[] carnum1 = {1232,1221,1235,1252,1234,4536,3457,3239,3229,2599};
		int[] parking1 = new int[10];

		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		for(int i=0; i < carnum1.length; i++) {
			//초기 주차 정보 분석
			nowCar = carnum1[i];
			carPositionIndex = nowCar%10;
			System.out.println(nowCar+"차량 "+carPositionIndex +" 번이 주차자리입니다");

			// 주차장에 자리가 있다면
			if(totalCarCnt < parking1.length) {
				//빈자리를 찾을 때 까지 반복
				for(;parking1[carPositionIndex]!=0;) {
					System.out.println("빈자리인지 확인 중입니다.");
					carPositionIndex=(carPositionIndex+1)%(parking1.length);
					System.out.println(carPositionIndex+"번호로 새로 배정");
				} 
	// 내가 작성한 코드와 다른 부분(생각하지 못한 부분)*******************
	// for문의 증감식 자리에서 찾으려는 번호의 증감을 주지않고,  
	// 식 자체에서 증감을 표현하여, 그것이 조건을 만족할 때까지 증감되도록 설정함
	// 무한루프의 변형->종료조건만 주고, 거기에 맞게 변형되고자하는 부분들을 for문 내에서 수정
	// 꼭 무한루프와 break를 쓰지 않아도, 조건을 만족할 경우 실행 종료후 빠져나오게 하는 반복문을 만들 수 있음

				// 22 반복문에서 빈자리를 찾았다면
				System.out.println(carPositionIndex+"번호에 주차 합니다");
				parking1[carPositionIndex]=nowCar;		
				totalCarCnt++;				
			}

		}
		
	}

}
