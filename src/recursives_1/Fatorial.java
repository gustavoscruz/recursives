package recursives_1;

public class Fatorial {
    public static long fatorial(long number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fatorial(number - 1);
        }
    }
}