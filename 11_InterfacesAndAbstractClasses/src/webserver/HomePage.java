package webserver;import java.awt.Container;

public class HomePage extends Page{
	private String homePageContent;
	
	public HomePage(String title, String url, String content,
			String homePageContent) {
		super(title, url, content);
		this.homePageContent = homePageContent;
	}

	@Override
	public void render() {
		
		
		System.out.println("Home page is displayed");
		System.out.println("Content:");
		System.out.println(getContent());
		System.out.println(homePageContent);
	}

}
