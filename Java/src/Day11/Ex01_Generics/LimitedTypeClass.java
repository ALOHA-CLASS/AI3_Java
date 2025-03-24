package Day11.Ex01_Generics;

class X {}

class A extends X {}
class B extends A {}
class C extends A {}

// 타입 매개변수를 A 클래스와 그 하위 클래스로만 가능하도록 제한
class D <T extends A> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

// Number 클래스 타입 매개변수로 사용가능하도록 제한
// (Integer, Double 등 숫자타입 클래스만 사용가능하도록 제한)
class E <T extends Number> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


public class LimitedTypeClass {
	
	public static void main(String[] args) {
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		// (에러) D<X> d4 = new D<X>();
		// D 클래스 타입 매개변수를 A 클래스로 제한하고 있기 때문에,
		// X 클래스 타입 매개변수 지정 불가
		// A, B, C 클래스로 타입 매개변수 지정 가능
		
		d1.setT( new A() );
		d2.setT( new B() );
		d3.setT( new C() );
		
		d1.setT( new B() );		// B의 부모 클래스인 A 클래스로 업캐스팅
		d1.setT( new C() );		// C의 부모 클래스인 A 클래스로 업캐스팅

		// 업캐스팅 & 다운캐스팅
		// A a = new B();		// 업캐스팅
		// A a2 = new B();		// 다운 캐스팅 전제 조건 : 업캐스팅
		// B b = (B) a2;		// 다운캐스팅
		
		// d2<B>, d3<C> 	<-- 부모 객체인 A 대입 불가
		// * 다운캐스팅 상황인데, 업캐스팅이 전제되지 않아서 불가능하다.
		// (에러) d2.setT( new A() );
		// (에러) d3.setT( new A() );
		
		// E <T extends Number>
		// * Number 클래스로 제한해주어서 숫자 타입인 클래스만 타입지정 가능
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		// (에러 : 숫자타입 아님) E<Boolean> e4 = new E<Boolean>();
		
		e1.setT( 100 );
		System.out.println(e1.getT());
		
		e2.setT( 12.34 );
		System.out.println(e2.getT());
		
		// 그냥 쓴 정수는 (127) -> int타입으로 인식 -> 4byte
		// e3 객체에 지정한 타입은 Byte(byte) -> 1byte 이기때문에 강제 형변환이 필요하다.
		e3.setT( (byte) 127 );
		System.out.println( e3.getT() );
		
	}
	

}








