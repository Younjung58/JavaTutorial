package _05이중for문;

public class _02_upgrade10 {

	public static void main(String[] args) {
//		10 난건물주  <이중For사용>
//		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
//		
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		// 분석
		// arr배열값을 i
		// 만약 0이면, 길이 1씩 증가
		// size의 값이 나올때마다->그 길이에서 size의 값으로 뺀 값이 0이 될때까지
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int cnt=0;
		int building=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
				for (int j=0; arr[j]!=0; j++) {
					cnt++;
					if(cnt/size!=0) {
						building++;
					}
				}
			else {
				cnt=0;
			}
		}
		System.out.println(building+"개");
		
		
		
		// 9번의 다른 변형적 사고와 비슷한 풀이로 다시 풀기
		// 3일때->2개, 4일때->3개, 5일때->4개
		// 즉 (갯수-사이즈+1)개임
		int[] arrr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int sizee=2;
		int cntt=0;		// 길이측정
		int nowNum=0;
		int build=0;	// 건물 갯수 측정
		for (int i = 0; i < arrr.length; i++) {
			if(arrr[i]==0) {
				for (int j = i; j < arrr.length; j++) {
					if(arrr[j]==0) {
						cntt++;
					}else {
						break;
					}
				}
				if(cntt>=sizee) {
					build+=(cntt-sizee+1);
				}
				i=i+cntt-1;
				cntt=0;
			}
		}
		System.out.println("건물의 갯수는 "+build+"개 입니다.");
		
	}

}
