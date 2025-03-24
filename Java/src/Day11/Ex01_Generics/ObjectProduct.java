package Day11.Ex01_Generics;

class Student {}
class Developer {}

class Person {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class ObjectProduct {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setObject( new Student() );
		// 단점 : 다시 Student 타입으로 변환해서 사용해야한다.
		Student student = (Student) person1.getObject();
		
		Person person2 = new Person();
		person2.setObject( new Developer() );
		Developer developer = (Developer) person2.getObject();
		
		// 단점2
		// : 타입 변환이 불가능한 상황이 발생할 수 있다. (ClassCassException)
		Student student2 = (Student) person2.getObject();
		
		// 결론
		// Object 타입으로도 모든 타입을 다룰 수 있지만,
		// 이러한 단점들이 있기 때문에, 제네릭 기법을 사용한다.
	}

}








