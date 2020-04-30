package books_publlications;


public class service {
	private final srishti_publications srishti;
	private final roli_publications roli;
	
	public service( roli_publications roli,srishti_publications srishti) {
		this.roli = roli;
		this.srishti=srishti;
		
	}
	
	public void printMenu() {
		Iterator<books_info> roli_iterator = roli.createIterator();
		Iterator<books_info> srishti_iterator = srishti.createIterator();
		System.out.println("ROLI publications\n");
		printMenu( roli_iterator );
		System.out.println("\nSRISHTI publications\n");
		printMenu( srishti_iterator );
	}

	private void printMenu(Iterator<books_info> iterator ) {
		while (iterator.hasNext() ) {
			books_info book = iterator.next();
			System.out.print( book.getName() + ", ");
			System.out.print( book.getauthor() + " , ");
			System.out.println( book.getyear());
		}		
	}
}
