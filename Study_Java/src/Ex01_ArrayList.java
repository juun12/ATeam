package pack01_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		//List
		//E<-Element (요소) 
		//List가 가지는 객체의 타입이 무엇인지를 우리가 정의하는 부분
		//E <- String[] DataType무엇인지를 쓰는 부분.
		String[] arr = new String[3];
		List<String> list = new ArrayList<>();
		//arr.length = 40;
		System.out.println(arr.length);
		System.out.println(list.size());
		list.add("Java1");//list.size()-1
		list.add("Java2");
		list.add("Java3");
		list.add("Java4");
		list.add("Java5");
		list.add("Java6");
		list.add("Java7");
		list.add("Java8");
		list.add("Java9");
		list.add("Java10");
		list.add(2, "인덱스를 선택한 데이터1");
		list.add(2, "인덱스를 선택한 데이터");
		System.out.println(list.size());
		System.out.println(list.get(0));
		//for문을 이용해서 list에 있는 전체내용을 콘솔에 출력하시오.
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i) + i);
		}
		//List에 데이터 추가 방법 add라는 메소드를 이용해서 추가한다.
		//배열을 사용했을때는 인덱스에 접근해서 해당하는 데이터타입을 초기화
		//시키거나 값을 할당했다. [""] [String] [String]
		
	}
}
