package pack01_List;

public class BoardDTO {
	//게시판의 속성을 가지고있는 객체 
	private int no;//게시글의 번호
	private String title;//게시글의 제목
	private String content;//게시글의 내용

	public BoardDTO(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
