package Day12.Collection.List;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		// Vector 생성
		// - 학생 목록
		Vector<String> studentList = new Vector<String>();
		
		// 요소 추가 - add()
		studentList.add("고건우");
		studentList.add("장예지");
		studentList.add("구본걸");
		studentList.add("배은주");
		studentList.add("김조은");
		
		System.out.println("::::: 학생 목록 :::::");
		System.out.println( studentList );
		System.out.println("-------------------");
		
		// 요소 제거 - remove()
		studentList.remove("배은주");		// 객체 요소(인스턴스)로 제거
		studentList.remove(1);			// index 로 제거
		
		// 요소 접근 - get()
		String firstStudent = studentList.get(0);
		String secondStudent = studentList.get(1);
		System.out.println("첫 번째 학생 : " + firstStudent);
		System.out.println("두 번째 학생 : " + secondStudent);
				
		// 요소 개수 - size()
		int size = studentList.size();
		System.out.println("남은 학생 수 : " + size);
		
		// 모든 요소 제거 - clear()
		studentList.clear();
		System.out.println("::::: 모든 요소 제거 :::::");
		System.out.println(studentList);
		System.out.println("-----------------------");
		
		// 요소 전체 추가 - addAll()
		Vector<String> 야근반 = new Vector<String>();
		야근반.add("서성재");
		야근반.add("전주원");
		야근반.add("이윤태");
		studentList.addAll(야근반);
		
		System.out.println("::::: 요소 전체 추가 :::::");
		for (int i = 0; i < studentList.size(); i++) {
			String student = studentList.get(i);
			System.out.print(student);
			if( i < studentList.size()-1 ) System.out.print(", ");
		}
		System.out.println();
		for (String student : 야근반) {
			System.out.print(student + " ");
		}
		System.out.println();
		
		// 다른 컬렉션을 인자로 생성할 수 있다.
		Vector<String> 오전반 = new Vector<String>(야근반);
		오전반.add("박도현");
		for (String student : 오전반) {
			System.out.print(student + " ");
		}
		System.out.println();
		
		
		
	}

}





