package books_publlications;

public class roli_publications implements container {
	private int MAX_SIZE_ITEMS = 10;
	private int countItems = 0;
	private final books_info[] roli;

	public roli_publications() {
		roli = new books_info[ MAX_SIZE_ITEMS ];

		addbooks(createbook("Dining with the Nawabs", "Dining with the Nawabs", 2017));
		addbooks(createbook("Jodhpur Lancers", "M. S. Jodha", 2019));
		addbooks(createbook("No Margin For Error", "Ehud Yonay", 1993));
		
	}

	private boolean addbooks(books_info book) {
		boolean isItemSuccessfullyAdded = false;
		
		if( roli != null && countItems < MAX_SIZE_ITEMS ){
			roli[ countItems++ ] = book;
			isItemSuccessfullyAdded = true;
		}		      
		
		return isItemSuccessfullyAdded;
	}

	private books_info createbook(final String name, final String author, final int year) {
		  books_info holdbook = null;
			if (name != null && name.trim().length() > 0 && author != null && author.trim().length() > 0 ) {

		  holdbook = new books_info(name, author, year);}	
	    	return holdbook;
	}
	
	public Iterator<books_info> createIterator( ){
		return new roli_iterator(roli);
	}
}
