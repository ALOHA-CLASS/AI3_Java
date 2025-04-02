package Day12.Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 1. Comparator 인터페이스 구현
 * 2. compare() 메소드 오버라이딩
 * 		- 정렬 기준1 : 나이순 내림차순
 * 		- 정렬 기준2 : 이름순 오름차순 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class User implements Comparator<User> {
	String id;
	String name;
	int age;
	
	@Override
	public int compare(User o1, User o2) {
		// 1. 나이순으로 내림차순
		// 2. 이름순으로 오름차순
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		// 방법 1
		// 나이순 ↓
//		if( age1 > age2 ) return -1;
//		if( age1 < age2 ) return 1;
//		if( age1 == age2 ) {
//			// 이름순 ↑
//			int gap = name1.compareTo(name2);
////			if( gap > 0 ) return 1;
////			if( gap < 0 ) return -1;
////			if( gap == 0 ) return 0;
//			return gap;
//		}
//		return 0;
		
		// 방법 2
		int result1 = age2 - age1;
		int result2 = name1.compareTo(name2);
		return result1 == 0 ? result2 : result1;
	}
	
	
}

public class ComparatorEx {
	
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(
			new User("joeun1234", "홍조은", 34),
			new User("user1004", "전조은", 25),
			new User("joeun1004", "김조은", 25),
			new User("tje0202", "배조은", 25),
			new User("aloha1007", "박조은", 28),
			new User("kje0715", "권조은", 30),
			new User("leejoeun22", "이조은", 22),
			new User("hje25", "황조은", 25)
		);
		
		// 정렬 전
		System.out.println("정렬 전");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println();
		
		// 정렬
		Collections.sort( userList, new User() );
		
		System.out.println("정렬 후");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println();
		
		
		List<User> userList2 = Arrays.asList(
			new User("joeun1234", "홍조은", 34),
			new User("user1004", "전조은", 25),
			new User("joeun1004", "김조은", 25),
			new User("tje0202", "배조은", 25),
			new User("aloha1007", "박조은", 28),
			new User("kje0715", "권조은", 30),
			new User("leejoeun22", "이조은", 22),
			new User("hje25", "황조은", 25)
		);
		
		// Collections.sort( 컬렉션, 정렬기준객체 );
		// * 익명구현객체를 사용하여, 정렬
		Collections.sort( userList2, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				// 아이디 기준 오름차순
				String id1 = o1.getId();
				String id2 = o2.getId();
				return id1.compareTo(id2);
			}
		});
		
		System.out.println("아이디기준 오름차순");
		for (User user : userList2) {
			System.out.println(user);
		}
		System.out.println();
		
				
	}

}









