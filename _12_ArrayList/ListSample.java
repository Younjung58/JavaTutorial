package _12_ArrayList;

import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	
	public ListSample() {
		System.out.println("리스트의 길이 "+a.size());				// 리스트길이 0
		a.add("apple");					// 리스트의 빈칸에 값을 저장함-> 리스트의 길이가 1로 변화됨
		System.out.println("리스트의 길이 "+a.size());				// 리스트길이1
		a.add("banana");
		a.add("abc초코렛");
		a.add("샌드");
		System.out.println("리스트의 길이 "+a.size());
		System.out.println(a.get(1));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a);
		System.out.println("------코드응용------");
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).charAt(0)!='a') {
				System.out.println(a.get(i));
			}
		}
	}

}
