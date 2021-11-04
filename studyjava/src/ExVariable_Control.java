import java.util.Scanner;

public class ExVariable_Control {
	public static void main(String[] args) {
		//변수 ~ 제어문 복습 시작
		//변수는 데이터를 담기 위한 그릇    메모리에 주소부를 직접참조x
		//변수의 이름을 가지고 접근
		//변수의 타입 변수의 이름; <- 선언
		int number ; //초기화 되지 않은 변수는 사용이 불가능
		number = 10 ;
		System.out.println(number);
		//double <- 소수점 실수형 데이터를 사용하기 위함
		//boolean <- 부울형, true, false 논리형 데이터를 사용하기 위함.
		//★ 문자열 데이터 -> 숫자형 데이터
		// 숫자형 데이터 -> 문자열 데이터
		String str = "10";
		int num = Integer.parseInt(str); //문자
		System.out.println(num  ); 
		char chr = '1';
		num = Integer.parseInt(chr+""); //어떤 일반 변수를 String 으로 바꾸는 방법은 변수 + String
		//Double.parseDouble(s);
		//Float.parseFloat(s);
		str = num+"";
		System.out.println(str);
		
		//제어문 
		//if문
		//if(조건식) { 조건식이 참일때 실행 되는 부분 }
		
		if(1>0) {
			System.out.println("실행부");
		}
		//여러개의 조건식 가능 && <== 그리고  AND 모든 조건을 만족해야만. 한다. 논리곱
		//					   || <== 또는    OR  하나의 조건을 만족해도  논리합
		
		if(1>0 && 2>0) {
			
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		
		if(data.equals("a")) {
			System.out.println("a입니다");
		}else {
			System.out.println("a가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
