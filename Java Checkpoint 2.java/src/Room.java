public class Room  {

    private String name;
    private int width;
    private int length;

    public Room(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;

    }

    public void printDetails() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public void printRoomDetails() {

        System.out.println("LivingRoom: " + name + width + length);
        System.out.println("Area: ");
        System.out.println("Ktichen: " + name + width + length);
        System.out.println("Area: ");
        System.out.println("Bedroom: " + name + width + length);
        System.out.println("Area: ");



    }
}








