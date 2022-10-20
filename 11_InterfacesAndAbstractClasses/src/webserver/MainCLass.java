package webserver;

public class MainCLass {

	public static void main(String[] args) {
		
		WebServer webServer = new WebServer();
		
		HomePage homePage = new HomePage("Home Title", 
				"/home", "home content", 
				"home page specific content");
		
		webServer.displayPage(homePage);
		
		String[] prods = {"TV","Laptop","Desktop Computer"};
		
		Page productsPage = new
				ProductsPage("Products", "/products",
						"Products content", prods);
		
		webServer.displayPage(productsPage);
		
		
	}
	
	
}
