package CollectionFramework;

public class Board {
	String subject;
	String content;
	String writter;
	public Board(String subject, String content, String writter) {
		super();
		this.subject = subject;
		this.content = content;
		this.writter = writter;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	
}
