package homework12.number02;

public class NoticeBoard implements Board{

	@Override
	public void saveBoard() {
		System.out.println("공지게시판을 저장합니다.");
	}
	@Override
	public void modifyBoard() {
		System.out.println("공지게시판을 수정합니다.");
	}
	@Override
	public void searchBoard() {
		System.out.println("공지게시판을 조회합니다.");		
	}
	@Override
	public void deleteBoard() {
		System.out.println("공지게시판을 삭제합니다.");
	}
}
