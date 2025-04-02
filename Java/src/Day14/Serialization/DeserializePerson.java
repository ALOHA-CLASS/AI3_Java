package Day14.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializePerson {
	
	public static void main(String[] args) {
		try (
			// "Person.dat" 파일을 읽기 위한 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("Person.dat");
			// 파일에서 객체를 읽어오기 위한 객체 스트림 생성
			ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			// "Person.dat" 파일에서 객체를 읽어와 Person 타입으로 다운캐스팅
			Person person = (Person) ois.readObject();
			
			// person 객체를 출력 
			System.out.println(person);
			
			System.out.println("Person.dat 파일 데이터를 역직렬화하여 Person 객체로 가져옴");
			
		} catch (Exception e) {
			// 예외 발생 시 에러 메시지 출력
			e.printStackTrace();
		}
	}

}





