package _04Random;

import java.util.Random;

public class _00_Test {
	// JDK를 깔 때, 자동으로 Random class도 깔아짐 
	// -> 이를 사용시 import 작업 필요(내가 아닌 다른 class를 인식시키겠다는 것)
	// ctrl+shift+O 누르면 자동으로 import사용 가능
	// java.util은 class package의 이름이고, Random이 우리가 사용할 class이름
	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호를 추출
		Random r = new Random();
		int [] lotto = new int[6];	// -> 변수명, 길이, index
		// (int의 초기값은 0이기때문에 모든 배열의 value 초기값은 0)
		for(int i=0;i<lotto.length;i++) {
//			System.out.println((i+1)+"번째 뽑아");
			int k = r.nextInt(45)+1;
			//r변수 참조하여 nextInt라는 기능을 호출(매개변수:45), 리턴받은수(0~44)에 +1(보정)을 한다.
			lotto[i]=k;
			if(i==lotto.length-1) {	// 마지막 번호일때
				System.out.println("보너스 lotto: "+lotto[i]);
			}else {
			System.out.println((i+1)+"번째 lotto: "+lotto[i]);
			}
		}

	}

}
