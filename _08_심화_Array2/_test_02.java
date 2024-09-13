package _08_심화_Array2;

public class _test_02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 출력되어야하는 답의 형태
		 * 20 19 18 17 16
		 * 15 14 13 12 11
		 * 10 9 8 7 6
		 * 5 4 3 2 1
		 */
		
		//사고과정.
		// 숫자가 1부터 20까지 증가하는 형태로 필요 - 이에 맞게 일차적으로 배열값 입력
		// 배열의 길이는 행4, 열5로 정해져있으므로 문제에 맞게 출력하기 위해서는 
		// 처음 값을 입력하는 순서가 중요함
		// 따라서 입력 순서를 생각해보면,
		// 3행의 4,3,2,1,0열
		// 2행의 4,3,2,1,0열
		// ... 의 순서임
		// 따라서 행의 3,2,1,0 이 바깥 for문을 돌고
		// 열의 4,3,2,1,0 이 안쪽 for문을 돌면 됨
		
		// 배열값 입력
		for (int i = a.length-1; i >= 0; i--) {		// 헹의 반복(역순)
			for (int j = a[0].length-1; j >= 0; j--) {	// 열의 반복(역순)
				a[i][j] = num;
				num++;
			}
		}
		
		// 배열값 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
