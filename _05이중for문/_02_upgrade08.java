package _05이중for문;

public class _02_upgrade08 {

	public static void main(String[] args) {
//		8.
//		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
//		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
//		가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
//		제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int start=pang[0];
		int s=0;
		int cnt=0;
		for (int i = 0; i < pang.length-1; i++) {
			if(pang[i]==pang[i+1]) {
				for (int j = i; j < pang.length; j++) {
					if(pang[i]==pang[j]) {
						cnt++;
//						System.out.println(cnt);
					}if(pang[i]!=pang[j]){
						start=pang[i];
						s=i;
						i=j;
						break;
					}
				}
				if(cnt>=3) 
					System.out.println("제거대상"+start+", 시작위치: "+s+", 갯수는: "+cnt);
				cnt=0;
			}
		}
		
		
		// 9번의 다른 변형적 사고와 비슷한 풀이로 다시 풀기
		int[] ppang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int cntt=0;
		int nowNum=0;
		for (int i = 0; i < ppang.length; i++) {
			nowNum=ppang[i];
			cntt=0;
			for (int j = i; j < ppang.length; j++) {
				if(ppang[j]==nowNum) {
					cntt++;
				}else {
					break;
				}
			}
			if(cntt>=3) {
				System.out.println("제거대상: "+ppang[i]+", 시작위치: "+i+", 갯수: "+cntt);
			}
			i=i+cntt-1;
		}
		
		
	}
}
