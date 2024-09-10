package _05이중for문;

public class _2for_04 {

	public static void main(String[] args) {
//		4. int[] b = {93,45,83,58,75,56}
//		다음조건에 따라 오름차순으로 정렬하시오.
//		1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
//		2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
//		3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
//		오름차순으로 정렬이 될때 까지 반복한다.
		
		// 분석
//		1등값-5저장   / 2등값-4저장  ...
//		반복문에서 저장까지 하고 빠져나오게 만들어야함
//		총 반복횟수는 배열의길이 ***
		// 최종: (max구하기 -> 교환하기-> 배열을 나타내기(for문1))  
//			--->(이 과정을 length-1하면서 반복할 것) -> for문2
//			--->(이러한 것을 오름차순으로 정렬될때까지 반복할 것, 즉 본래 배열길이만큼 반복***)-> for문3
		
		int[] b = {93,45,83,58,75,56};
		
		int leng=b.length;
		int max=0;
		int a=0;
		for (int k = 0; k < b.length; k++) {	//for문 3
			for (int i = 0; i < leng; i++) {		//for문 2
				if(b[i]>=max) {
					max=b[i];
					a=i;
				}
				if(i==leng-1) {
					b[a]=b[leng-1];
					b[leng-1]=max;
					for (int j = 0; j < b.length; j++) {	// for문 1
						System.out.print(b[j]+" ");			
					}
					max=0;
					System.out.println();
				}
			}
			leng--;
		}
		
		
		// 깔끔한 풀이
		int[] b1 = {93,45,83,58,75,56};
		//다음조건에 따라 오름차순으로 정렬하시오.
		int tempMaxIndex = 0;

		for(int i=0; i<b1.length; i++) {
			System.out.println(i+"번째 큰값 찾는 중 -------------");
			tempMaxIndex = 0;
			for(int j=0; j < b1.length - i; j++) {	
				// 이부분에서 -i를 생각하지 못하여 위에서 for문을 3개를 사용함 
				// length의 길이를 반복문을 돌때마다 변형하고자 했는데, 
				// 그 자체를 실행문 반복 조건에서 도는 횟수와 연관지어서 작성 할 수 있음
				System.out.println(j +"번째 부터 서치");
				if(b1[tempMaxIndex] < b1[j]) {
					tempMaxIndex = j;
				}
			}
			// 가장 큰 값과 뒤에 값과 swap
			int temp = b1[b1.length-1-i];
			b1[b1.length-1-i]=b1[tempMaxIndex];
			b1[tempMaxIndex]=temp;

			// i번째 큰 값 찾아서 변경된 배열 확인 반복문
			for(int k=0; k<b1.length; k++) {
				System.out.print(b1[k]+" ");
			}
			System.out.println();

		}
			
	}
}
