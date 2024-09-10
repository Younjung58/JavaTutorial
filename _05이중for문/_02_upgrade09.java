package _05이중for문;

public class _02_upgrade09 {

	public static void main(String[] args) {
//		9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt=0;			// 현재의 길이를 카운트 할 변수
		int max=0;			// 가장 긴 길이를 저장할 변수
		char num=' ';
		char Mnum=' ';
		for (int i = 0; i < ttt.length()-1; i++) {		// for문 1개
			if(ttt.charAt(i)==ttt.charAt(i+1)) {
				num=ttt.charAt(i);
				for (int j=i; j < ttt.length(); j++) {		// for문 2개
					if(ttt.charAt(j)==num) {
						cnt++;
					}
					else{
						if(cnt>=max) {
							max=cnt;
							Mnum=num;
						}
						i=i+cnt-1;	//아래 적은 다른 변형적 생각을 참고하여 수정한 부분(효율적 코드)
						cnt=0;
						break;
					}
				}
			}
		}
		if (ttt.charAt(ttt.length()-1)==Mnum) {
			System.out.println("알파벳이름: "+Mnum+" / "+"숫자: "+(max+1));
		}else {
			System.out.println("알파벳이름: "+Mnum+" / "+"숫자: "+max);
		}
	
	
	
	// 다른 변형적 생각
	// i값에 따라서 시작점이 다르게 시작되어지는 반복문을 작성 하여 풀 수 있음
	// a중에 가장 긴 a? -> i는 a문자열의 index
//	String a ="aabbbcccaaaaddbbbaaaaa";		// 만나는 a의 시작점마다 for문을 시작하면 됨(조건)
	// 마지막에 i를 'i+cnt-1'로 만들어주면, 
	// 새롭게 시작될 때 i++이 적용되어서 이미 카운트된 길이를 넘어가서
	// 코드를 시작할 수 있기에 더 효율적인 코드가 된다.
	String a ="aabbbcccaaaaddbbbaaaaa";
	int maxcnt=0;
	int cntt=0;
	char maxChar=' ';
	char nowChar=' ';
	for(int i=0;i<a.length();i++) {
		nowChar=a.charAt(i);
		cntt=0;
		for (int j = i; j <a.length(); j++) {
			if(a.charAt(j)!=nowChar) {
				break;
				}else {
					cntt++;
				}
			}
		if(maxcnt<cntt) {
			maxcnt=cntt;
			maxChar=nowChar;
			}
		}
	System.out.println("알파벳: "+maxChar+", 숫자: "+maxcnt);
	}
}

