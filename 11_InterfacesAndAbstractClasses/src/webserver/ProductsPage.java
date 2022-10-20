package webserver;

public class ProductsPage extends Page{

	private String[] products;
	
	public ProductsPage(String title, String url, String content,
			String[] products) {
		super(title, url, content);
		this.products = products;
	}

	@Override
	public void render() {
		System.out.println("Products are displayed:");
		
		for (String prod : products) {
			System.out.println(prod);
		}
		
	}

}
