package _05이중for문;

public class _01_필수코스Q1 {

	public static void main(String[] args) {
//		1. 
//		1*1=1  1*2=2   1*3=3
//		2*1=2  2*2=4   2*3=6
//		3*1=3  3*2=6   3*3=9
//		4*1=4  4*2=8   4*3=12
		// i를 단, j를 곱하는 수로 봄
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(i+"*"+j+"="+i*j+"  ");
			}System.out.println();
		}

	}

}
