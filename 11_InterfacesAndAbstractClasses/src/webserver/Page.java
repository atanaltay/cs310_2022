package webserver;

public abstract class Page {

	private String title;
	private String url;
	private String content;
	
	public Page(String title, String url, String content) {
		super();
		this.title = title;
		this.url = url;
		this.content = content;
	}

	public abstract void render();
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	
	
	
	
}
