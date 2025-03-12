package Day03;

public class Ex15_GuguAll {
	
	public static void main(String[] args) {
		// (단)x(1~9)
		// 단에 대한 반복  : 1~9  : j
		// 각 단의 곱		: 1~9  : i

		// 중첩 반복문(이중 반복문)
		// * 안쪽 반복문이 먼저 다 돌고, 바깥쪽 반복문의 반복변수가 증감된다.
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (i*j));
				System.out.print("\t");			// 탭(공백)
			}
			System.out.println();
		}
	}

}






