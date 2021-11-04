
public class ExVariable_Control2 {
	public static void main(String[] args) {
		//if(조건식) { 조건식 참일때 실행되는부분 }
		//else if(조건식 2) { 조건식 2가 참일때 실행되는 부분}
		//else if는 계속해서 연결할수가 있다. 조건이 100개면 한개의 if와 99개의 else if
		//else if뒤에도 모든 else if를 만족하지 못했을때 else를 사용해서 마지막 처리를 하면 된다
		int num1 = 0;
		if(false) {
			ExVariable_Control2 abc = new ExVariable_Control2();
			int num2=1;
			System.out.println("첫번째 이프문");
			System.out.println(num2);
		}else if (true) {
			ExVariable_Control2 abc = new ExVariable_Control2();
			
			System.out.println("aaaaaaaaaaaaaaaaelse if 문");
			System.out.println();
		}else if (true) {
			System.out.println("두번째 else if문");
		}else {
			ExVariable_Control2 abc = new ExVariable_Control2();
			System.out.println("else문");
		}
		ExVariable_Control2 abc = new ExVariable_Control2.if();
		
		System.out.println(abc.num2);
	}
}
