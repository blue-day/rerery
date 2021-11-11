package package01.package001;

public class Board {
	int num;
	String subjeck;
	String content;
	String writer;
	int readCount;
	public Board() {};
	public Board(int num, String subjeck, String content, String writer, int readCount) {
		super();
		this.num = num;
		this.subjeck = subjeck;
		this.content = content;
		this.writer = writer;
		this.readCount = readCount;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubjeck() {
		return subjeck;
	}
	public void setSubjeck(String subjeck) {
		this.subjeck = subjeck;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	

}
