public class CityRegistration {
    public static void main(String[] args) {

        String[] cityNames = {"1. Oslo ", "2. Trondheim ", "3. Bergen "};
        int[] cityInhabitans = {1019513, 186364, 257087};

        for (int counter = 0; counter < cityNames.length; counter++) {
            System.out.print(cityNames[counter]);

            int arrow = cityInhabitans[counter] / 50000;
            for (int y = 0; y < arrow; y++) {
                System.out.print("< ");

            }
            System.out.println(cityInhabitans[counter]);
        }
    }
}