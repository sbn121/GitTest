package pack07.last.jdbc;

public class BoardDTO {
	private int board_no;
	private String board_title, board_content, writer, write_date;
	
	
	public BoardDTO(int board_no, String board_title, String board_content, String writer, String write_date) {
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.writer = writer;
		this.write_date = write_date;
	}
	
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	
	
}
