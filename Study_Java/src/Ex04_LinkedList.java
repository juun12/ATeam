package pack01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_LinkedList {
	public static void main(String[] args) {
		//LinkedList vs ArrayList
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		//============여기 밑부분 부터는 중요한 소스가 아닙니다./====/
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,new String("aa"));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에  작업 소요시간" + 
						(endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,new String("aa"));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에 작업 소요시간" + 
						(endTime - startTime) + "ns");
		
		
	}
}
