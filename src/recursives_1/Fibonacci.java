package recursives_1;

public class Fibonacci {
    public static long fibonacci(long term){
        if(term == 1){
            return 0;
        } else if (term == 2) {
            return 1;
        } else{
            return fibonacci(term - 1) + fibonacci(term - 2);
        }
    }
}
