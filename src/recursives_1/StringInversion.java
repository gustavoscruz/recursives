package recursives_1;

public class StringInversion {
    public static String stringInversion(String sentence, int tam){
        if(tam == 0){
            return "";
        }
        else {
            return sentence.charAt(tam - 1) + stringInversion(sentence, tam - 1);
        }
    }



}
