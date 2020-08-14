public class Main {

    public static void main(String[] args) {
//        Book book1 = new Book();
//        Book book2 = new Book();
//        Movie movie1 = new Movie();
//        Movie movie2 = new Movie();
//

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
        bøker[0] = new Book("Lord of the rings", "J.R.R Tolkien", 400 );


        bøker[1] = new Book("Hvordan lykkes på Tinder", "Raymond", 999 );


        for (int i = 0; i < bøker.length; i++) {
            bøker[i].printBookDetails();
            System.out.println();
        }

        System.out.println();
        Movie[] film = new Movie[2];
        film[0] = new Movie("The Dark Knight", MovieGenre.ACTION, 499, "Christopher Nolan");

        film[1] = new Movie("The Shawshank redemption", MovieGenre.DRAMA, 199, "Frank Darabont");


        for (int i = 0; i < film.length; i++) {
            film[i].printMovieDetails();
            System.out.println();

        }
    }

}
