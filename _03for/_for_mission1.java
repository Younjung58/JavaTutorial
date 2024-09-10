package _03for;

import java.util.Scanner;

public class _for_mission1 {

	public static void main(String[] args) {
//		0 선택받은너
//		짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i=0;i<letter.length;i++) {
			if(letter[i]%2==0) {
				System.out.print(letter[i]+" ");
			}
		}
		System.out.println("");
		
//		1 큰놈
//		배열의 가장 큰수가 있는 인덱스를 출력하시오.
//		int[] letter={8,12,4,13,2,14,4,5}
		int max=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>=max) {
				max=letter[i];
			}
		}
		System.out.println(max);
//
//		2 현상수배
//		범인을찾으시오
//		범인은 짝수이면서 가장큰 값이다. 
//		범인은 14입니다. 
//		int[] letter={8,12,4,13,25,14,4,5}
		int max1=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>=max1&&letter[i]%2==0) {
				max1=letter[i];
			}
		}
		System.out.println(max1);
//
//		3 비밀편지
//		letter  배열은 word문자열 알파벳의 위치이다.
//		letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		String word ="gehoudfkimjnlvy";
		int[] letter1={8,12,3,13,1,14,3,4};
		for(int i=0;i<letter1.length;i++) {
			System.out.print(word.charAt(letter1[i]));
		}
		System.out.println("");
				
//		4 난건물주
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int barr=0;
		int cnt=0;
		int bnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==barr) {
				cnt++;
				if(cnt/size!=0) {
					bnt++;
				}
			}else {
				cnt=0;
			}
		}System.out.println(bnt+"개");

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
//		if((b>0 && b<10) && b%2==0) {
//			for(int i=1;i<=b/2;i++)
//				if(a.charAt(i)==a.charAt((b+1)-i)){
//					System.out.println(a);
//				}
//		}else {
//			System.out.println("다시 입력하세요");
//		}
//
//
//		6
//		String a ="23-56+45*2-56";				-12가 나와야함
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
		String A ="23-56+45*2-56";
		String B="";
		int c=0;
		int d=0;
		int e=0;
		for(int i=0;i<A.length();i++) {
			if(48<=(int)A.charAt(i)) {
				B+=(char)A.charAt(i);
			}else{
				e++;
				c = Integer.parseInt(B);
				if(e==1) {
					d=c;
					B="";
				}
				else if((char)A.charAt(i)=='*') {
					c=d*c;
				}else if((char)A.charAt(i)=='+') {
					c=d+c;
				}else if((char)A.charAt(i)=='-') {
					c=d-c;
				}else if((char)A.charAt(i)=='/') {
					c=d/c;
				}
				d=c;
				B="";
				System.out.println(c);
			}
		}

	}

}
