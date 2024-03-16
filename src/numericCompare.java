import java.util.Comparator;

public class numericCompare implements Comparator<Book> {
    
    @Override
    public int compare(Book b1, Book b2){

        return b1.getPages() - b2.getPages();

    }


}