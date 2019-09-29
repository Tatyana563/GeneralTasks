package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample4 {
    public static void main(String[] args) {
        String text = "John writes about this, and John Doe writes about that," +
                " and John Wayne writes about everything.";
        // The . means "any character". The + means "one or more times",
        // and relates to the . (any character, one or more times).
        // The ? means "match as small a number of characters as possible".
        String patternString = "(John)(.+?) ";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
while(matcher.find()){
            System.out.println(matcher.group(1)+matcher.group(2));
        }
    }
}
