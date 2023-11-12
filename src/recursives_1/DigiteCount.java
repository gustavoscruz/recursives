package recursives_1;

public class DigiteCount {

    public static int digitCount(long number){
        if(number <= 9){
            return 1;
        }
        else {
            return digitCount(number / 10) + 1;
        }
    }
}
