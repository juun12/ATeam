import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
		//데이터타입을 하나의 개체로 무꺼놓고 한번에 사용할때.
		//>>new 인스턴스<<
		String abc = new String("ㅁ"+"ㄴ"+"ㅇ"+"ㄹ"+123); // <- 사실은 이거라고함
		System.out.println(abc+" O "+abc+" O "+abc+" O ");
		System.out.println();
		abc = "ㅁ"+"ㄴ"+"ㅇ"+"ㄹ"+123;
		System.out.println(abc+" O "+abc+" O "+abc+" O ");
		System.out.println("\nㅁ\n");
		ExDTO ab = new ExDTO();
		System.out.println(ab.a1);
		System.out.println(ab.a2);
		System.out.println(ab.a3);
		System.out.println(ab.a);
		System.out.println();
		ab.a1=10;
		ab.a2="깎깎";
		ab.a3=9.999999999;
		ab.a = new ArrayList<String>();
		ab.a.add("ㅁ");
		ab.a.add("ㄴ");
		ab.a.add("ㅁ");
		ab.a.add("ㅇ");
		ab.a.add("ㅁ");
		ab.a.add("ㄹ");
		System.out.println(ab.a1);
		System.out.println(ab.a2);
		System.out.println(ab.a3);
		System.out.println(ab.a);
		
		System.out.println("\n\n");
		
		System.out.println(ExDTO.s1);
		System.out.println(ExDTO.s2);
		System.out.println(ExDTO.s3);
		ExDTO.s = new ArrayList<>();
		ExDTO.s.add(1);
		ExDTO.s.add(2);
		ExDTO.s.add(3);
		ExDTO.s.add(4);
		ExDTO.s.add(5);
		System.out.println(ExDTO.s);
	}
}
