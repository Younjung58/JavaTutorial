package _08_Array2;

public class _06_test {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
         			{6,7,8,9,10},
         			{11,12,13,14,15},
         			{16,17,18,19,20},
         			{21,22,23,24,25}};
		
		//6번. 2차원 배열의 모든 값을 출력하시오.
		//	  출력할 때는 행의 번호는 내림차순(4 3 2 1 0), 열의 번도호 내림차순으로 출력(4 3 2 1 0)
		
		//문제사고.
		// 앞선 문제들과 같이, 모든 배열을 출력할 것이므로 전체적 구조는 동일.
		// 다만, 행과 열의 번호를 내림차순으로 출력할것이므로 
		// 각각 for문 반복의 시작을 끝에서부터, 증감식을 '--'로하며 배열의 처음(0)이 될때까지 반복하면 됨.
		
		for (int i = a.length-1 ; i >= 0; i--) {
			for (int j = a[0].length-1; j >= 0; j--) {
					 System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
