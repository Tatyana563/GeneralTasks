package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample2 {
    public static void main(String[] args) {
        String text = "This is a text for testing";
        String patternString = "ThiS iS";
        //Matching the regular expression against the beginning of the text
        // (lookingAt()) will return true.
        //
        //Matching the regular expression against the whole text
        // (matches()) will return false, because the text has more characters
        // than the regular expression.
        Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        System.out.println("LookingAt:"+matcher.lookingAt());
        System.out.println("matches:"+matcher.matches());
    }
}
