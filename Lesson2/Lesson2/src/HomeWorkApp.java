public class HomeWorkApp {
    public static void main(String[] args){
        System.out.println(inRange(9));
        isPositiveTxt(10);
        System.out.println(isPositive(-5));
        repeatString("Hi!", 4);
        System.out.println(isLeapYear(400));

    }

    public static boolean inRange(int value){
        return (value >= 10 && value <= 20);
    }

    public static void isPositiveTxt(int value){
        if (value >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isPositive(int value){
        return (value >= 0);
    }

    public static void repeatString(String txt, int value){
        for ( int i = 0; i < value; i++){
            System.out.println(txt);
        }
    }

    public static boolean isLeapYear(int year){
        if ( year % 100 == 0 && year != 400){
            return false;
        }
        return year % 4 == 0;
    }
}
