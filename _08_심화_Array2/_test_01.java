package _08_심화_Array2;

public class _test_01 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 출력되어야하는 답의 형태
		 * 17 13 9 5 1
		 * 18 14 10 6 2
		 * 19 15 11 7 3
		 * 20 16 12 8 4
		 */
		
		//사고과정.
		// 숫자가 1부터 20까지 증가하는 형태로 필요 - 이에 맞게 일차적으로 배열값 입력
		// 배열의 길이는 행4, 열5로 정해져있으므로 문제에 맞게 출력하기 위해서는 
		// 처음 값을 입력하는 순서가 중요함
		// 따라서 입력 순서를 생각해보면,
		// 4열의 0,1,2,3행
		// 3열의 0,1,2,3행
		// ... 의 순서임
		// 따라서 열의 4, 3, 2, 1, 0 이 바깥 for문을 돌고
		// 행의 0,1,2,3 이 안쪽 for문을 돌면 됨
		
		// 배열 값 저장
		for (int i = a[0].length-1; i >= 0; i--) {		// 열의 반복(역순)
			for (int j = 0; j < a.length; j++) {		// 행의 반복
				a[j][i] = num;
				num++;
//				System.out.print(a[j][i]+" ");      // 배열 입력 확인
			}
//			System.out.println();
		}
		
		// 코드의 재사용성을 높이기위해서(수정or업데이트 등등) for문(if문)을 분리하여 하나의 역할만 하도록 설계(저장-출력)
		
		// 배열 값 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");	  //이때 t는 개행문자..t의 의미는 tab만큼 띄워라라는것.
			}
			System.out.println();
		}
		
	}

}
