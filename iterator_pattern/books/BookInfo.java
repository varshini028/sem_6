
package books;

public class BookInfo {

	String BookName; 
	String AuthorName; 
	int yearReleased;
	public  BookInfo(String newBookName,String newAuthorName, int newyearReleased)
	{	BookName=newBookName;
		AuthorName=newAuthorName;
		yearReleased=newyearReleased;
	}
	public String getBookName(){ return BookName; }
	public String getAuthorName(){ return AuthorName; }
	public int getYearReleased(){ return yearReleased; }
	
	
}
