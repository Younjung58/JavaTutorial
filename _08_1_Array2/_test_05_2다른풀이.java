package _08_1_Array2;

public class _test_05_2다른풀이 {
		public static void main(String[] args) {
			int [][] a = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25}};
			
			System.out.println("기존 배열의 형태");
			System.out.println("---------------------");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			
			/* 위 배열의 형태를 아래와 같이 바꾸기
			 * 6	1	2	3	4
			 * 11	12	7	8	5
			 * 16	17	13	9	10
			 * 21	18	19	14	15
			 * 22	23	24	25	20
			 */
			
			// 앞 풀이와 다르게 생각해보기
			//사고과정.
			// 숫자의 재변환이 일어나는 것을 사각형모양으로 생각했을 때, 
			// 총 2번 일어나는 것으로 생각해서 한번 풀어보자. 바깥조건이 만족하는 동안(while) 안쪽 존재 for문 일어나게,,
			// 이런 형태라면, 바깥쪽의 조건 만족동안 안쪽의 반복이 이루어지는 형태,,
			// 그럼 그 2번을 어떻게 나눌 수 있을까??... - 사고 1
			// 바깥쪽의 반복은 사각형의 크기가 작아지는 형태로, 총 사각형 만큼 이루어지도록 해야하고
			// 안쪽의 반복은 숫자가 오른쪽 방향으로 회전하면서 변경되는 반복이 이루어져야한다.	- 사고 1 완료.
			// 그럼 먼저 바깥 for문은 어떻게 작성할것인가?	- 사고 2
			// 사각형 모양의 꼭짓점을 생각해봤을때,
			// 바깥 사각형은 - (0,0),(0,4),(4,4),(4,0) / 안쪽은 - (1,1),(1,3),(3,3),(3,1)이다.
			// 이때 중간은 (2,2)이다. 즉, 배열의 총 행과 열의 가운데이다.
			// 한번 바깥 for문이 돌아가면, 꼭짓점의 변화를 주면 될 것이다. - 사고 2 완료.
			// 그럼 숫자의 변경이 일어나는 안쪽 for문은?	- 사고 3
			// 앞에서 푼 달팽이의 구조로 숫자를 넣는 것과 동일하다(각 꼭짓점의 줄에서만 실행) - 사고 3 완료.
			// 초기 꼭짓점을 해당 배열의 행과 열의 각각의 최대 최솟값으로 설정하고 코드를 작성해보자.
			
			// 필요한 변수를 먼저 선언
			int rmin = 0;
			int rmax = a.length-1;
			int cmin =0;
			int cmax = a[0].length-1;	// 초기 꼭짓점 4개 선언
			int emp = 0;	// 재배치시 값 저장할 변수 선언
			
			// 배열 값 재배치
			while((cmax-cmin)>=2 && (rmax-rmin)>=2) {	//바깥쪽이 사각형 갯수만큼 반복되도록 설정(변의길이있을때)
				emp = a[rmin][cmax]; // 초기 오른쪽위 꼭짓점 저장(5)
				if(emp==a[rmin][cmax]) {
					System.out.println("*"+emp);	// 꼭짓점 저장 확인 디버깅
					for (int i = cmax; i > cmin; i--) {
						a[rmin][i]=a[rmin][i-1];
						if(i==cmin+1) {
							a[rmin][cmin]=emp; //5를 왼쪽 위 꼭짓점에 저장
							emp = a[rmax][cmax]; // 다음 꼭짓점 저장(25)->다음으로 넘어가는 조건으로 사용
						}
					}
				}
				if(emp == a[rmax][cmax]) {
					System.out.println("**"+emp);	// 꼭짓점 저장 확인 디버깅
					for (int i = rmax; i > rmin; i--) {
						a[i][cmax] = a[i-1][cmax];
						if(i==rmin+1) {
							rmin++;
							a[i][rmax]=a[rmin-1][cmin];	// 왼쪽 위 꼭짓점에 저장해놨던 5를 가져와서 대입
							a[rmin-1][cmin]=emp;	// 다시 왼쪽 꼭짓점에 25저장
							emp = a[rmax][cmin];	// 다음 꼭짓점 저장(21)
						}
					}
				}
				if(emp == a[rmax][cmin]) {
					System.out.println("***"+emp);	// 꼭짓점 저장 확인 디버깅
					for (int i = cmin; i < cmax; i++) {
						a[rmax][i] = a[rmax][i+1];
						if(i==cmax-1) {
							cmax--;
							a[rmax][i]=a[rmin-1][cmin];		// 왼쪽 위 꼭짓점에 저장해놨던 25를 가져와서 대입
							a[rmin-1][cmin]=emp;	// 다시 왼쪽꼭짓점에 21 저장 -> 다음으로 넘어가는 조건으로 사용
							rmax--;
						}
					}
				}
				if(a[rmin-1][cmin]==emp) {	// 왼쪽 꼭짓점에 21이 있을때
					System.out.println("****"+a[rmin-1][cmin]);		// 왼쪽 꼭짓점 저장 확인 디버깅
					for (int i = rmin-1; i < rmax; i++) {
						a[i][cmin]=a[i+1][cmin];
						if(i==rmax-1) {
							a[rmax][cmin]=emp;
							cmin++;
						}
					}
				}
			}
			
			
			
			
			//최종 배열 변경 확인
			System.out.println();
			System.out.println("배열 재배치 후");
			System.out.println("---------------------------");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
		
	}

}
