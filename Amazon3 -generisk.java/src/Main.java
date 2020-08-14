import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        System.out.println(new Book ("Forskjellen på opp og ned", "Geniet", 1000));

//        BOOK GENERISK
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Hvordan lykkes på Tinder", "Raymond", 999, 777));
        bookList.add(new Book("Lord of The Rings", "J.R.R Tolkien", 199, 666));
        bookList.add(new ChildrensBook("Ole Brum", "Kristoffer Robin", 99, 879, "R"));

////        System.out.println(bookList);
//
//        for (int i = 0; i < bookList.size(); i++) {
//            bookList.get(i).printBookDetails();
//        }

//        MOVIE GENERISK
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Batman begins", MovieGenre.ACTION, 200, "Christopher Nolan", 999));
        movieList.add(new Movie("Superman returns", MovieGenre.ACTION, 200, "Bryan Singer", 888));

//
////        for (int i = 0; i < movieList.size(); i++) {
////            movieList.get(i).printMovieDetails();
//
////            System.out.println(movieList);
//
//        }

        List<Product> products = new ArrayList<>();
        products.addAll(movieList);
        products.addAll(bookList);

        System.out.println();
        for (Product product : products) {
            product.printDetails();
//            if (product instanceof Book) {
//                Book book = (Book) product;
//                book.printDetails();
//            } else if (product instanceof Movie) {
//                Movie movie = (Movie) product;
//                movie.printDetails();
//            }
            System.out.println();
        }
    }
}



