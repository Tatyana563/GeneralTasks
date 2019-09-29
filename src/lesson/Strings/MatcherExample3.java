package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample3 {
    public static void main(String[] args) {
        String text = "This is the text which is to be searched " +
                "for occurrences of the word 'is";
        String patternString = "is";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()) {
            System.out.println("found: " + count + ":" +
                    matcher.start() + "-" + matcher.end());
        }
    }
}
