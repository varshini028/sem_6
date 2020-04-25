package books;

import java.util.Iterator;



public class BookService 
{
	

	
	
	BookIterator iterroli;
	BookIterator iterb;
	BookIterator iterc;
	

	public BookService(BookIterator newiterroli, BookIterator newiterb, BookIterator newiterc) 
	{
		
		iterroli = newiterroli;
		iterb = newiterb;
		iterc = newiterc;
		
	}
	public void showTheBooks()
	{
		
		
		
		Iterator roli = iterroli.createIterator();
		Iterator b = iterb.createIterator();
		Iterator c = iterc.createIterator();
		
		System.out.println("books of the Roli_publishers\n");
		printTheBooks(roli);
		
		System.out.println("books of the b_publishers\n");
		printTheBooks(b);
		
		System.out.println("books of the b_publishers\n");
		printTheBooks(c);
		
	}
	public void printTheBooks(Iterator iterator)
	{
		
		while(iterator.hasNext())
		{
			
			BookInfo book = (BookInfo) iterator.next();
			
			System.out.println(book.getBookName());
			System.out.println(book.getAuthorName());
			System.out.println(book.getYearReleased() + "\n");
			
		}
		
	}

}
