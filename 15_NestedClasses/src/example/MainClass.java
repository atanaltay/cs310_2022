package example;

import example.Book.Cover;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Cover cov = new Book(). new Cover("Cover: Grapes of Wrath","blue");
	
		Book book = new Book("John Steinbeck", "Grapes of wrath", cov);
	
		System.out.println(book);
		
		
		Book book2 = new Book();
		Cover coverBook2 = book2. new Cover();
		coverBook2.setColor("black");
		coverBook2.setCoverTitle("Book title 2");
		
		
		book2.setCover(coverBook2);
		
		book2.setAuthorName("Author 2");
		book2.setBookTitle("Book title 2");
		
		System.out.println(book2);
		
		System.out.println("----------------------");
		
		
		Page1 page1 = new Page1();
		book.addPage(page1);
		
		
		//Anonymous inner class:
		
		book.addPage(new Page() {

			@Override
			public String getContent() {
				return "Page 2 content";
			}

		});
		
		book.addPage(new Page() {

			@Override
			public String getContent() {
				return "Page 3 content";
			}
		});
		
		//Lambda expression
		// it is only valid with functional 
		// interfaces
		book.addPage(()-> "Page4 content ");
		
		book.addPage(()-> {
			
			String content1 = "Page 5 starting...";
			
			return content1 ;
			
		});
		
		
		System.out.println(book);
		
		
	}

}
