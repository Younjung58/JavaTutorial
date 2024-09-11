package _08_1_Array2;

public class _test_03 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 출력되어야하는 답의 형태
		 * 1 2 3 4 5
		 * 10 9 8 7 6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 */
		
		//사고과정.
		// 숫자가 1부터 20까지 증가하는 형태로 필요 - 이에 맞게 일차적으로 배열값 입력
		// 배열의 길이는 행4, 열5로 정해져있으므로 문제에 맞게 출력하기 위해서는 
		// 처음 값을 입력하는 순서가 중요함
		// 따라서 입력 순서를 생각해보면,
		// 짝수의 행과 홀수의 행이 순서가 다른 것을 볼 수 있음
		// 즉, 짝수의 행에서는 열이 오름차순의 형태이고(0,2행 -> 0,1,2,3,4열)
		// 홀수의 행에서는 열이 내림차순의 형태임(1,3행 -> 4,3,2,1,0열)
		// 따라서 행의 0,1,2,3 이 바깥 for문을 돌고
		// 열이 짝수행 / 홀수행에 따라서(if문으로 판별)
		// 짝수면 0,1,2,3,4 가 안쪽 / 홀수면 4,3,2,1,0 이 for문을 돌면 됨
		
		// 배열값 입력
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < a[0].length; j++) {
					a[i][j]=num;
					num++;
				}
			}else {
				for (int j = a[0].length-1; j >= 0; j--) {
					a[i][j]=num;
					num++;
				}
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
