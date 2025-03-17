package Day06.Ex04_중첩인터페이스;

public class Main {
	
	public static void main(String[] args) {
		// 중첩 인터페이스의 아우터 클래스 객체 생성
		I i = new I();
		
		// 구현 객체를 메소드를 통해 지정
		K k = new K();
		i.setInterface( k );
		i.method();
		System.out.println();
		
		I.J j = new K();
		j.methodA();
		j.methodB();
	}

}
