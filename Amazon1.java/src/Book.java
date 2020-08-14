public class Book {

    private String title;
    private String author;
    private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void printBookDetails() {

        System.out.println("Tittel: " + title);
        System.out.println("Forfatter: " + author);
        System.out.println("Pris: " + price);

    }
}
