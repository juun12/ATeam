import java.util.Scanner;

public class ExVariable_Control {
	public static void main(String[] args) {
		//변수 ~ 제어문 복습
		//변수라는것은 데이터를 담기위한 그릇 메모리의 주소부를 개발자가 직접 참조하는게아니라
		//변수의 이름을 가지고 접근을 한다.
		//변수의타입 변수의 이름 ; <-선언
		int number ; //초기화 되지 않은 변수는 사용이 불가능 하다.(
		number = 10 ; //변수의 선언과 변수에 값을 할당하면 초기화 라고 한다.(사용할 준비 완료)
		System.out.println(number);
		//double <-소숫점 실수형 데이터를 사용하기 위함
		//boolean <-부울형 true,false 논리형 데이터를 사용하기위함.
		//★ 문자열 데이터 -> 숫자형 데이터
		// 숫자형 데이터 -> 문자열 데이터
		String str = "10" ;
		int num = Integer.parseInt(str); //※Integer.parserInt메소드의 파라메터는 무조건 String이어야한다.
		char chr = '1';//<-숫자로 
		//num이라는 변수에 재할당 해보기.
		//Integer.parseInt메소드를 반드시 이용해서 chr이라는 변수의 값을 숫자로 바꿔보기.
		num = Integer.parseInt( chr+"" );//어떤 일반 변수를 String으로 바꾸는 방법은 변수 + String
		//Wrapper Class 일반 변수와 이름이 같은데 Class형태
		//Double.parseDouble(s);
		//Float.parseFloat(s)
		str = num + "";
		
		//제어문 프로그램을 올바른 방향(개발자가 원하는 방향)으로 제어하기 위한 문법.
		//if문 
		//if( 조건식 ){ 조건식이 참일때 실행 되는 부분   }
		//※조건식은 반드시 true , false가 되어야 한다. 
		//true , false을 바로 넣을 수도 있다. (boolean)
		//만약에( 어떠한 결과가 true,false 라면 ) { 실행되는 부분 }
		if( 1 > 0) {
			System.out.println("실행 되는 부분");
		}
		//여러개의 조건식을 줄수가 있다. &&<=그리고 AND 모든 조건을 만족해야만. .논리곱  1 * ... 0 <= 0
		//						 ||<=또는	  OR  하나의 조건을 만족해도. .논리합 1 + 0 + 1 = 1
		if(1 > 0 && 2 > 0) {// && , || 계속해서 이어서 조건을 추가할수가있다.
			System.out.println("1은 0보다 크다 그리고 2도 0보다 크다.");
		}
		if(1 > 0 || 0 > 0) {// && , || 계속해서 이어서 조건을 추가할수가있다.
			System.out.println("===실행이 되는 부분======");
		}
		
		//if (조건식) {  조건식이 만족했을때 실행되는 부분 } else {  조건식을 만족하지 못했을때 실행되는부분 } 
		if(1 > 0 && 0>0) {// 1 * 0 = 0;
			System.out.println("실행이 안되는 부분");
		}else {
			System.out.println("여기는 else 입니다.");
		}
		//문제) Scanner로 어떤 값을 입력받는다. 그리고 그 값이 A와 같다면 A입니다를 출력하시고,
		//A와 같지 않다면 A가 아닙니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); //String값을 입력받음.
		if(input.equals("A")) {
			System.out.println("A가 맞습니다.");
		}else {
			System.out.println("A가 아닙니다.");
		}
		
	}
}





