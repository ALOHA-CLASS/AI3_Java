package Day11.Ex02_WildCard;

// 제네릭 클래스 정의
// * public class 클래스명 <타입매개변수> { }
// 제네릭 클래스 객체
// * Box<String> box = new Box<String>();
public class Box <T>  {
	
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
