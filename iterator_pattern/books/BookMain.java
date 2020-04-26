package books;


public class BookMain {

	public static void main(String[] args){
		
		Roli_Books roli = new Roli_Books();
		Srishti_Publishers srishti = new publisher_b();
		publisher_c c = new publisher_c();
		
		BookService books = new BookService(roli, srishti, c);
		
		
		books.showTheBooks();
		
	}

}
