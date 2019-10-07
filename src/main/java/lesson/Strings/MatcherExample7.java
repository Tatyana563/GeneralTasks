package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample7 {
    private static final String REGEX = "T{2,}";
    private static final String INPUT = "TTT";
    //BUT false if ""adTgTTj

    public static void main(String[] args) {
        // create a pattern
        Pattern pattern = Pattern.compile(REGEX);

        // get a matcher object
        Matcher matcher = pattern.matcher(INPUT);

        while (matcher.find()) {
            //Prints the start index of the match.
            System.out.println("Match String start(): " + matcher.matches());
            System.out.println("Match String start(): " + matcher.start());
        }
    }
}
