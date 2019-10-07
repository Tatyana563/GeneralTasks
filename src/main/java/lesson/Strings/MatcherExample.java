package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//http://tutorials.jenkov.com/java-regex/matcher.html
public class MatcherExample {
    public static void main(String[] args) {
        String text = "This is the text to be searched";
        //*Occurs zero or more times
        //. Any character
        String patternString = ".*text.*";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

    }
}
