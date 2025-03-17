package Day06.Review;

import java.util.Scanner;

public class Ex06_Method {
	
	/**
	 * 덧셈 메소드
	 * @author User
	 * @param a 첫 번째 피연산자
	 * @param b 두 번째 피연산자 
	 * @return 덧셈한 결과
	 */
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 메소드 정의
	// : 접근지정자 (static) 반환타입 메소드명( 매개변수 ) { }
	public static int minus(int a, int b) {
		// return 이후의 코드는 이미 메소드를 종료하였기 때문에 실행되지 않는다.
		if( a < 0 || b < 0 ) {
			return 0;
		}
		int result = a - b;
		// return (값);
		// 1. (값)을 메소드를 호출한 자리로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
		return result;
		// System.out.println("종료 이후에 출력!");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메소드 호출 : 메소드명( 인자1, 인자2 );
		// - 전달인자(argument)
		System.out.println( plus(a, b) );
		System.out.println( minus(a, b) );
		sc.close();
	}

}



