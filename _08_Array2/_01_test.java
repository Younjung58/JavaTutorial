package _08_Array2;

public class _01_test {
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		
		
		// 1번. 2차원배열 a의 2번째 행의 모든 값을 출력하시오
		
		// 문제 사고.
		// 2차원 배열의 행 -> 열의 순서를 생각하고, 2번째 행 선택은 고정 a[2]이고,
		// 뒤쪽에 for문을 이용하여 모든 열을 반복하면 된다고 생각.  => a[2][i]형태
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[2][i]+" ");
		}
		
	}

}
