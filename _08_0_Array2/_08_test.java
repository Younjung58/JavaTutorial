package _08_0_Array2;

public class _08_test {

	public static void main(String[] args) {
		/*
		 * 1 1 0 2
		 * 3 2 1 2
		 * 0 0 3 2
		 * 4 4 4 4 
		 * 2 4 3 1
		 * 2 4 1 3
		 */
		
		//8. 위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		//   제거가 가능한 블록의 좌표를 출력하시오.
		
		// 앞 문제와 동일한데, 추가적으로 같은 사고를 가지고 가로의 부분도 판단해주면 됨
		
		int[][] a = {{1,1,0,2},
			     	{3,2,1,2},
			     	{0,0,3,2},
			     	{4,4,4,4},
			     	{2,4,3,1},
			     	{2,4,1,3}};
		int cnt=1;
		int cntt=1;
		int ers=0;
		int erss=0;
		// 가로의 경우는 '행 -> 열'의 순으로 for문을 작성한다는 부분만 세로의 경우와 다름
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length-1; j++) {
				if(a[i][j]==a[i][j+1]) {
					cnt++;
				}else {
					cnt=1;
				}
				if(cnt>=3) {
					System.out.println("가로 제거대상의 번호는: "+a[i][j]);
					ers = a[i][j];
					for (int k = j-1; k < a[0].length; k++) {
						if(a[i][k]==ers) {
							System.out.println("좌표는 "+i+", "+k);
						}else {
							j = k-1;
							cnt=1;
							break;
						}
					}
					System.out.println();
					cnt=1;
					ers=0;
				}
			}
		//세로는 가로를 비교하는 전체 배열 실행 중 1번만(i==0) / 전체 열 -> 행에 대해서 반복실행하면 됨
		if(i==0) {
			for (int j = i; j < a[0].length; j++) {
				for (int j2 = 0; j2 < a.length-1; j2++) {
					if(a[j2][j]==a[j2+1][j]) {
						cntt++;
					}else {
						cntt=1;
					}
					if(cntt>=3) {
						System.out.println("세로 제거대상의 번호는: "+a[j2][j]);
						erss=a[j2][j];
						for (int k = j2-1; k < a.length; k++) {
							if(a[k][j]==erss) {
								System.out.println("좌표는 "+k+", "+j);
							}else {
								j2 = k-1;
								cntt=1;
								break;
							}
						}
					}
				}
				System.out.println();
				erss=0;
			}
		}
		System.out.println();
		cnt=1;
		ers=0;
		}
	}
}
