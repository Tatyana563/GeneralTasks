package lesson.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringOracle {
    public static void main(String[] args) {
        String str ="Experience is simply is the tname we give our mistakes ";
        String s1 = "apple";
        String s2 ="Apple";
        String s3="";
        String s6 ="is";
        String s7 = "a";
        String s8 = "5";
        String s9="#";
        String s10=" ";
        char[] data = {'a','b','c','d','e','f','g','h','i','j','k'};
        StringBuffer stringBuffer = new StringBuffer("apple");
        float x=3/4;
        System.out.println( str.charAt(1));
        //Returns the character (Unicode code point) at the specified index.
        System.out.println(str.codePointAt(1));
        // RESULT?
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.contentEquals(stringBuffer));
        System.out.println(s1.copyValueOf(data,5,3));
        System.out.println(s1.endsWith("ple"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
       // System.out.format(Locale.US, "%10.2f", piVal
        System.out.format(Locale.ENGLISH,"%f",x);//?????
        System.out.println(s1.getBytes());
    s1.getChars(0,3,data,2);
        System.out.println(data);
        System.out.println(s1.hashCode());
        System.out.println(  s1.indexOf('p'));
        //indexOf(String str, int fromIndex)
        //Returns the index within this string of the first occurrence of
        // the specified substring, starting at the specified index.??????
        System.out.println("Index of i in str after 10s character"+str.indexOf('i', 10));
        System.out.println(str.indexOf(s3,20));
        System.out.println(s3.isEmpty());
        //join(CharSequence delimiter, CharSequence... elements)
        String s4 = s1.join("<","one","two","three");
        System.out.println(s4);
        //join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        List<String> list = new ArrayList<>();
        list.add("shampoo");
        list.add("cream");
        list.add("lotion");
        String s5 = s1.join("|", list);
        System.out.println(s5);
        System.out.println( str.lastIndexOf("e"));
        //ервіе 20 єлементов. самый первsй с начала.index=15
        System.out.println(str.lastIndexOf('i',20));
        //count from left up to is in "mistake"
        System.out.println(str.lastIndexOf(s6));
        System.out.println(s7.matches("[abc]"));//a or b or c
        System.out.println(s8.matches("\\d"));
        System.out.println(s9.matches("\\W"));
        System.out.println(s10.matches("\\s"));
//public boolean regionMatches
// (boolean ignoreCase, int toffset, String other, int ooffset, int len)
        String str1 = "Hello, how are you";
        String str2 = "HOW";
        System.out.println(str1.regionMatches(true,7,str2,0,3));
        System.out.println(str1.replace('h','g'));
        System.out.println(str1.replace("Hello","Hi"));
        System.out.println(str1.replaceAll("[el]","0"));
        System.out.println(str1.replaceFirst("[e]","*"));
        String str3 = "Welcome-to-the-tutorial-1";
        System.out.println(str3.split("-",0));
        for(String item:str3.split("-",0))
            System.out.println(item);
        System.out.println(str3.startsWith("We"));
        System.out.println(str3.subSequence(0,3));
        System.out.println(str3.substring(3,5));
       char arr[] = str3.toCharArray();
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
        System.out.println(str3.toUpperCase());
        System.out.println(str1.toLowerCase());

String str4 = "  Keep calm and carry on   ";
        System.out.println(str4);
        System.out.println(str4.trim());
        //valueOf(boolean b)
        boolean bool = str4.contains("calm")&&str4.length()>5;
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(data));
        System.out.println(String.valueOf(10.23));
        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(data,0,3));




    }
}
