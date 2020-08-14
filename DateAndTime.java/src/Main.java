import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hvilket år er du født?");

        Scanner scanner = new Scanner(System.in);
        int fødselsår = scanner.nextInt();

        LocalDate nå = LocalDate.now();

        int årstallNå = nå.getYear();
        int alder = årstallNå - fødselsår;

        if (fødselsår > 99 ) {
            System.out.println(årstallNå - fødselsår);
        }

        else {
            fødselsår = fødselsår + 1900;
            System.out.println("Du er " + (årstallNå - fødselsår) + " år");
        }
    }
}
