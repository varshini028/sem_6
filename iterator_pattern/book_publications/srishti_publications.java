package books_publlications;
import java.util.ArrayList;

	public class srishti_publications implements container{
		final ArrayList<books_info> booklist;

		public srishti_publications() {
			booklist = new ArrayList<>();

			addbook(createNewbook("The Imperfect", "Prasoon", 2017));
			addbook(createNewbook("The One From The Stars", "Keshav Anand", 2017));
			addbook(createNewbook("A Silent Promise", "Namrata Gupta", 2015));
		}

		private boolean addbook(books_info book) {
			boolean isItemSuccessfullyAdded = false;
			
			if( book != null ){
				booklist.add( book );
				isItemSuccessfullyAdded = true;
			}		
			
			return isItemSuccessfullyAdded;
		}

		private books_info createNewbook(final String name, final String author, final int year) {
			books_info holdbook= null;
			if (name != null && name.trim().length() > 0 && author != null && author.trim().length() > 0 ) {
				holdbook = new books_info(name, author, year);
			}

			return holdbook;
		}
		
		public Iterator<books_info> createIterator( ){
			return new srishti_iterator(booklist);
		}		

	}
