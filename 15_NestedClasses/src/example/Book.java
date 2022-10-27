package example;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String authorName;
	private String bookTitle;
	private Cover cover;
	private List<Page> pages = new ArrayList<>();
	

	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	



	public Book(String authorName, String bookTitle, Cover cover) {
		super();
		this.authorName = authorName;
		this.bookTitle = bookTitle;
		this.cover = cover;
	}

	public void addPage(Page page) {
		pages.add(page);
	}

	public List<Page> getPages() {
		return pages;
	}
	
	
	@Override
	public String toString() {
		String retVal = "Book [authorName=" + authorName + ", bookTitle=" + bookTitle + ", cover=" + cover + "]";
		
		for (Page page : pages) {
			retVal+= "\n" + page.getContent();
		}
		
		return retVal;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public String getBookTitle() {
		return bookTitle;
	}



	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}



	public Cover getCover() {
		return cover;
	}



	public void setCover(Cover cover) {
		this.cover = cover;
	}



	//Nested class / inner class / member class
	class Cover{
		
		private String coverTitle;
		private String color;
		
		public Cover() {
			
			
			
		}
		
		public Cover(String coverTitle, String color) {
			super();
			this.coverTitle = coverTitle;
			this.color = color;
		}
		public String getCoverTitle() {
			return coverTitle;
		}
		public void setCoverTitle(String coverTitle) {
			this.coverTitle = coverTitle;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Cover [coverTitle=" + coverTitle + ", color=" + color + "]";
		}
		
		
		
		
		
		
		
	}
		
	

}
