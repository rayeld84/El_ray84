import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hvor mange byer skal registreres?");
        Scanner scanner = new Scanner (System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());

        String [] cityNames = new String [numberOfCities];
        int [] cityInhabitants = new int [numberOfCities];


        for (int counter = 0; counter < numberOfCities; counter++) {
            int cityNumber = counter + 1;

            System.out.println("Navn på by ");
            String cityName = scanner.nextLine();
            cityNames[counter] = cityName;
            System.out.println("Antall innbyggere ");
            int cityInhabitantsScanner = Integer.parseInt(scanner.nextLine());
            cityInhabitants[counter] = cityInhabitantsScanner;

        }
        for (int counter = 0; counter < numberOfCities; counter++) {
            System.out.print(counter +1);
            System.out.print(cityNames[counter]);
            System.out.println(cityInhabitants[counter]);
        }

    }

}
