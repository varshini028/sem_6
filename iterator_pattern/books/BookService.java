package books;

import java.util.Iterator;



public class BookService 
{
	

	
	
	BookIterator iterroli;
	BookIterator itersrishti;
	BookIterator iterc;
	

	public BookService(BookIterator newiterroli, BookIterator newitersrishti, BookIterator newiterc) 
	{
		
		iterroli = newiterroli;
		itersrishti = newitersrishti;
		iterc = newiterc;
		
	}
	public void showTheBooks()
	{
		
		
		
		Iterator roli = iterroli.createIterator();
		Iterator srishti = itersrishti.createIterator();
		Iterator c = iterc.createIterator();
		
		System.out.println("books of the Roli_publishers\n");
		printTheBooks(roli);
		
		System.out.println("books of the Srishti_publishers\n");
		printTheBooks(srishti);
		
		System.out.println("books of the c_publishers\n");
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
