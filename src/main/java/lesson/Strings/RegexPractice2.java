package lesson.Strings;
//https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
public class RegexPractice2 {

    public static void main(String[] args) {
        String s1 = "448trueujo";
        String s2 = "ang";
        String s3 = "@apokkng";
        isTrueVersion2(s1);
        containsTrue(s1);
        isThreeLetters(s2);
        isNoNumberAtBeginning(s3);
    }

    // returns true if the string matches exactly "true" or "True"
    public static void isTrueVersion2(String s) {
        System.out.println(s.matches("[tT]rue"));

    }

    // returns true if the string contains exactly "true"
    public static void containsTrue(String s) {
        System.out.println(s.matches(".*true.*"));
    }

    // returns true if the string contains of three letters
    public static void isThreeLetters(String s) {
        System.out.println(s.matches("[a-zA-Z]{3}"));
    }
    public static void isNoNumberAtBeginning(String s)
    {
        System.out.println(s.matches("[^\\d].*"));
    }
}