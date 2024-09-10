package _04Random;

import java.util.Iterator;

public class _Q07 {

	public static void main(String[] args) {
//		7. int jobTime ={40,32,4,16,5,8};
//		위 배열에서 인덱스를 사람의 번호로 가정한다.
//		jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
//		작업장을 사용할 수 있는 시간은 최대  4시간이다.
//		작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
//		다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
//		0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
//		실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		
/* 시나리오 작성
 * 		첫번째 -> 40-4,32-4,4-4,16-4,5-4,8-4          // 0 1 2 3 4 5
 * 		두번째 -> 36-4,28-4,0,12-4,1-4,4-4				// 0 1 3 4 5
 * 		세번째 -> 32-4,24-4,-,8-4,-,-	        		// 0 1 3  
 * 		네번재 -> 28-4,20-4,-,4-4,-,-					// 0 1 3
 * 		다섯번째-> 24-4,16-4,-,0,-,-					// 0 1
 * 		여섯번째-> 20-4,12-4,-,-,-,-					// 0 1
 * 		일곱번째-> 16-4,8-4,-,-,-,-					// 0 1
 * 		여덟번째-> 12-4,4-4,-,-,-,-					// 0 1
 * 		아홉번째-> 8-4,0,-,-,-,-						// 0
 * 		열번째 -> 4-4,-,-,-,-,-						// 0
 * 
 * 		결과 : 0 1 2 3 4 5/0 1 3 4 5/0 1 3/0 1 3/0 1/0 1/0 1/0 1/0/0
 */
		/* 반복의 종료조건을 생각
		 * 값이 0또는 음수가 되었을때, 그 값을 동일값으로 변경해주어서
		 * 모든 배열의 값이 동일값이 되었을때, 함수를 종료하면 됨
		 */
		
		int jobTime[] = {40,32,4,16,5,8};
		int maxTime=4;
		for (int i = 0; i < jobTime.length; i++) {
			if(jobTime[i]%maxTime==0) {
				jobTime[i]=(jobTime[i]/maxTime);
			}else {
				jobTime[i]=(jobTime[i]/maxTime)+1;
			}
		}
		for (int i = 0; i < jobTime.length; i++) {
			System.out.println("작업할 횟수: "+i+"는 "+jobTime[i]+"번");
		}  // 각 사람별 작업횟수 확인

		
		int sum=jobTime[0]+jobTime[1]+jobTime[2]+jobTime[3]+jobTime[4]+jobTime[5];
		
		int cnt=0;
		for (int i = 0; ; ) {
			if(i!=jobTime.length-1&&jobTime[i]!=0) {
				System.out.print(i+" ");
				jobTime[i]--;
				i++;
				cnt++;
			}else if(i==jobTime.length-1&&jobTime[i]!=0) {
				System.out.print(i+" / ");
				jobTime[i]--;
				i=0;
				cnt++;
			}else if(i!=jobTime.length-1&&jobTime[i]==0) {
				i++;
				continue;
			}else if(i==jobTime.length-1&&jobTime[i]==0) {
				i=0;
				System.out.print(" / ");
			}
			if(cnt==sum) {
				break;
			}
		}
		
		
		System.out.println("\n");
		
		
		// 깔끔한 풀이
		int[] Jobtime ={40,32,4,16,5,8};
		int jobUseNum=0;
		int jobUseTotalCount = Jobtime.length;
		int useTime=4;
		int finish=0;
		for(;;) {
			if(Jobtime[jobUseNum]>0) {
				System.out.println(jobUseNum+"이 사용중입니다. / ");
				Jobtime[jobUseNum]-=useTime;
				System.out.println(Jobtime[jobUseNum]+"시간 남았습니다.");
				if(Jobtime[jobUseNum]<=0) {
					System.out.println("***"+jobUseNum+"이 이용을 완료함.");
					finish++;
				}
			}
			if(finish==Jobtime.length) {
				break;
			}
			jobUseNum++;
			jobUseNum=jobUseNum%Jobtime.length;
			
			System.out.println(jobUseNum+"의 차례입니다.");
		}
	}

}
