package _Project_javaWord;

import java.util.Random;

public class OneWord {
	
	private String eng = null;
	private String kor = null;
	
	public OneWord() {
		// TODO Auto-generated constructor stub
	}
	
	public void all() {
		System.out.println("영어: "+eng+" / 뜻: "+kor);
	}
	
	public void prt1() {		// 한글로 입력받아서 조회한 결과
		System.out.println("----조회하신 단어입니다----");
		System.out.println("입력하신 뜻: "+kor);
		System.out.println("해당 뜻의 영어: "+eng);
	}
	
	public void prt2() {		// 영어로 입력받아서 조회한 결과
		System.out.println("----조회하신 단어입니다----");
		System.out.println("입력하신 영어: "+eng);
		System.out.println("해당 영어의 뜻: "+kor);
	}
	
	public void t_eng(String e) {
		eng = e;
	}
	
	public void t_kor(String k) {
		kor = k;
	}
	
	public String g_eng() {
		return eng;
	}
	public String g_kor() {
		return kor;
	}
	
	public String r_word(String a) {		// 단어 수정과 삭제시에 비밀번호를 입력받아서 권한을 부여
		if(a.equals("1234")) {
			return eng;
		}else {
			return "에러";
		}
	}
	
	public String g_ame() {
		Random r = new Random(2);
		int a = r.nextInt(); 
		if(a==0) {
			return kor;
		}else{
			return eng;
		}
	}

}
