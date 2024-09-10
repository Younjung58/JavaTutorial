package _03for;

public class 평가지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="aabbccddeeeaaaa";
		int max=0;
		int cnt=0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)=='a') {
				cnt++;
				if(cnt>max) {
					max=cnt;
				}
			}else {
				cnt=0;
			}
		}
		System.out.println(max);
		
	}

}
