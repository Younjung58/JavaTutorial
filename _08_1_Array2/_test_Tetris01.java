package _08_1_Array2;

public class _test_Tetris01 {

	public static void main(String[] args) {
		/*
		 *  1 1 0
		 *  0 1 0
		 *  0 1 1
		 *  
		 *  1. 위 모양의 블록을 오른쪽으로 회전하시오 
		 */
		
		int [][] a = {{1,1,0},{0,1,0},{0,1,1}};
		
		//사고과정.
		// 오른쪽으로 회전하면(0행을 기준으로 생각)
		// 0,0 -> 0,2  / 0,1 ->  1,2  /  0,2 -> 2,2
		// 가운데인 1,1은 고정
		// 즉, 오른쪽의 최종화면은
		// 1 1 0   -> 현 0열을 아래에서부터 출력
		// 0 1 0   -> 현 1열을 아래에서부터 출력
		// 0 1 1   -> 현 2열을 아래에서부터 출력
		// 즉, 열의 0 ,1, 2 순서대로 바깥 for문
		//     행의 2, 1, 0 순서대로 안쪽 for문
		System.out.println("현재의 블록");
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("이를 오른쪽으로 회전하면");
		System.out.println("-----------------");
		for (int i = 0; i < a[0].length; i++) {
			for (int j = a.length-1; j >= 0; j--) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		

	}

}
