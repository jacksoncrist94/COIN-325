package Lab6;

//import java.util.Scanner;

public class BookShelf{
	
	Book book1;
	Book book2;
	Book book3;
	Book book4;
	Book book5;
	
	//Scanner scan = new Scanner(System.in);
	
	public BookShelf(){
		book1 = new Book(null, null, null, null);
		book2 = new Book(null, null, null, null);
		book3 = new Book(null, null, null, null);
		book4 = new Book(null, null, null, null);
		book5 = new Book(null, null, null, null);
	}
	
	public void setBooks(Book mBook){
		mBook.setTitle();
		mBook.setAuthor();
		mBook.setPublisher();
		mBook.setYear();
	}
	
        /*
	 * DPW: This function simply returns the book passed in.  I do not see
	 * the usefulness of this function.
	 * One getter might be:
	 * public Book getBook1() {
	 *     return book1;
	 * }
	 */
	public Book getBook(Book mBook){
		return mBook;
	}
	
	public int numBooks(){
		int count = 0;
		
		if(book1 != null){
			count++;
		}
		if(book2 != null){
			count++;
		}
		if(book3 != null){
			count++;
		}
		if(book4 != null){
			count++;
		}
		if(book5 != null){
			count++;
		}
		
		return count;
	}
	
}
