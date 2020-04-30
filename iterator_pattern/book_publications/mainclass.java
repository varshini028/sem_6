package books_publlications;



public class mainclass {

	public static void main(String[] args) {
		roli_publications roli = new roli_publications();
		srishti_publications srishti = new srishti_publications();

		service bk = new service( roli,srishti);
		bk.printMenu();
		
	}

}
