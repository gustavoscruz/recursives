package recursives_1;

public class Power {

    public static long power(long number, long exponent){
        if(exponent == 0){
            return 1;
        }
        else{
            return number * power(number, exponent - 1);
        }
    }
}
