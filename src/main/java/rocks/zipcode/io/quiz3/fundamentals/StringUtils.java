package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String answer = str.replace(str.charAt(indexToCapitalize), Character.toUpperCase(str.charAt(indexToCapitalize)));
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor &&
                baseString.charAt(indexOfString) == Character.toLowerCase(characterToCheckFor) ||
                baseString.charAt(indexOfString) == Character.toUpperCase(characterToCheckFor)){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
