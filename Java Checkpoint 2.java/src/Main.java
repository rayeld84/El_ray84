import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //LivingRoom 3 5 & Kitchen 2 3 & Bedroom 3 4
        System.out.println("Enter rooms in the apartment: ");
        Scanner scanner = new Scanner(System.in);
        String input = "LivingRoom 3 5 & Kitchen 2 3 & Bedroom 3 4";scanner.nextLine();
        System.out.println(input);

        String[] roomsStrings = input.split("&");

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < roomsStrings.length; i++) {
            String roomStr = roomsStrings[i].trim();
            System.out.println(roomStr);

            String[] roomStrings = roomStr.split(" ");

            String name = roomStrings[0];
            int width = Integer.parseInt(roomStrings[1]);
            int length = Integer.parseInt(roomStrings[2]);

            System.out.println(name + width + length);

            // Lag en konstruktør på rom

            Room room = new Room(name, length width);
            room.add(room);

        }

        for (room room : rooms) {
            room.printDetails();
        }

    }
    class Room {
        String name;
        int width;
        int length;


        public Room(String name, int width, int length) {
            this.name = name;
            this.width = width;
            this.length = length;
        }
    }



}

//        String [] room = new String [numberOfRooms];
//        int [] roomSize = new int [numberOfRooms];

//        System.out.println();
//        Room[] room = new Room[2];
//        room[0] = new Room("LivingRoom" + 3 + 5 );
//        room[1] = new Room("Kitchen" + 2 + 3);
//        room[2] = new Room("Bedroom" + 3 + 5);
//
//