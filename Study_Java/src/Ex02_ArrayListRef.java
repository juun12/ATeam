package pack01_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02_ArrayListRef {
	public static void main(String[] args) {
		//BoardDTO dto = new BoardDTO(1, "title", "content");
		BoardDTO[] barray = new BoardDTO[3];
		//System.out.println(Arrays.toString(barray));
		//barray[0] =	dto;
		barray[0] =	new BoardDTO(1, "title1", "content1");
		System.out.println(barray[0].getTitle());
		//barray[1] =	new BoardDTO(2, "title2", "content2");
		//barray[2] =	new BoardDTO(3, "title3", "content3");
		//System.out.println(Arrays.toString(barray));
		//?[ dto ]
		//[  null ]  [  null ]   [ null   ]
		ArrayList<BoardDTO> list = new ArrayList<>();
		list.add(new BoardDTO(1, "title1", "content1"));
		list.add(new BoardDTO(2, "title2", "content2"));
		//list.add(null);//
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		//list.get(i)`
		// [                             ]
		//list BoardDTO 2개를 넣으세요.
		//2개의 정보를 for문을 통해 출력.
	}
}
