package Day03;

import java.util.Scanner;

public class Ex05_Switch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채널 : ");
		int channel = sc.nextInt();
		
		switch (channel) {
			case 11:
				System.out.println("MBC - 굿데이");
				break;
			case 17:
				System.out.println("tvN - 콩콩밥밥 - 이광수, 도경수");
				break;
			case 24:
				System.out.println("ENA - 나는솔로 - 데프콘");
				break;
			case 100:
				System.out.println("넷플릭스 - 중증외상센터 - 주지훈");
				break;
			default:
				System.out.println("요청하신 채널이 없습니다.");
				break;
		}
		sc.close();
	}

}
