package _04Random;

public class _break와continue {
	public static void main(String[] args) {
		
//		-> 문제 : 1부터 10까지 숫자 중 짝수의 합(continue; 한번사용)
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2==0){
			  sum+=i;
			}
		    continue;
		}
		System.out.println(sum);
		
		// 다른 풀이
		sum=0;
		for(int i=1;i<=10;i++){
			if(i%2==1){
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		
//		-> 문제2 : String id="abcdefee";  //id에 알파벳 e는 금지임,,
		String id="abcdefee";
		boolean flag = false;
		for(int i=0;i<id.length();i++){
			if(id.charAt(i)=='e'){
				flag=true;
				break;
			}
		}
		if(flag){		// flag값이 true면 무조건 이 if문이 실행되도록 함, 조건에 flag(=true)로 넣어도됨
			System.out.println("e포함됨");
		}
		
	}

}
