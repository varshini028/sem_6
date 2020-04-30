package books_publlications;

public class books_info {


	final String name;
	final String author;
	final int year;	
	
	public books_info( final String name,final String author,final int year){
		this.name = name;
		this.author = author;
		this.year = year;

	}
	
	public String getName() {
		return name;
	}

	public String getauthor() {
		return author;
	}

	public int getyear() {
		return year;
	}
	
	
}
