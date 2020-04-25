package books;
import java.util.ArrayList;
import java.util.Iterator;



public class Roli_Books implements BookIterator
{
	
	ArrayList<BookInfo> books;
	
	public Roli_Books()
	{
		books= new ArrayList<BookInfo>();
		
		addBook("Dining with the Nawabs", "Dining with the Nawabs", 2017);
		addBook("Jodhpur Lancers", "M. S. Jodha", 2019);
		addBook("No Margin For Error", "Ehud Yonay", 1993);
		
		
	}
	public void addBook(String BookName,String AuthorName, int yearReleased)
	{
		
		BookInfo bookInfo = new BookInfo(BookName, AuthorName, yearReleased);
		
		books.add(bookInfo);
		
	}
	public Iterator createIterator()
	{
		
		return books.iterator();
	}
	
	
}
