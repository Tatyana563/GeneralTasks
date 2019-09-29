package lesson.Strings;

import java.util.stream.IntStream;
//StringBuilder is used with frequent concastination of lines, for ex in a loop
// (for:each) to avoid out of memory
// You can use
//The java.lang.System.gc() method runs the garbage collector.
// Calling this suggests that the Java Virtual Machine expend effort toward
// recycling unused objects in order to make the memory they currently occupy
// available for quick reuse.
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.append("string");
        System.out.println(sb.capacity());//now (34*2)+2=70
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        IntStream stream = sb.codePoints();
        System.out.println("ASCII Values are: ");
        stream.forEach(w-> System.out.println(w));
        // charPointAt() method returns the “unicode number”
        // of the character at that index.
        System.out.println(sb.codePointBefore(1));
        //codePointCount - This method returns the number of Unicode code points
        // in the specified
        // text range of this sequence.
        System.out.println(sb.codePointCount(0,4));
        System.out.println(sb.delete(0,4));
        System.out.println(sb.capacity());
        sb.ensureCapacity(200);
        System.out.println(sb.capacity());
        char ch[] = new char[5];
        sb.getChars(0,5,ch,0);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        StringBuilder sb2 = new StringBuilder("Hello World");

        sb2.insert(1,true);
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("apple, lemon, orange");
        sb3.replace(0,5,new String("melon"));
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);
        sb3.setCharAt(2,'Q');
        System.out.println(sb3);
        System.out.println(sb3.length());
        sb3.setLength(100);
        System.out.println(sb3.length());
        //CharSequence это интерфейс со всеми вытекающими.
        // Под капотом может быть
        // CharBuffer, Segment, String, StringBuffer, StringBuilder.
        // Или собственная реализация.
        CharSequence str = sb3.subSequence(0,5);
        System.out.println(str);
        String string = sb3.substring(0,5);
        System.out.println(string);
StringBuilder b= new StringBuilder(
        "StringBuilder trimToSize() method in Java with Examples");
        System.out.println("capacity before trimming:"+b.capacity());
        b.trimToSize();
        System.out.println("Capacity after trimming"+b.capacity());





    }
}

