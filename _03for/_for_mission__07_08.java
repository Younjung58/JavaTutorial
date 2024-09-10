package _03for;

public class _for_mission__07_08 {

	public static void main(String[] args) {
//		[7번 , 8번 문제 배열 제시]
		int[] a = {34,2,35,8,31,45};
//		최대값을 구하는 문제에서
//		철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 
//
//		7
//		철수는 배열의 0번 인덱스부터 순회한다.
//		0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
//		이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
//		위와 같은 방식으로 가장큰 수를 구하시오.
		
		// 리팩토링 후 최종 버전
		int A=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				A=a[i+1];
				a[i+1]=a[i];
				a[i]=A;
				A=0;
			}
		}
		System.out.println(a[5]);
		
		// 배열 순서 정렬 확인
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		
		// for문의 i는 변수로서 선언이 가능할 경우  -- 초기 작성 버전
		// 문제점: 덮어쓰기의 과정으로 값을 저장하는 것이기 때문에
		// 배열을 출력하게 되면, 배열의 구조가 문제가 원하는 형식과 다르게 나타남(구조깨짐)
		// 따라서 변수 하나를 더 선언하여 값을 저장, 변환의 과정으로 변경하여 위의 코드로 최종 수정
		
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]>=a[i+1]) {
//				a[i+1]=a[i];
//			}
//		}
//		if(a[a.length-1]>=a[a.length-2]) {
//			System.out.println(a[a.length-1]);
//		}else {
//			System.out.println(a[a.length-2]);
//		}
		
		
//		8
//		철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
//		0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
//		가장 큰 값이 나오면 가장 큰 값을 갱신한다.
//		위와 같은 방식으로 가장 큰 수를 구하시오.
		int[] b = {34,2,35,8,31,45};
		int B=0;
		for (int i = 1; i < b.length; i++) {
			if(b[0]<=b[i]) {
				B=b[0];
				b[0]=b[i];
				b[i]=B;
				B=0;
			}
		}
		System.out.println(b[0]);
		// 배열 순서 확인
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		// for문의 i는 변수로서 선언이 가능할 경우 -- 초기작성버전
		// 7과 같이 배열의 순서가 깨지게 되기 때문에 위의 버전으로 최종 코드 수정
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>=a[0]) {
//				a[0]=a[i];
//			}
//		}
//		System.out.println(a[0]);
	}

}
