package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//x+ X, one or more times.
public class MatcherExample6 {
    private static final String regex = "T+";
    private static final String input = "abcdTatW";

    public static void main(String[] args) {
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(input);
       while(matcher.find()){
           System.out.println(matcher.start());
       }
    }
}
