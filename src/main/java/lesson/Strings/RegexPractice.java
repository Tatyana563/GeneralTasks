package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        String s1 = "d";
        //a-z&&[def]]" - d, e or f
        System.out.println(s1.matches("[a-z&&[def]]"));
        //[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
        String s2 = "a";
        System.out.println(s2.matches("[a-z&&[^bc]]"));
        //[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
        String s3 = "a";
        System.out.println(s3.matches("[a-z&&[^m-p]]"));
        //\p{Lower}	A lower-case alphabetic character: [a-z]
        String s4 = "d";
        System.out.println(s4.matches("\\p{Lower}"));
        //\p{Alpha}	An alphabetic character:[\p{Lower}\p{Upper}]
        String s5 = "j";
        System.out.println(s5.matches("[\\p{Lower}\\p{Upper}]"));
        //\p{Punct}	Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
        String s6 = "@";
        System.out.println(s6.matches("\\p{Punct}"));
        //\p{Space}	A whitespace character: [ \t\n\x0B\f\r]
        String s7 = " ";
        System.out.println(s7.matches("\\p{Space}"));
        //X+        One or More occurrences of X
        String s8 = "ttt";
        System.out.println(s8.matches("\\t+"));
        String s9 = "ttt";

        System.out.println(s9.matches("\\t{3}+"));

        //System.out.println(cardNumber.replaceAll("\\d(?=\\d{4})", "*"));
//(?<=foo)	Lookbehind	Asserts that what immediately precedes the current
// position in the string is foo
        String s10 = "a1";
        System.out.println(s10.matches(("\\d((?<=a))")));
        //(?!foo)	Negative Lookahead	Asserts that what immediately
        // follows the current position in the string is not foo
        String s11 = "C";
        System.out.println(s11.matches("\\d(?!A)"));
     //Replace all whitespace between a letter followed by
        // a point or a comma.
String s12 = "lemon .apple .";
        String pattern = "(\\w)(\\s+)([\\.,])";
        System.out.println(s12.replaceAll(pattern, "$1$3"));
        //Negative look ahead are defined via (?!pattern).
        // For example, the following will match "a" if "a"
        // is not followed by "b".
        String s13 = "appl";
        System.out.println(s13.matches("a(?!b).*"));
        //(?i) makes the regex case insensitive.
        String s14 = "Aakpl";
        System.out.println(s14.matches("(?i)a(?!b).*"));
// returns true if the string matches exactly "true" or "True"



    }
}
