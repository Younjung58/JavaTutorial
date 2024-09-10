package _03for;

public class _00_test3 {

	public static void main(String[] args) {
//		여기부터는 어렵습니다.
//
//		10.  int[] arr = {45,23,25,64,3,24,48} 
//		   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		int[] arr = {45,23,25,64,3,24,48}; 
		int maxValue=0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=maxValue) {
				maxValue = arr[i];
				cnt=i;
			}
		} System.out.println(maxValue+", 인덱스 값:"+cnt);
		
		// 과정
		//1.for문 작성(i의 초기값, 조건, i증감)
		//  i는 배열의 index를 보겠다.
		//2.배열에서 가장 큰값 -> 2차:시나리오 직접 실행
		//				  -> 3차:가장 큰 값 정보 필요
		//3.i의 value값과 최대값을 저장한 변수랑 비교/ arr[i]<max선언문(초기값과 최대값 변경)
		
//
//		11. 범인 숫자 구하기.. 
//		  범인은 100부터 999까지 숫자중에 여러명이다. 
//		  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		int sum=0;
		for(int i=100;i<=999;i++) {
			sum=(i/100)+((i%100)/10)+(i%10);
			if(sum%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		
//
//		12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
//		   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int maxT=0;
//		int Tu1=0;
		int len=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				len++;
//				Tu1=len;		굳이 변수 하나를 더 지정하지 않아도 바로 길이로 max값 비교,출력가능
				if(len>maxT) {
//					maxT=Tu1;
					maxT=len;
				}
			}
			else if(arr1[i]!=0){
				len=0;
			}
		}
		System.out.println("긴 터널의 길이: "+maxT);
//
//		13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3}
//		   숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		// 12번의 구상단계에서 추가적으로 연속된 터널인지 아닌지 비교하는 단계가 필요
		int[] arr2 = {1,2,3,0,0,0,1,2,2,4,0,0,0,0,0,3,2,2,2,2,2,2,2};
		int b=0;
		int maxT2=0;
		int Tu2=0;
		int T=0;
		for(int i=0;i<(arr2.length-1);i++) {
			if(arr2[i]==arr2[i+1]) {
				b++;
				Tu2=b;
				if(Tu2>maxT2) {
					maxT2=Tu2;
					T=arr2[i];
				}
			}else if(arr2[i]!=arr2[i+1]) {
				b=0;
			}
		}
		System.out.println("긴 터널의 길이: "+(maxT2+1)+", 터널의 번호: "+T);
		// 조건을 따지게 될 때 터널이 끝나는 부분에서는 반드시 현재의 값과 다음의 값이 같을 수 없기 때문에
		// 최대값에 1을 더한 값이 최종 터널의 길이가 된다.
		// i의 값을 index길이의 하나 전까지의 숫자로 조건을 지정한 이유는(i<22)
		// i가 21일때 22(index의 마지막 값)과 비교하게 될 것이고, 만약 마지막 부분에 터널이 존재한다면
		// 앞쪽의 비교로 이미 길이가 1증가하였기 때문에 최종 길이에 영향을 주지 않는다.
//
//
//		14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		 char [] t = new char [22];
		 int c=0;
//		 int alpha=0;
		 int maxA=0;
		 char num=' ';
		 for(int i=0;i<t.length;i++) {
			 char tt = ttt.charAt(i);
			 t[i] = tt;
		 }
		 for(int i=0;i<(t.length-1);i++) {
			 if(t[i]==t[i+1]) {
					c++;
//					alpha=c;
					if(c>maxA) {
						maxA=c;
						num=t[i];
					}
				}else if(t[i]!=t[i+1]) {
					c=0;
				}
		 }
		 System.out.println("긴 알파벳 길이(숫자): "+(maxA+1)+", 알파벳: "+num);
		
//		15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
//		   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		 
		 // 풀이 1
		 String ttt1 ="aabbbcccaaaaddbbbaaaaa";
		 String Tt="";
		 int ccnt=0;
		 int acnt=0;
		 char [] t1 = new char [23];  
		 // 조건문에서 i+1이 마지막 인덱스의 벨류값에서도 적용되어야하기 때문에(에러방지)
		 // 주어진 String보다 한자리 수 더 많은 값으로 배열의 index길이를 지정해준다.
		 for(int i=0;i<(t1.length-1);i++) {
			 char tt1 = ttt1.charAt(i);
			 t1[i] = tt1;
		 }
		 System.out.println(t1);
		 for(int i=0;i<(t1.length-1);i++) {
			 if(t1[i]==t1[i+1]) {
				 ccnt++;
				 if(i>=(t1.length-2)) {  
					 // i가 총 인덱스의 마지막 번호 이전, 즉 마지막 비교위치일때는
					 // 더이상 뒤쪽에 비교할 대상이 존재하지 않기 때문에 else인 경우에 위치하는
					 // 명령어가 실행되지 않아서 마지막에 출력이 되지 않는다.
					 // 따라서 마지막 비교의 구문만 추가로 조건문을 지정해 줌
					 acnt=ccnt+1;
					 Tt+=t1[i];
					 Tt+=acnt;
				 }
			 }
			 else {
				 Tt+=t1[i];
				 Tt+=ccnt+1;
				 ccnt=0;
				 
			 }
		 }
		 System.out.println("-> 압축하여 나타내면: "+Tt);
		 
		 
		 // 풀이 2
		 String ttt0 ="aabbbcccaaaaddbbbaaaaa";
		 int ccc=0;
		 String resultZip="";
		 char BT=ttt0.charAt(0);
		 for(int i=0;i<ttt0.length();i++) {
			 if(BT == ttt0.charAt(i)) {
				 ccc++;
			 }else {
				 resultZip = resultZip + BT + ccc;
				 BT=ttt0.charAt(i);
				 ccc=1;
			 }
//			 if(i==(ttt0.length()-1)) {
//				 resultZip = resultZip + BT + ccc;
//			 }
		 }
		 resultZip = resultZip + BT + ccc;
		 System.out.println(resultZip);
		 
		 // 풀이2(답안)가 풀이1(나의 풀이)과 다른점은 나는 문자열을 나눈 값을 배열로 저장하였고, 
		 // 답안의 풀이는 나눈값을 따로 배열로 저장하지 않았다는 점이다.
		 // 따로 저장하지 않고, 문자열 그자체로 비교하며, 비교의 초기값인
		 // 문자열의 첫번째값을 변수로 선언해주어 코드가 훨씬 간결해졌다.
		 // 무언가를 나누어 변수에 꼭 저장해야한다는 생각을 바꿀 필요가 있다.
		 // 배열로 저장할시에는 String자체의 길이가 아닌 for문에 사용한 배열값, 즉 index의 값때문에 
		 // 현재값과 다음값의 비교시에 에러가 발생할 가능성이 높고, 그를 유의하여 작성하면 코드가 복잡해진다.
		 // 배열로 전환한 index의 값보다 문자열자체의 길이로 사용하는 것이 훨씬 간단한 표현이 가능하다.
	}

}
