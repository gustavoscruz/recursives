package recursives_1;

import javax.tools.StandardJavaFileManager;

public class Palindrome {

    public static boolean palindrome(String sentence, int tam) {
        if (tam == 0 || tam == 1) {
            return true;
        } else {
            if(sentence.charAt(sentence.length() - tam) == sentence.charAt(tam - 1)){
                return palindrome(sentence, tam - 1);
            }
            else{
                return false;
            }
        }
    }

}
