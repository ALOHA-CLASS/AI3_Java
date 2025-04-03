package board;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		int menuNo;
		
		do {
			System.out.println("::::: 게시판 :::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNo = sc.nextInt();
			sc.nextLine();
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
				case 1:		// 게시글 목록
							Board[] boardList = boardInterface.list();
							if( boardList != null )
									for (Board board : boardList) {
										System.out.println(board);
									}
							break;
				case 2:		// 게시글 등록
							System.out.print("제목 : ");
							String title = sc.nextLine();
							System.out.print("작성자 : ");
							String writer = sc.nextLine();
							System.out.print("내용 : ");
							String content = sc.nextLine();
							
							Board board = new Board(title, writer, content);
							Board createdBoard = boardInterface.create(board);
							
							if( createdBoard != null ) {
								System.out.println("::::: 등록된 게시글 정보 :::::");
								System.out.println(createdBoard);
							}
							break;
				case 3:		// 게시글 조회
							System.out.print("조회할 글 번호 : ");
							int no = sc.nextInt();
							sc.nextLine();
							Board selectedBoard = boardInterface.read(no);
							if( selectedBoard != null ) {
								System.out.println("::::: 조회된 게시글 :::::");
								System.out.println(selectedBoard);
							}
							break;
				case 4:		// 게시글 수정
							// 입력 : 수정 번호/제목/작성자/내용
							System.out.print("수정할 글 번호 : ");
							int updateNo = sc.nextInt();
							sc.nextLine();
							System.out.print("제목 : ");
							String updateTitle = sc.nextLine();
							System.out.print("작성자 : ");
							String updateWriter = sc.nextLine();
							System.out.print("내용 : ");
							String updateContent = sc.nextLine();
							Board updateBoard = new Board(updateTitle, updateWriter, updateContent);
							updateBoard.setNo(updateNo);
							boolean result = boardInterface.update(updateBoard);
							if( result ) System.out.println("게시글 수정 완료!");
							else System.out.println("게시글 수정 실패!");
							break;
				case 5:		// 게시글 삭제
							System.out.print("삭제할 글 번호 : ");
							int deleteNo = sc.nextInt();
							sc.nextLine();
							result = boardInterface.delete(deleteNo);
							if( result ) System.out.println("게시글 삭제 완료!");
							else System.out.println("게시글 삭제 실패!");
							break;
			}
		} while (true);
		System.out.println("프로그램을 종료합니다...");
		sc.close();
	}

}







