package _16_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];
	
	MemberAdmin() {/*
		System.out.println(m[0]);
		System.out.println(m[1].getId());
		System.out.println(m[2]);
		System.out.println("close");*/
		test();
	}
	private void test() {
		File file = new File("Output.txt");
		FileWriter writer;
		try {
			// try블록은 예외가 발생할 코드를 작성한다.
			// 예외가 발생하면 더이상 코드를 실행하지 않고 catch블록으로 이동
			writer = new FileWriter(file);
		} catch (IOException e) {
			// catch 소괄호안의 예외가 발생했을 때 처리해주는 블록
			e.printStackTrace();
		} finally {
			// try구문을 빠져 나갈때 실행됨. 예외 발생 여부 상관없이 실행됨.
		}
		// 코드상의 빨간줄: 에러  => 예외처리가 필요하다는 에러
		// try ~ catch ~ : 직접 예외처리하는 구문
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
}
