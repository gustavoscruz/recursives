package recursives_1;

public class BiggestElementArray {

    public static int biggestElementArray(int[] array, int tam, int indice){
        if(tam == 0){
            return array[indice];
        }
        else{
            if(array[tam - 1] > array [indice]){
                return biggestElementArray(array, tam -1, tam -1);
            }
            else {
                return biggestElementArray(array, tam -1, indice);
            }

        }
    }
}
