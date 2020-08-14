public class Movie {

    private String title;
    private MovieGenre genre;
    private int price;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printMovieDetails() {

        System.out.println("Tittel: " + title);
        System.out.println("Sjanger: " + genre);
        System.out.println("Pris: " + price);

    }
}
