package _15_IO_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reader: 데이터를 읽기위한 문자 기반의 추상클래스
		// Writer : 데이터를 쓰기 위한 문자 기반의 추상 클래스
		// FileReader : 파일에서 문자 단위로 데이터를 읽는 클래스
		// FileWriter : 파일로 문자 단위로 데이터를 쓰는 클래스
		// BufferedReader : 입력을 위한 버퍼를 제공하여 성능을 향상시키는 클래스
		// BufferedWriter : 출력을 위한 버퍼를 제공하여 성능을 향상시키는 클래스
		
		try {
			File file = new File("영어단어.txt");
			System.out.println(file.exists());
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("i love you \n i like you");
			bufferedWriter.write(" my test");
			bufferedWriter.flush();		// 버퍼에 잔류하는 모든 문자열을 출력
			bufferedWriter.close();		// 사용한 시스템 자원을 반납하고 출력 스트림을 닫음
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file,true);		// true로 사용하면 앞 저장 내역에 이어서 입력
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("\nhuman");
			bufferedWriter.flush();
			bufferedWriter.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			// 파일 객체 생성
			File file = new File("Output.txt");
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
			
				while(true) {
					String line = bufferedReader.readLine();
					if(line == null) break;
					System.out.println(line);
					
				}	
				if(file.exists()) {
					System.out.println("파일이 존재합니다.");
				}else {
					System.out.println("파일이 존재하지 않습니다.");
				}
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getPath());
				System.out.println(file.getName());
				bufferedReader.close();
			
			File filetest = new File("C:\\Users\\03\\Desktop");
			boolean is_file = filetest.isFile();
			boolean is_exist = filetest.exists();
			System.out.println(is_file);
			System.out.println(is_exist);
			String abs = filetest.getAbsolutePath();
			System.out.println("절대경로: "+abs);
			FileReader filetest_reader = new FileReader(abs);
			BufferedReader bufferedReadertest = new BufferedReader(filetest_reader);
				while(true) {
					String line = bufferedReadertest.readLine();
					if(line==null) break;
					System.out.println(line);
				}
				
				
				File file1 = new File("sample.txt");
				OutputStream output = new FileOutputStream("sample.txt");
				output.write(65);
				byte[] data = "Hello, World".getBytes();
				output.write(data);
				output.close();
				
				
				
				InputStream input = new FileInputStream("sample.txt");
				byte[] buffer = new byte[1024];
				int byteRead = input.read(buffer);
				while(byteRead != -1) {		// 더이상 읽을 데이터가 없으면 -1을 반환
					byteRead = input.read(buffer);
				}
				input.close();
				
		}catch(Exception e) {
			
		}
	}

}
