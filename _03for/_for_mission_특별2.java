package _03for;

public class _for_mission_특별2 {

	public static void main(String[] args) {
//		특별2
//		String a ="67/414/1/23/32/45/54/12/11/232";
//		문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
//		해충의 갯수를 모두 합하시오.
//		charAt() 메서드만 사용이 가능하다. 
//		형변환이 필요하면 검색하여 사용하시오.
		String a="67/414/1/23/32/45/54/12/11/232";
		String a1="";
		int sum=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!='/'){
				a1+=(char)a.charAt(i);
			}else{
			sum+=Integer.parseInt(a1);
			a1="";
			}
		}
		sum+=Integer.parseInt(a1);
		System.out.println("해충의 총 갯수: "+sum);
		
	}

}
