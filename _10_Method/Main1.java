package _10_Method;


public class Main1 {

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName()); 		// 매개변수값은 없고, 리턴값은 존재
//		System.out.println(t.getName2("1111"));
		String resultName = t.getName2("1111");
		if(resultName!=null) {
			System.out.println(resultName);
		}else {
			System.out.println("비번틀림");
		}
		
		// 이름 마스킹
		System.out.println("----이름마스킹----");
		String mask = "!!!";
		System.out.println(t.maskName(mask));
	}

}
