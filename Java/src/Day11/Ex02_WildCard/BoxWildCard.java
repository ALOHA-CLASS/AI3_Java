package Day11.Ex02_WildCard;

import Day05.Ex04_상속.Pikachu;
import Day05.Ex04_상속.Raichu;

/**
 * 제네릭 와일드카드
 * - 알 수 없는 타입을 대체하여 사용하는 기호
 * - 주로 타입 제한을 위해서 사용한다.
 * 1) ? super T		: 해당 클래스부터 상위 클래스 범위까지 제한
 * 2) ? extends T	: 해당 클래스부터 하위 클래스 범위까지 제한
 */
public class BoxWildCard {
	
	public static void main(String[] args) {
		Box<?> wildCardBox = new Box<>();
		
		Box<String> box1 = new Box<>();
		box1.setT("String Box");
		
		Box<?> wBox = box1;
		
		// Number 클래스와 하위 클래스 허용
		Box<Integer> box2 = new Box<>();
		Box<Double> box2_a = new Box<>();
		Box<Byte> box2_b = new Box<>();
		
		Box<? extends Number> wBox2 = box2;
		wBox2 = box2_a;
		wBox2 = box2_b;
		// (에러) Box<? extends Number> wBox2_2 = box1;
		
		// Raichu 와 상위 클래스 허용
		Box<Pikachu> box3 = new Box<>();
		Box<Raichu> box3_2 = new Box<>();
		Box<? super Raichu> wBox3 = box3;
		Box<? super Raichu> wBox3_2 = box3_2;
		
		// ? 와일드카드 사용 시, 어떤 타입이든 사용 가능
		wildCardBox = box1;			// String
		wildCardBox = box2;			// Integer
		wildCardBox = box3;			// Pikachu
	}
	
	
	

}
