package Day09.test;

public class Product {
	
	String name;			// 상품명
	int price;				// 가격
	// 생성자
	public Product() {
		
	}
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// toString
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	

}
