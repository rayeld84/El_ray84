public class Book implements Product{

    protected long productID;
    protected int price;

    private String title;
    private String author;
//    private int price;


    public Book (String title, String author, int price, long productID){
//        super (productID, price);
        this.title = title;
        this.author = author;
        this.price = price;
        this.productID = productID;
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Tittel: " + title + " Forfatter: " + author + " Pris: " + price + " ProductID: " + productID;
    }


//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//    public void setPrice(int price) {
//        this.price = price;

//    }


//        super.printDetails();
//        System.out.println();
//        System.out.println("Tittel: " + title);
//        System.out.println("Forfatter: " + author);
//        System.out.println("Pris: " + price);

}
