package Day09;
// import 하는 방법
// 하나씩 import 		: 클래스| - 마지막 글자 뒤에 커서 놓고 ctrl + space
// 한 번에 import		: ctrl + shift + O 

//import Day09.test.Cloth;
//import Day09.test.Food;
//import Day09.test.Product;

// 패키지 아래 전체 클래스 포함하기 : import 패키지.*;
 import Day09.test.*;

public class Test {
	
	public static void main(String[] args) {
		Product product = new Product();
		
		Cloth cloth = new Cloth();
		
		Food food = new Food();
	}

}
