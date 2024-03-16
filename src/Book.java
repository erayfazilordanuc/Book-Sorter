public class Book {

    String Name;
    int Pages;
    String Author;
    int Release;

    public Book(String Name, int Pages, String Author, int Release){

        this.Name = Name;
        this.Pages = Pages;
        this.Author = Author;
        this.Release = Release;

    }

    public void allInfo(){

        System.out.println("\nİsim : " + getName() + "\nSayfa sayısı :  " + getPages() + "\nYazar : " + getAuthor() + "\nYayınlanma tarihi : " + getRelease());

    }

    public void allInfoHorizontal(){

        System.out.println("İsim : " + getName() + " / Sayfa sayısı : " + getPages() + " / Yazar : " + getAuthor() + " / Yayınlanma tarihi : " + getRelease());

    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPages() {
        return this.Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getRelease() {
        return this.Release;
    }

    public void setRelease(int Release) {
        this.Release = Release;
    }

    

}