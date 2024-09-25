package _11_Class_sample;

public class MyDogList {

	Dog [] d = new Dog[5];
	
	public MyDogList() {
		// TODO Auto-generated constructor stub
		System.out.println("--도그 관리--");
		System.out.println(d[0]);
		if(d[0]!=null) {
			System.out.println(d[0].name);
		}
		d[1] = new Dog();
		System.out.println(d[1]);
		d[2]=d[1];							// d[1]과 d[2]는 같은 객체의 주소를 저장하고 있음
		System.out.println(d[2]);
		d[3] = new Dog();
		System.out.println(d[3]);
		Dog dd = new Dog();
		d[4] = dd;
		System.out.println(dd);
		System.out.println(d[4]);
		
		d[1].name = "abc";			// d[1]의 name 변수에 abc의 값을 저장하게 되면
		System.out.println(d[1].name);		// d[1].name과 d[2].name에 같은 값이 저장되는 것을 확인할 수 있음
		System.out.println(d[2].name);		// 서로 같은 객체에 대한 주소를 저장하고 있기 때문임
		System.out.println(d[3].name);
		
		for (int i = 0; i < d.length; i++) {
//			System.out.println(d[i].name);			// 이형태는 에러가 발생 -> d[0]의 값은 null이기 때문에 참조할 주소가 없음. 즉 참조불가능
			if(d[i]!=null) {		// 따라서 이 코드를 추가하여 실행
				System.out.println(d[i].name);
			}
		}
		// 강아지 검색
		String s="땡칠이";
		for (int i = 0; i < d.length; i++) {
			if(d[i]!=null) {
				if(d[i].name.equals(s)) {
					System.out.println(i+"번에서 찾음");
					break;
				}else {
					System.out.println("해당 이름 없음");
					break;
				}
			}
		}
		
		
	}

}
