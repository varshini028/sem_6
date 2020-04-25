package books;


public class BookMain {

	public static void main(String[] args){
		
		Roli_Books roli = new Roli_Books();
		publisher_b b = new publisher_b();
		publisher_c c = new publisher_c();
		
		BookService books = new BookService(roli, b, c);
		
		
		books.showTheBooks();
		
	}

}
