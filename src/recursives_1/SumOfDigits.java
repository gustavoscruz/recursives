package recursives_1;

public class SumOfDigits {
    public static long sumOfDigits(long number){
        if(number <= 9){
            return number;
        }
        else {
            return sumOfDigits(number / 10) + number % 10;
        }

    }
}
