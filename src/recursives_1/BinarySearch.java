package recursives_1;

public class BinarySearch {

    public static long binarySearch(int[] array, int key, int begin, int end){

        if(begin <= end){
            int m = (begin + end) / 2;
            if(array[m] == key){
                return m;
            }
            if(key < array[m]){
                return binarySearch(array, key, begin, m-1);
            }
            else{
                return binarySearch(array, key, m + 1, end);
            }
        }
        return -1;

    }
}
