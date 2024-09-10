package _03for;

public class for예제풀이 {

	public static void main(String[] args) {
//		12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
//		   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
//		step1.for문으로 배열순회 초기값 0~ 0<배열의길이 i++
//			  i는 배열의 index
//		step2.현재번호. arr[i] -> 터널인지 아닌지.arr[i]==0
//			  참이면 카운팅(변수) / 거짓이면 카운팅 cnt 초기화
//		step3.제일 긴 터널의 길이를 저장
//			  cnt++;아래에 판단, cnt증가시 비교
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cnt=0;
		int maxLength=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				cnt++;
			}else {
				cnt=0;
			}
			if(cnt>maxLength) {
				maxLength=cnt;
			}
//			}System.out.println(i+"/"+cnt); ---step2까지 확인
		}System.out.println(maxLength);
		
		
		
//		13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3}
//		   숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int cnt1=1;
		int bT=arr[0];
		int maxLength1=0;
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==bT) {
				cnt1++;
			}else {
				cnt1=1;
				bT=arr[i];
			}
			System.out.println(i+"/"+cnt1);
			if(maxLength1<cnt1) {
				maxLength1=cnt1;
				maxIndex=bT;
			}
		}
		System.out.println(maxLength1);
		System.out.println(maxIndex);
		
//		9.  
//		String test = "abcdeabce";
//	    for(int i=0; i < 9; i ++){
//	    	char aaa = test.charAt(i);	// .은 test라는 부품을 참조함을 의미함(냉장고.opendoor)
		// charAt은 char를 하나씩 가져오라는 것
//	    	sysout(aaa);	// 문자열 부품이 제공하는 기능(*메서드)으로 문제를 해결함을 의미함
//	    }
		
//		String test ="abcdeabce";  // test.하면 다양한 method가 나옴->test는 참조타입임을 의미
//		int a=10;		// a.하면 아무 method도 나오지 않음->a는 원시타입임을 의미
		
		
//		14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
//		step1.문자열의 문자를 가져온다. 문자를 첫번째부터 하나씩 가져온다.
		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		 for(int i=0;i<ttt.length();i++) {		// 여기서 i는 String의 문자를 가져오기 위함
			 char A = ttt.charAt(i);
			 System.out.println(A);
		 }
		
	}
}

	
