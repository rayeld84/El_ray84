public class Main {

    public static void main(String[] args) {
        whatsTheSituation(Day.SUITDAY);
    }
        public static void whatsTheSituation(Day day){

        switch (day) {
            case MONDAY:
                System.out.println("Uuugh!");
                break;
            case TUESDAY:
                System.out.println("TT Aaaah Yeeeaaahh!");
                break;
            case WEDNESDAY:
                System.out.println("We like Wednesday!");
                break;
            case THURSDAY:
                System.out.println("Almost there!");
                break;
            case FRIDAY:
                System.out.println("WHOOP WHOOP!");
                break;
            case LITTLE_SATURDAY:
                System.out.println("See you in town!");
                break;
            case CATURDAY:
                System.out.println(":3");
                break;
            case SATURDAY :
                System.out.println("See you at Brygg!");
                break;
            case SUNDAY :
                System.out.println("Netflix and chill");
                break;
            case SUITDAY:
                System.out.println("Haters gonna hate");
                break;
        }

    }
}
