package _02if;

public class _99_ThickCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		
		//코드1
		if(a==1) {
			System.out.println("1입니다.");
		}else if(a==2) {
			System.out.println("1입니다.");
		}else if(a==3) {
			System.out.println("1입니다.");
		}else if(a==4) {
			System.out.println("1입니다.");
		}else if(a==5) {
			System.out.println("1입니다.");
		}else if(a==6) {
			System.out.println("1입니다.");
		}else if(a==7) {
			System.out.println("1입니다.");
		}else if(a==8) {
			System.out.println("1입니다.");
		}else if(a==9) {
			System.out.println("1입니다.");
		}
		
		//코드2
		if(a>0) {
			if(a==1) {
				System.out.println("1입니다.");
			}else if(a==2) {
				System.out.println("1입니다.");
			}else if(a==3) {
				System.out.println("1입니다.");
			}else if(a==4) {
				System.out.println("1입니다.");
			}else if(a==5) {
				System.out.println("1입니다.");
			}
		}else if(a>5){
			if(a==6) {
				System.out.println("1입니다.");
			}else if(a==7) {
				System.out.println("1입니다.");
			}else if(a==8) {
				System.out.println("1입니다.");
			}else if(a==9) {
				System.out.println("1입니다.");
			}
		}
		
		
		
		// 문제:  코드1과 코드2중에 어떤 것을 선택하겠습니까?
		/* 코드2번의 경우가 더 합리적이라고 생각된다.
		 * 예를들어, a의 값이 9일 경우에 코드 1의 상황이라면, 조건을 9번을 따진 후에
		 * 결과값이 "1입니다."로 도출이 되어진다.
		 * 반면에, 코드 2의 경우는 a의 값이 9일경우 a>5이라는 조건으로 1번 거쳐진 후에
		 * 그 하위에 존재하는 4번의 조건만 거친 후, 즉 총 5번의 조건을 따진 후에 결과값이 도출되어진다.
		 * 따라서 시간적인 측면에서 단축이 되는 코드 2번이 더 효율적인 것 같다.
		 * 또한, 코드 에러가 발생할 경우를 생각해 보아도 확률이 반으로 줄어든다는 점도 생각해 볼 수 있는 것같다.
		 */

	}

}
