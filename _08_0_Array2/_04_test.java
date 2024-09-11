package _08_0_Array2;

public class _04_test {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
		         	{6,7,8,9,10},
		         	{11,12,13,14,15},
		         	{16,17,18,19,20},
		         	{21,22,23,24,25}};
		
		//4번. 전체 배열의 값 중 짝수는 모두 몇개인가?
		
		//문제사고.
		// 전체 배열을 반복해야하므로 '행 -> 열'의 순서를 기억하여
		// 모든 배열의 값을 출력(이중 for문을 사용하되 바깥쪽이 행의 반복, 안쪽이 열의 반복)
		// 그때의 그 행,열에 해당하는 값이 짝수인지를 판별하고(참, 거짓 판별->if문 사용)
		// 그 갯수를 세어야하므로 count할 정수를 하나 선언(cnt)하여 최종 count값을 출력
		
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if(a[i][j]%2==0) {
					cnt++;
				}
			}
		}
		System.out.println("전체 배열의 짝수 갯수: "+cnt);
		

	}

}
