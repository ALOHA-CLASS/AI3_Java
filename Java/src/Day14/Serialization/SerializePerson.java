package Day14.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializePerson {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 입력
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// Person 객체 생성
		Person person = new Person(name, age);
		
		// Person 객체 직렬화
		// : 객체를 바이트 데이터로 변환하여 파일로 저장
		try(
			// "Person.dat" 파일을 생성하고 파일 출력 스트림을 생성
			FileOutputStream fos = new FileOutputStream("Person.dat");
			// 객체를 직렬화하여 파일에 저장할 수 있도록 객체 스트림을 생성
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			// person 객체를 직렬화하여 파일에 저장
			oos.writeObject(person);
			// 직렬화가 완료 메시지 출력
			System.out.println("Person 객체를 직렬화하여 Person.dat 에 저장 완료!");
		} catch (Exception e) {
			// 예외 발생 시 에러 메시지 출력
			e.printStackTrace();
		}
		
		sc.close();
	}

}






