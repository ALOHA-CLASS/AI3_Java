package Day09.test;

public class Food extends Product {
	
	String kcal;		// 칼로리
	String taste;		// 맛
	
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Food [kcal=" + kcal + ", taste=" + taste + "]";
	}
	
	

}
