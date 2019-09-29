package lesson.Strings;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        char ch1 = 5;
        char ch2 = '5';
        char ch3 = '\u0035';//16 юникод
        char ch4 = '0'+5;//смещение на 5 в табл юникод от 0
        char ch5 = (char) 53;// позиция в табл

        System.out.println("ch1 == ch2 " + (ch1 == ch2));
        System.out.println("ch2 == ch3 " + (ch2 == ch3));
        System.out.println("ch2 == ch4 = " + (ch2 == ch4));
        System.out.println("ch2 == ch5 = " + (ch2 == ch5));

        System.out.println("ch1:"+ch1);
        System.out.println("ch5:"+ch5);
        //массив изменяемый ссылается на 1 обьект
        char[] chars = {'1', '2'};
        char[] chars2 = chars;

        chars2[0] = '6';


        System.out.println("chars:"+ Arrays.toString(chars));
        System.out.println("chars2"+Arrays.toString(chars2));
// String хранит массив char после Java 8 массив байтов
        //     массив неизменяемый
        // s s2 разные изменение строки - создание нового обьекта
        //все классы-обертки над примитивными типами — неизменяемые.
        // Integer, Byte, Character, Short, Boolean, Long, Double, Float
       // java.lang.StackTraceElement
        // Data изменяемый обект
        // concat создает новый обект
        String s = "string 1";

        String s2 = s + null;

        String str2 = "";

        String str3 = s2 + str2;

        String str1 = s2.concat(str2);
        System.out.println("Attention");
        System.out.println("Compare str1 and str2"+str1==str2);

        Integer i1 = 10;
        Integer i2 = i1;
        i2 = 20;

        System.out.println(s);
        System.out.println(s2);
// + разные типы данных НО concat - only String, error with null
        String string1 = "1";
        String string2 = "1";//new String("1");
        String string2_2 = String.valueOf("1");// не создаст новый обект
        String string3 = "1" + string1;
        String string4 = "1" + "1";
        String string5 = "11";// не создаст новый обект на этапе компиляцииб есть такой уже
        //string4. НО на этапе комп ссылку читать не может (+ string1) string3!=string5.
        // string5 создан новым обектом

        String ss1 = "1";
        //ss1 = null;
//The method intern() creates an exact copy of a String object in the heap memory
// and stores it in the String constant pool.
        //intern() VM  создасть обект только если его нет в heap, или вернет ссылку
        //если сборщик мусора удалил строку intern ничего не найдет и потеряет время на поиски
        // - потеря производительности

        String ss2 = new String("1").intern();
        System.out.println("Comparing:");
        System.out.println("ss1 == ss2:"+(ss1 == ss2));

        System.out.println("string3 == string4:"+ (string3 == string4));
       System.out.println("string3 == string5:"+ (string3 == string5));
       System.out.println("string4 == string5:"+ (string4 == string5));
        System.out.println("string3 == string5:"+ (string3 == string5));
        System.out.println("string2==string2_2:"+(string2==string2_2));


    }
}
