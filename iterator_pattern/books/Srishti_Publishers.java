
package books;

import java.util.Hashtable;

import java.util.Iterator;

public class Srishti_Publishers implements BookIterator{

    Hashtable<Integer, BookInfo> books = new Hashtable<Integer, BookInfo>();
    int hashKey = 0;

    public Srishti_Publishers() {

        addBook("The Imperfect", "Prasoon", 2017);
        addBook("The One From The Stars", "Keshav Anand", 2017);
        addBook("A Silent Promise", "Namrata Gupta", 2015);

    }

    public void addBook(String BookName, String AuthorName, int yearReleased){

        BookInfo bookInfo = new BookInfo(BookName, AuthorName, yearReleased);

        bestSongs.put(hashKey, bookInfo);

        hashKey++;

    }

    public Iterator createIterator() {
        return books.values().iterator();

    }

}


