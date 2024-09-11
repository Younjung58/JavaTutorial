package _08_0_Array2;

public class _02_test {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
			     {6,7,8,9,10},
			     {11,12,13,14,15},
			     {16,17,18,19,20},
			     {21,22,23,24,25}};
		
		//2번. 2차원 배열 a의 3번째 행에서 짝수의 값만 출력하시오.
		
		// 문제 사고.
		// 1번과 비슷하게 a의 3번째 행은 고정이기에 a[3]는 고정
		// 다만, 행의 모든 값을 출력하는 것이 아니라, 짝수의 값만을 출력해야하므로
		// for문을 이용하여 열의 갯수만큼 반복하여 a[3][i]
		// 각 값이 짝수인지를 판별해야함(참.거짓이므로 if문 필요)
		
		for (int i = 0; i < a.length; i++) {
			if(a[3][i]%2==0) {
				System.out.print(a[3][i]+" ");
			}
		}

	}

}
