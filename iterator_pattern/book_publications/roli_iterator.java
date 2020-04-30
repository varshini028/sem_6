package books_publlications;



	public class roli_iterator implements Iterator<books_info>{
		private int currentPosition = 0;
		private final books_info[] roli;

		public roli_iterator( final books_info[] roli) {
			this.roli = roli;			
		}

		@Override
		public boolean hasNext() {
			boolean hasNext = false;
			if( currentPosition >= roli.length || roli[ currentPosition ] == null ){
				hasNext = false;
			} else {
				hasNext = true;
			}
			return hasNext;
		}

		@Override
		public books_info next() {
			books_info holdbook = this.roli[ this.currentPosition ];
			this.currentPosition++;
			return holdbook;
		}	
	}
