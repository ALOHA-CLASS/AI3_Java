package Day12.Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;

import lombok.Builder;
import lombok.Data;

/**
 * 1. 영화 클래스 정의
 * 2. 변수 선언 : title, director, price 
 * 3. 영화를 제목순으로 오름차순 정렬
 *  - Comparable 인터페이스 구현
 *  - compareTo() 메소드 오버라이딩
 *  - 비교기준 설정
 *  	* String 의 compareTo() 메소드 활용
 *  	* 해당문자열.compreTo( 비교문자열 )
 *  	i) 		해당문자열이 사전순으로 더 뒤에 있으면 (양수)
 *  	ii) 	해당문자열이 사전순으로 더 앞에 있으면 (음수)
 *  	iii)	같은 문자열이면 0
 *  
 */

@Data
@Builder
class Movie implements Comparable<Movie> {
	String title;
	String director;
	int price;
	
	
	@Override
	public int compareTo(Movie o) {
		// 제목순으로 오름차순
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		return result;
	}
	
}

public class ComparableEx2 {
	
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add( new Movie("미키17", "봉준호", 25000) );
		movieList.add( new Movie("서브스턴스", "코랄리 파르쟈", 20000) );
		movieList.add( new Movie("백설공주", "디즈니", 15000) );
		movieList.add( new Movie("타짜", "최동훈", 18000) );
		movieList.add( new Movie("포레스트 검프", "로버트 지메키스", 19000) );
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println();
		
		// 정렬
		Collections.sort( movieList );
		
		// 정렬 후
		System.out.println("정렬 후");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println();
		
	}

}





