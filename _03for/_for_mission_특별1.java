package _03for;

public class _for_mission_특별1 {

	public static void main(String[] args) {
//		특별1
		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
//		문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
//		숫자별로 수집된 수만큼 카운팅하세요.
//		카운팅 배열은
		int[] a1 = new int[10];
//		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
//		// 인덱스 0 - 9까지를 숫자로 정의한다.
//		조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. 
		// 찾은 규칙: 6(a.charAt(i))이면 a1[6](a1[a.charAt(i)])자리의 값이 1증가
		
		// 최종버전
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!='/') {
				a1[a.charAt(i)-'0']++;		// 문자 자체의 값을 빼도 나옴('0'을 빼도 성립)
			}
		}
		for(int k=0;k<a1.length;k++) {
			System.out.print(k+"의갯수:"+a1[k]+"/ ");
		}
		System.out.println("");
		
		
		// 초기버전
//		for(int i=0;i<a.length();i++){
//			if(a.charAt(i)!='/') {
//				if(a.charAt(i)=='1')
//					a1[1]++;
//				if(a.charAt(i)=='2')
//					a1[2]++;
//				if(a.charAt(i)=='3')
//					a1[3]++;
//				if(a.charAt(i)=='4')
//					a1[4]++;
//				if(a.charAt(i)=='5')
//					a1[5]++;
//				if(a.charAt(i)=='6')
//					a1[6]++;
//				if(a.charAt(i)=='7')
//					a1[7]++;
//				if(a.charAt(i)=='8')
//					a1[8]++;
//				if(a.charAt(i)=='9')
//					a1[9]++;
//			}
//		}
//		for(int k=0;k<a1.length;k++) {
//			System.out.print(k+"의갯수:"+a1[k]+"/ ");
//		}
//		System.out.println("");
		
		// 번외로, 형변환이 사용 가능하다면
		System.out.println("형변환 사용이 가능한 버전");
		int[] a2 = new int[10];
		int A=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!='/') {
				A=Character.getNumericValue(a.charAt(i));
				a2[A]+=1;
			}
		}
		for(int i=0;i<a2.length;i++) {
			System.out.print(i+"의갯수:"+a2[i]+"/");
		}
		System.out.println("");
//
//

	}

}
