package _16_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];
	
	MemberAdmin() throws Exception{/*		// test2에 대한 예외처리를 또다시 MemberAdmin객체를 생성한 main method에 떠넘김
		System.out.println(m[0]);
		System.out.println(m[1].getId());
		System.out.println(m[2]);
		System.out.println("close");*/
//		test();		// 예외처리 해줘야하는 경우와 직접처리
		test1();	// 예외처리를 안해줘도 되는데 해본코드
		test2();	// 예외처리를 해줘야하는 경우이고 예외 떠넘기기	
	}
	private void test2() throws Exception{		// test2 메서드를 호출한 MemberAdmin에게 예외처리 떠넘김
		File file = new File("Output.txt");
		FileWriter writer;
		writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
	private void test1() {
		MemberOne[] mm = new MemberOne[5];
		try {
			System.out.println("1");
			System.out.println(mm[0]);
			System.out.println("2");
			System.out.println(mm[1].getId());
			// 예외가 발생하면 코드를 실행하지 않고 바로 catch문으로 빠져나온다.
			System.out.println("정상종료");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("예외발생1");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생2");
		}finally {
			System.out.println("finally블록");
		}
		
		//=> 1 null 2 예외발생2 finally블록
	}
	private void test() {	// 예제는 예외처리를 반드시 해줘야한다.
							// 예외 처리 방법은 직접처리 > try catch finally
		try {
			File file = new File("Output.txt");
			FileWriter writer;
			// try블록은 예외가 발생할 코드를 작성한다.
			// 예외가 발생하면 더이상 코드를 실행하지 않고 catch블록으로 이동
			writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		} catch (IOException e) {
			// catch 소괄호안의 예외가 발생했을 때 처리해주는 블록
			e.printStackTrace();
		} finally {
			// try구문을 빠져 나갈때 실행됨. 예외 발생 여부 상관없이 실행됨.
		}
		// 코드상의 빨간줄: 에러  => 예외처리가 필요하다는 에러
		// try ~ catch ~ : 직접 예외처리하는 구문
	}
}
