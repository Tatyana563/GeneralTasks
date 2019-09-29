package lesson.Strings;

public class CommonTest {

    private final StringBuilder values;

    public CommonTest(String values) {
        this.values = new StringBuilder(values);
    }


    public CommonTest append(String s ) {
        values.append(s);
        //"sdsd"
        return this;
    }

    public static void main(String[] args) {
        String s = "Hell";
        String p = s+"o";
        String news = "Hell" + "o";
        String p2 = ";";
        StringBuilder sb = new StringBuilder(news);
        for (int i = 0; i < 10; i++) {
            sb.append(" ").append(i);
        }
        System.out.println(sb.toString());

        CommonTest ct = new CommonTest("start");
        ct.append("next").append("second");


    }
}
