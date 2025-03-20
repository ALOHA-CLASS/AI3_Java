package Day09.test;

public class Cloth extends Product {
	
	String color;			// 색상
	String size;			// 사이즈 S M L
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Cloth [color=" + color + ", size=" + size + "]";
	}
	
	

}
