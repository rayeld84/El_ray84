public class Movie implements Product {

    private long productID;
    private int price;
    private String title;
    private MovieGenre genre;
    private String director;

    @Override
    public void printDetails() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return " Tittel: " + title + " Regissør: " +director + " Sjanger: " + genre + " Pris: " + price + " Produkt ID: " + productID;



//        super.printDetails();
//        System.out.println("Tittel: " + title);
//        System.out.println("Sjanger: " + genre);
//        System.out.println("Pris: " + price);

    }

    public Movie (String title, MovieGenre genre, int price, String director, long productID) {
//        super (productID, price);
    this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
        this.productID = productID;
    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setGenre(MovieGenre genre) {
//        this.genre = genre;

//    }
//    public void setPrice(int price) {
//        this.price = price;

//    }
}
