package _15_IO_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test_main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		File file = new File("영어단어.txt");
//		FileWriter writer = new FileWriter(file);
//		BufferedWriter bufferedWriter = new BufferedWriter(writer);
//		FileReader reader = new FileReader(file);
//		BufferedReader bufferedReader = new BufferedReader(reader);
		
		while(true) {
			System.out.println("---영어단어장---");
			System.out.println("1. 영어단어 저장하기");
			System.out.println("2. 영어 단어 검색하기");
			System.out.println("3. 단어 전체조회");
			System.out.println("4. 단어 삭제하기");
			System.out.println("5. 단어장 종료하기");
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum == 1) {
				add();
			}else if(selNum==2) {
				find();
			}else if(selNum==3) {
				all();
			}else if(selNum==4) {
//				delete();
			}else {
				break;
			}			
		}
		
	}
	
	
	
	
//	private static void delete() {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		boolean flag = true;
//		try {
//			File file = new File("영어단어.txt");
//			FileReader file_r = new FileReader(file);
//			BufferedReader buffered = new BufferedReader(file_r);
//			System.out.println("삭제할 단어를 입력하세요.");			
//			String word = in.nextLine();
//			String line = buffered.readLine();
//			
//			while(true) {
//				for (int i = 0; i < word(line).length; i++) {
//					if(word(line)[i].contains(word)){
//						System.out.println(word(line)[i]);
//						System.out.println("해당단어를 삭제합니다.");
//						line.replace(word(line)[i], null);
//						flag = false;
//						break;
//					}
//				}
//				if(flag) {
//					System.out.println("해당단어는 존재하지 않습니다.");
//					break;
//				}
//				break;	
//			}
//		}catch(Exception e) {
//			System.out.println("");			
//		}
//	}
	





	private static String[] word(String line) {
		String[] array = line.split("/");
		return array;
	}
	
	
	private static void find() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			File file = new File("영어단어.txt");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("검색할 영어 단어를 입력하세요.");
			String word = in.nextLine();
			String line = bufferedReader.readLine();
			boolean flag = true;
			
			
			while(true) {
//				System.out.println("검색단어 인덱스: "+line.indexOf(word));
//				for (int i = 0; i < array.length; i++) {
//					System.out.println(array[i]+"**");
//				}
//				System.out.println(array.length);
				
				for (int i = 0; i < word(line).length; i++) {
					if(word(line)[i].contains(word)){
						System.out.println("해당단어 아래와같이 존재합니다.");
						System.out.println(word(line)[i]);
						flag=false;
						break;
					}
				}
				if(flag) {
						System.out.println("해당단어는 존재하지 않습니다.");
						break;
				}
				break;	
			}			
		}catch(Exception e) {
			System.out.println("");
		}
		
	}
	
	public static void all() {
		try {
			File file = new File("영어단어.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(filereader);
			while(true) {
				String line = bufferedReader.readLine();
				if(line==null) break;
				System.out.println(line);
			}
		}catch(Exception e){
			
		}
		
	}
	
	public static void add() {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("저장할 단어를 입력하세요.(영어-한글 형태)");
		FileWriter writer;
		
		try {
			File file = new File("영어단어.txt");
			writer = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			String write_string = in.nextLine();	// 저장 내용 입력
			bufferedWriter.write(write_string+"/");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
