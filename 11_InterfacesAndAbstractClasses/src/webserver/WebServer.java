package webserver;

public class WebServer {

	public WebServer() {
		System.out.println("Web server started");
	}
	
	public void displayPage(Page page) {
		
		System.out.println("Page loaded: ");
		System.out.println(page.getTitle());
		System.out.println(page.getUrl());
		
		page.render();
		
	}
	
	
	
}
