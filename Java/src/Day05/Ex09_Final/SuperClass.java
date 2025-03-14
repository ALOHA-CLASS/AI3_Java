package Day05.Ex09_Final;

public class SuperClass {
	
	// fianl 메소드
	public final void finalMethod() {
		System.out.println("final 메소드 입니다.");
	}

}

class SubClass extends SuperClass {
	
	// * final 메소드는 오버라이딩할 수 없다.
//	@Override
//	public final void finalMethod() {
//		System.out.println("final 메소드 입니다.");
//	}
	
}
