public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();


////      BOK
//        System.out.println();
//        book1.setTitle("Hvordan lykkes på Tinder");
//        book1.setAuthor("Raymond"); ;
//        book1.setPrice(999);
//
//        book2.setTitle("Jag er Zlatan");
//        book2.setAuthor("Zlatan");
//        book2.setPrice(99);
//
//        book1.printBookDetails();
//        System.out.println();
//        book2.printBookDetails();
//        System.out.println();
//
//
////      FILM
//        movie1.setTitle("The Dark Knight Triology");
//        movie1.setGenre(MovieGenre.ACTION);
//        movie1.setPrice(499);
//
//        movie2.setTitle("Løvenes konge");
//        movie2.setGenre(MovieGenre.DRAMA);
//        movie2.setPrice(199);
//
//        movie1.printMovieDetails();
//        System.out.println();
//        movie2.printMovieDetails();
//

//      BOK ARRAY
        System.out.println();
        Book[] bøker = new Book[2];
        bøker[0] = new Book();
        bøker[0].setTitle("Lord of The Rings ");
        bøker[0].setAuthor("J.R.R Tolkien");
        bøker[0].setPrice(400);

        bøker[1] = new Book();
        bøker[1].setTitle("Pondus");
        bøker[1].setAuthor("Frode Øverli");
        bøker[1].setPrice(39);

        for (int i = 0; i < bøker.length; i++) {
            bøker[i].printBookDetails();
            System.out.println();
        }

        System.out.println();
        Movie[] film = new Movie[2];
        film[0] = new Movie();
        film[0].setTitle(" Dumb and Dumber ");
        film[0].setGenre(MovieGenre.COMEDY);
        film[0].setPrice(79);

        film[1] = new Movie();
        film[1].setTitle("The Shawshank redemption");
        film[1].setGenre(MovieGenre.DRAMA);
        film[1].setPrice(89);

        for (int i = 0; i < film.length; i++) {
            film[i].printMovieDetails();
            System.out.println();

        }
    }

}
