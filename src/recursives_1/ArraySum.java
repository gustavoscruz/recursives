package recursives_1;

public class ArraySum {

    public static long arraySum(int[] array, int tam){

        if(tam == 0){
            return 0;
        } else{
            return array[tam - 1] + arraySum(array, tam - 1);
        }

    }

}
