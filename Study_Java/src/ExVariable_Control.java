import java.util.Scanner;

public class ExVariable_Control {
	public static void main(String[] args) {
		// 변수~제어문 복습
		// 변수 이름으로 접근함
		// 타입 이름 ;
		int n;n = 10;
		String s = "20";
		System.out.println(s+n);
		int n2=Integer.parseInt(s);//파라미터는 무조건 String
		System.out.println(n2+n);
		System.out.println();
		char c = '1';
		Integer.toString(c);
		System.out.println(c);
		int n3 = Integer.parseInt(Integer.toString(c));
		System.out.println(n3); 
		System.out.println("뭐임이거? \n");
		
		n3 = Integer.parseInt(c+"");
		System.out.println(n3);
		
		
		String str=n+"";
		System.out.println("ㅁㅁ  "+str);
		
		//제어문
		if(1>0) {
			System.out.println("실행부");
			System.out.println("%%:or\t\t||:and");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("\n\n입력 : ");
			if(sc.nextLine().equals("A")) {
				System.out.println("A맞음");
			}else {
				System.out.println("A아님");
			}
		}
	}
}
