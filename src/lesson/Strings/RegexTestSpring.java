package lesson.Strings;

public class RegexTestSpring {
    public static final String example =
            "This is a small example string whitch" +
            "I am going to use for pattern matching";

    public static void main(String[] args) {
        String [] splitString =
                example.split("\\s+");
        System.out.println(splitString.length);
        for(String item: splitString) {
            System.out.println(item);
        }
            System.out.println(example.replaceAll("\\s+","t"));

    }
}
