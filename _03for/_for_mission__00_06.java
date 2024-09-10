package _03for;

//import java.util.Scanner;

public class _for_mission__00_06 {

	public static void main(String[] args) {
//		0 선택받은너
//		짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i=0;i<letter.length;i++) {		
			// 반복문의 횟수가 letter 배열의 길이만큼 반복되도록함(index는 0부터 시작이므로 미만으로지정)
			if(letter[i]%2==0) {		// value의 값이 짝수일때
				System.out.print(letter[i]+" ");  // 출력되도록 설정
			}
		}
		System.out.println("");
		
//		1 큰놈
//		배열의 가장 큰수가 있는 인덱스를 출력하시오.
//		int[] letter={8,12,4,13,2,14,4,5}
		int max=0;		// 가장 큰 수를 비교해줄 max변수를 초기값 0으로 선언
		int mi=0;		// 가장 큰 수 일때의 index값을 출력하기위한 mi변수를 0으로 선언
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>=max) {		// 초기의 max값과비교하여
				max=letter[i];
				// 해당 i의 index에 대한 value값이 더 크면, max를 해당값으로 변경하여 저장
				mi=i;	// 그때의 i값, 최대값의 index값을 mi에 저장
			}
		}
		System.out.println(mi);		// 반복문이 끝난 후 최종적으로 결정된 최대값의 index값 출력
//
//		2 현상수배
//		범인을찾으시오
//		범인은 짝수이면서 가장큰 값이다. 
//		범인은 14입니다. 
//		int[] letter={8,12,4,13,25,14,4,5}
		int max1=0;		// 가장 큰 수를 비교해줄 max1변수를 초기값 0으로 선언 
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>=max1&&letter[i]%2==0) {		
				// 배열의 value값 중에 max1값(최대값)보다 크고, 그 값이 짝수인 경우에(조건 모두 충족하는 경우)
				max1=letter[i];
				// 해당 값을 max1값으로 변경하여 저장
			}
		}
		System.out.println(max1);		// 반복문이 끝난 후 최종적으로 결정된 max1값 출력
//
//		3 비밀편지
//		letter  배열은 word문자열 알파벳의 위치이다.
//		letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		
		/*분석
		 * word문자열을 각각의 문자열로 나타냈을때(즉 word.charAt())일때, letter1의 value값을 모두 출력하면 됨
		 *  즉 word.charAt(letter1의 value값)이고, letter1의 길이만큼 이것을 반복하여 결과로 나타내면됨
		 */
		String word ="gehoudfkimjnlvy";
		int[] letter1={8,12,3,13,1,14,3,4};
		// 반복길이를 letter1길이로 설정하여 word.charAt(letter1의 value값)을 모두 출력할 for문 작성
		for(int i=0;i<letter1.length;i++) {		
			System.out.print(word.charAt(letter1[i]));
		}
		System.out.println("");
				
//		4 난건물주
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		
		/*분석
		 *문제를 해석했을 때, 풀어낼 과정들을 생각해보면,
		 *건물의크기, 공터, 공터의크기, 위치의 갯수를 세어줄 변수가 필요해보임
		 *그러한 변수들로 arr배열의 길이만큼 돌면서 위치의 갯수를 세어야하는데,
		 *공터의 크기를 건물의 크기로 나눈값이 0이 아닐때,
		 *즉, 총 공터의 길이를 사이즈로 나눈값이 1일때부터 그 이상 계속하여 
		 *지을 수 있는 위치의 갯수또한 1씩 꾸준히 증가하기에
		 *이를 누적 카운트해서 나타내면 됨
		 */
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;	// 문제에서 주어진 건물의 크기를 선언
		int barr=0;	// 문제에서 주어진 공터를 선언
		int cnt=0;	// 공터의 크기를 측정할 변수 cnt를 초기값 0으로 선언
		int bnt=0;	// 지을 수 있는 위치의 갯수를 셀 변수 bnt를 초기값 0으로 선언
		// 위에서 찾은 규칙을 arr배열의 길이만큼 반복할 for문 작성
		for(int i=0;i<arr.length;i++) {		
			if(arr[i]==barr) {	
				cnt++;	
				// 배열 값이 공터에 해당할 때 공터의 길이 증가
				if(cnt/size!=0) {	
					bnt++;
					// 조건에 만족할 때 위치 증가
				}
			}else {
				cnt=0;	
				// 공터의 길이가 측정되다가 끊겼을 때, 즉 0이 아닌 다른 값이 나왔을 때는 길이를 0으로 초기화
			}
		}System.out.println(bnt+"개");		// 총 카운트 된 bnt를 최종적으로 출력

//
//		5. 앞뒤가똑같은너
//		키보드로 문자를 입력받는다. 
//		문자로 입력 받는 방법은 
//		Scanner in = new Scanner(System.in);
//		String a  = in.nextLine();     숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
//		이때 문자열의 길이(b)는 0보다 크고 10보다 작으며 짝수만 가능하다.
//		조건에 만족될때까지 문자 입력을 받는다.
//		문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요
//		Scanner in = new Scanner(System.in);
//		String a  = in.nextLine();
//		int b=a.length();
//		String a1="";
//		String a2="";
//		if((b>0 && b<10) && b%2==0) {
//			for(int i=1;i<=b/2;i++){
//				a1+=a.charAt(i);
//			}
//			for(int i=b;i>b/2;i--) {
//				a2=a.charAt(i);
//			}
//			if(a1==a2) {
//				System.out.println(a);
//			}		
//		}else {
//			System.out.println("다시 입력하세요");
//		}
//
//
//		6
//		String a ="23-56+45*2-56";				"-32가 나와야함"
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
		
		/*분석
		 * 주어진 문자열에서 계산할 숫자와 연산자를 구분하는 것이 가장 먼저 필요한 과정
		 * 그렇기 때문에 이를 구분할 기준을 설정
		 * (주어진 문자열에서 정수로 변환한 값이 48이상이면, 계산할 숫자이고 그것이 아니면 연산자) 
		 * 조건을 줄때 int로 전환한 값을 48로 나누기 보다는
		 * '0'<=A.charAt(i) 이런식으로 그 문자 자체를 비교해도 이상 이하의 비교문을 사용가능하다!!
		 */
		String A ="23-56+45*2-56";
		String B="";
		int c=0;
		int d=0;
		int e=0;
		char S=' ';
		for(int i=0;i<A.length();i++) {
			if('0'<=A.charAt(i)) {
				B+=(char)A.charAt(i);
			}
			else{    
				c = Integer.parseInt(B);
				e++;
				if(e==1) {
					d=c;
					c=0;
					B="";
					S=(char)A.charAt(i);
				}else{
					c = Integer.parseInt(B);
					if(S=='*') {
						c=d*c;
					}else if(S=='+') {
						c=d+c;
					}else if(S=='-') {
						c=d-c;
					}else if(S=='/') {
						c=d/c;
					}
					d=c;
					B="";
					S=(char)A.charAt(i);
				}
			}
			if(i==(A.length()-1)){     // 마지막경우:c=56,S=-,d=24(따로 계산되게 만들어주기)
				c = Integer.parseInt(B);
				if(S=='*') {
					c=d*c;
				}else if(S=='+') {
					c=d+c;
				}else if(S=='-') {
					c=d-c;
				}else if(S=='/') {
					c=d/c;
				}
			}
		}
		System.out.println("계산결과: "+c);
	}

}
