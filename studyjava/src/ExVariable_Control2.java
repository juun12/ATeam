
public class ExVariable_Control2 {
<<<<<<< HEAD
	public static void main(String[] args) {
		int num1 = 0;
		
		if(false) {
			int num2 = 1;
			System.out.println("첫 이프문");
		} else if (true) {
			System.out.println("else if 문");

		} else if (true) {
			System.out.println("else if 문2");

		} else {
			System.out.println("else 문");
		}
		System.out.println(num1);
		//System.out.println(num2);

=======

	public static void main(String[] args) {
		//if(조건식) { 조건식 참일때 실행되는 부분}
		//else if(조건식){ 조건식 2가 참일 때 실행되는 부분}
		//else if는 계속해서 연결할 수가 있다. 조건이 100개면 한개의 ifㅇ와 99개의 else if
		//else if뒤에도 모든 else if를 만족하지 못했을 때 else를 사용해서 마지막 처리를 하면 된다.
		//변수의 사용범위(지역변수) == 메소드 안에서 변수를 만들었을 때.local variable
		//블럭킹 == 중괄호== { }를 기준으로 어디에 있느냐에 따라 사용범위가 달라진다.
		int num1 = 0; //<-이 변수의 사용범위
		if(true) {
			int num2 = 1; //이 변수의 사용범위
			System.out.println(num2);
			System.out.println("첫번째 이프문"+num2);
		}else if(true) {
			System.out.println("else if문");
		}else if(true) {
			System.out.println("두번째 else if 문");
		}else {
			System.out.println("else문");
			
		}
		//
		System.out.println(num1);
>>>>>>> lju
	}

}
