package books_publlications;

import java.util.ArrayList;



	public class srishti_iterator implements Iterator<books_info> {
		private final ArrayList<books_info> booklist;
		private int currentPosition = 0;
		
		public srishti_iterator( final ArrayList<books_info> booklist ) {
			this.booklist = booklist;
		}

		@Override
		public boolean hasNext() {
			boolean hasNext = false;
			if( currentPosition >= booklist.size() || booklist.get(currentPosition) == null ){
				hasNext = false;
			} else {
				hasNext = true;
			}
			return hasNext;
		}

		@Override
		public books_info next() {
			books_info holdMenuItem = booklist.get(currentPosition);
			this.currentPosition++;
			return holdMenuItem;
		}	
	}