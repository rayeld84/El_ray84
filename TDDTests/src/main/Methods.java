public class Methods {

    public static int addThree(int n) {
        return n + 3;
    }

    public static int multiplyByTen(int n) {
        return (n * 10);
    }

    public static String maybeTrimText(String text, boolean trimWhitespace) {
        if (trimWhitespace == true) {
            return text.trim();
        } else {
            return text;
        }
    }

    public static String compareNumbers(int a, int b) {
        String returnString;
        if (a < b) {
            returnString = (a + " is less than " + b);
            return returnString;
        } else if (a == b) {
            returnString = (a + " is equal to " + b);
            return returnString;
        } else {
            returnString = (a + " is greater than " + b);
            return returnString;
        }
    }

}
