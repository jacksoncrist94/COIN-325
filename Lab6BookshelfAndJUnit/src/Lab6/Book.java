package Lab6;

import java.util.Scanner;

public class Book{
	
	private String title;
	private String author;
	private String publisher;
	private String year;
	
	Scanner scan = new Scanner(System.in);
	
	public Book(String mTitle, String mAuthor, String mPublisher, String mYear){
		title = mTitle;
		author = mAuthor;
		publisher = mPublisher;
		year = mYear;
	}
	
        /* DPW: I see that you had the setter get the input from keyboard input.
	 * In general a setter is passed int eh value to set.  For example:
	 * public void setTitle(String title) {
	 *     this.title = title;
	 * }
	 * Please ensure future setters are written this way.
         */
	public void setTitle(){
		title = scan.nextLine();
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(){
		author = scan.nextLine();
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setPublisher(){
		publisher = scan.nextLine();
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void setYear(){
		year = scan.nextLine();
	}
	
	public String getYear(){
		return year;
	}
	
	public String toString(){
		String bookString = title + ", " + author + ", " + publisher +", " +  year + ", ";
		return bookString;
	}
}
