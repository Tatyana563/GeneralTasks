package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a regular expression which matches a text line if this text line
// contains either the word "Joe" or the word "Jim" or both.
public class MatcherExample9 {
    public static void main(String[] args) {
        String s = "88888joeooplkjjim";
        String s1 = "123-4567";
        String s2 = "apple lemon orange lemon";
        System.out.println(s.matches(".*(jim|joe).*"));
        //phone number
        System.out.println(s1.matches("\\d\\d\\d(-|\\s)?\\d\\d\\d\\d"));
        //Remuve duplicates
        //for one duplicate see below
        String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        //String pattern = "\\b(\\w+)(\\b\\W+\\1\\b)*";
        //String pattern = "\\b(\\w+)(?:\\W+\\1\\b)+";

        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
//\b       match a word boundary
//[a-z]+   match a word with one or more characters;
//         the parentheses capture the word as a group
//\b       match a word boundary
//(?:      indicates a non-capturing group (which starts here)
//\s+      match one or more white space characters
//\1       is a back reference to the first (captured) group;
//         so the word is repeated here
//\b       match a word boundary
//)+       indicates the end of the non-capturing group and
//         allows it to occur one or more times
        String input = "lemon lemon your string string lemon leMon";
        Matcher m = r.matcher(input);
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }
        System.out.println(input);

        //. Finding elements which start in a new line
        String s4 =
                    "apple lemon" +
                "orange" +
                "pineapple";

        System.out.println(s4.matches("(\\n\\s*)title"));
    }
}
