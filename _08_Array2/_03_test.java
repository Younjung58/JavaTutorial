package _08_Array2;

public class _03_test {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
			         {6,7,8,9,10},
			         {11,12,13,14,15},
			         {16,17,18,19,20},
			         {21,22,23,24,25}};
		
		//3번. 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시(3 8 13 18 23)
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][2]+" ");
		}

	}

}
