package _Project_javaWord;

public class FailWord {
	String fword_eng = null;
	String fword_kor = null;
	
	public FailWord() {
		// TODO Auto-generated constructor stub
	}
	
	public void prt() {
		System.out.println("영어: "+fword_eng+" / 한글: "+fword_kor);		
	}
	public void f_eng(String a) {
		fword_eng = a;
	}
	public void f_kor(String a) {
		fword_kor = a;
	}
	public String eng() {
		return fword_eng;
	}
	public String kor() {
		return fword_kor;
	}
}
