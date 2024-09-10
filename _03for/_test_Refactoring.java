package _03for;

public class _test_Refactoring {

	public static void main(String[] args) {
//		1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int add=0;
		for(int i=1; i<=100; i++){
			if(i%2!=0) {
				add+=i;
			}else {
				add-=i;
			}
		}
		System.out.println(add);
		
//		2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		int addE = 0;		// 짝수의 합을 더할 변수 addE를 초기값 0으로 설정
		int addO = 0;		// 홀수의 합을 더할 변수 addO를 초기값 0으로 설정
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {		// i의 값이 0부터 100까지 1씩 증가할때 2로 나눈 나머지가 0이 아니면
				addO+=i;		// 즉 홀수라면 addO에 그 i의 값을 더하여 누적하라
			}else {				// 그것이 아니라면(2로 나눈 나머지가 0이라면)
				addE+=i;		// 즉 짝수라면 addE에 그 i의 값을 더하여 누적하라
			}
		}
		System.out.println("홀수의 합: "+addO);
		System.out.println("짝수의 합: "+addE);
		
//		3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int cnt=0;		// 홀수의 갯수를 카운트하여 누적할 변수 cnt를 초기값 0으로 설정
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {		// i의 값이 홀수라면
				cnt++;			// cnt의 값을 1씩 증가(즉 홀수인 경우에 카운트 횟수를 증가하여 누적)
			}
		}
		System.out.println("홀수의 갯수: "+cnt+"개");
		
//
//		4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
//		    453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		int sum = 0;		// 모든 총합을 누적하여 계산할 변수 sum의 초기값을 0으로 설정
		for(int i=100;i<=999;i++) {		// 100부터 1씩 증가하여 999의 숫자까지
			sum+=((i/100)+((i%100)/10)+(i%10));		
			// sum에 i를 100으로 나눈 몫(백의자리수)과 
			// 100으로나눈 나머지(십의자리와 일의자리)를 10으로 나눈 몫(십의자리)과
			// 10으로 나눈 나머지(일의자리)의 합을 더하여 누적한다.
		}
		System.out.println(sum);
		
//		5. 범인은 100부터 999까지 숫자에 숨어 있다.
//		   범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		String criminal = "";		// 범인의 숫자를 모두 출력하기 위하여 누적할 문자열을 생성
		for(int i=100;i<=999;i++) {
			if(((i%100)/10)%3==0&&((i%100)/10)!=0){	
				// i의 십의자리 숫자가 3으로 나눈 나머지가 0이면서 십의자리의 숫자가 0이 아닐때
				// 십의자리 숫자가 0이여도 3으로 나눈 나머지가 0이 나오기때문에 3의 배수만 도출하기위해 제외시켜주는 과정이 필요함
				// 즉 십의자리가 3의 배수일때의 i 숫자를 모두 출력하기위해 숫자를 문자열로 누적하여 저장
				criminal+=(i+" ");
			}
		}
		System.out.println("범인의 숫자: "+criminal);
		
//		6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
//		누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
//		범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		
		int adds=0;
		int cnts=0;
		for(int i=0;i<=100;i++) {
			adds += i;
			if(adds<=44)
				cnts++;
		}
		System.out.println("범인은: "+cnts);
		
		
//		7. System.out.println("abc");  
//		   System.out.println("def"); 
//		   // 위코드를 실행하면
//		   abc
//		   def
//
//		   System.out.print("abc");    // ln이 빠지면 i변수 값을 출력 후 줄바꿈을 하지 않는 코드이다. 
//		   System.out.print("def"); 
//		   // 위코드를 실행하면
//		    abcdef
//
//		   문제>> 다음과 같이 출력하게 하시오.
//		   1+2+3+4+5+6+7+8+9+10=결과값 
		int sums=0;
		String plus="+";
		for(int i=0;i<10;i++) {
			sums+=(i+1);
			System.out.print(i+1);
			if(i!=9) {
				System.out.print(plus);
			}
		}
		System.out.print("="+sums);
		System.out.println("");
		
//		8. 피보나치 수열 1
//		  i는 피보나치 수의 갯수이다.   총 8개의 피보나치 수를 구하고 합한 값을
//		  출력하시오. 
//		  i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.
//
//		   int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
//		   for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
//		   
//		   }
//		  결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값
		int fib = 1;
		int aFib = 0;
		int pFib = 0;
		int fibSum = 0;
		for(int i = 1; i < 8; i++) {
			System.out.print(fib);
			System.out.print("+");
			fibSum += fib;
			aFib = fib + pFib;
			pFib = fib;
			fib = aFib;
		}
		System.out.println("=" + fibSum);
	
		//
//		9. 피보나치 수열 2
//		  i를 피보나치 수로 정의한다.
//		  i의 변화는 1 1 2 3 5 8 13 이 된다.
//		  for(int i=1;i < 20; ){  
//		   
//		   }
		System.out.println("문제 9");
			int fibA = 0;
			int fibP = 0;
			for(int i = 1; i < 20; i++) {
				System.out.print(i + " ");
				fibA = i + fibP;
				fibP = i;
				i = fibA;
			}
		System.out.println("");
			
		
//		10. 987654321이라는 숫자가 있다.. 변수2개와 for문 한개로
//		   모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
//		   합만 출력하면 됩니다.
//		   main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다. 
//		
		// 버전 1
		int a = 987654321;
		for(int i=100000000;i>=10;i=i/10) {
			a=a-((a/i)*i)+((a/i)*(i/10));
		}
		System.out.println(a);

	}

}
