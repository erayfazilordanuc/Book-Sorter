import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {

        Set<Book> alphabetics = new TreeSet<Book>(new alphabeticCompare());

        Set<Book> numerics = new TreeSet<Book>(new numericCompare());

        Set<Book> releasetics = new TreeSet<Book>(new releaseticCompare());

        Book seyahatname = new Book("Seyahatname", 6940, "Evliya Çelebi", 1848);
        Book kasagı = new Book("Kaşağı", 124, "Ömer Seyfettin", 1919);
        Book beyazKurt = new Book("Beyaz Kurt", 258, "Jack London", 1906);
        Book doguEkspresindeCinayet = new Book("Doğu Ekspresinde Cinayet", 256, "Agatha Cristie", 1934);
        Book kalplerinkesfi = new Book("Kalplerin Keşfi", 582, "İmam-ı Gazâlî", 1200);
    
        alphabetics.add(seyahatname);
        alphabetics.add(kasagı);
        alphabetics.add(beyazKurt);
        alphabetics.add(doguEkspresindeCinayet);
        alphabetics.add(kalplerinkesfi);

        numerics.add(seyahatname);
        numerics.add(kasagı);
        numerics.add(beyazKurt);
        numerics.add(doguEkspresindeCinayet);
        numerics.add(kalplerinkesfi);

        releasetics.add(seyahatname);
        releasetics.add(kasagı);
        releasetics.add(beyazKurt);
        releasetics.add(doguEkspresindeCinayet);
        releasetics.add(kalplerinkesfi);

        System.out.println("\nAlfabetik sıralama - A'dan Z'ye");

        for(Book b : alphabetics){

            b.allInfoHorizontal();

        }

        System.out.println("\nNumerik Sıralama - Kısadan uzuna doğru");

        for(Book b : numerics){

            b.allInfoHorizontal();

        }

        System.out.println("\nYayınlanma tarihine göre sıralama - Eskiden yeniye doğru");

        for(Book b : releasetics){

            b.allInfoHorizontal();

        }

        System.out.println();

    }

}
