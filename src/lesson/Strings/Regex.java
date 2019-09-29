package lesson.Strings;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
public class Regex {


    public static void main(String[] args) {
        String st1 = "this is  text";
        String st2 = "a";
        String st3  ="bs";
        String st4 = "a";
        System.out.println(st1.matches("this is  text"));
        System.out.println(st1.matches("this\\s+is\\s+text"));
        System.out.println(new String("5.25").matches("^\\d+(\\.\\d+)?"));

        System.out.println(new String("av").matches("[abc][vz]"));
        //When a caret appears as the first character inside square brackets,
        // it negates the pattern. This pattern matches any character except
        // a or b or c.????

        Pattern pattern = Pattern.compile("([a-c])");
        Matcher matcher = pattern.matcher(" trattrtrt traa");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        /*System.out.println("[^d]"+new String("abc").matches("[^d]"));
        System.out.println("[a-d[r-w]]"+st3.matches("[a-d][r-w]"));
        System.out.println("[a-d[r-w]]"+st3.replaceAll("[a-d][r-w]", "1"));
        System.out.println("[\\D.]:"+st2.matches("[\\D.]"));
        System.out.println("");
        System.out.println("a|b:"+st4.matches("a|b"));*/

        String fio = "Иванов Семён Иванович";//"First Last Middle";
        String text = "Java is the best of the best java\n" +
                "Java is the best of the best java\n" +
                "Java is the best of the best java\n" +
                "Java is the best of the best java\n" +
                "Java is the best of the best java";

        System.out.println((int)'Ё');
        System.out.println((int)'А');
        System.out.println((int)'Я');
        //String regexp = "[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,15}";
        String regexp = "[А-ЯЁ]{1}[а-яё]{2,}\\s[А-ЯЁ]{1}[а-яё]{2,}\\s[А-ЯЁ]{1}[а-яё]{2,15}";

        String cardNumber = "12929";
        System.out.println(fio.matches(regexp));
        //^  - start text
        //$ - end text
        System.out.println(text.replaceAll("^[J|j]ava(\\s\\w{1,}){1,}\\sjava$", "Python"));
        System.out.println(text.replaceAll("^[J|j]ava(?=\\s\\w{1,})\\sjava$", "Python"));
        System.out.println(cardNumber.replaceAll("\\d(?=\\d{4})", "*"));

        System.out.println(" Java    str      sssss ".trim().replaceAll("\\s+", " "));

        String[] strs = " Java    str      sssss ".trim().replaceAll("\\s+", " ").split(" ");
        for(String item: strs) {
            System.out.println(item);
        }

        List<String> list = Arrays.asList(strs);

        System.out.println(String.join(", ", list));

        StringBuilder sb = new StringBuilder();
        System.gc();
    }
}
