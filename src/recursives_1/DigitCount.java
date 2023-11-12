package recursives_1;

public class DigitCount {

    public static int digitCount(long number){
        if(number <= 9){
            return 1;
        }
        else {
            return digitCount(number / 10) + 1;
        }
    }
}
