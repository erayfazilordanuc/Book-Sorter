import java.util.Comparator;

public class releaseticCompare implements Comparator<Book> {
    
    @Override
    public int compare(Book b1, Book b2){

        return b1.getRelease() - b2.getRelease();

    }


}