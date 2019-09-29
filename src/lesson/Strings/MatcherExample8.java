package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//(?:X)	X, as a non-capturing group
public class MatcherExample8 {
    public static void main(String[] args) {
        showGroupInformation("pass(word)?", "password");
        //making the group non-capturing
        showGroupInformation("pass(?:word)", "password");
    }


    public static void showGroupInformation(String regex, String input) {

        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.matches());

        }
    }
}
