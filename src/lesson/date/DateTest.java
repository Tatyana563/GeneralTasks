package lesson.date;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.*;

public class DateTest {

    public static void main(String[] args) {
        double d = 2.8;
        String s = "2019/10/10";
        String s2 = "19//10";
        String s3 = "YYYY-MM-DD";
// две переменные ссылаютс яна 1 обьект но примитивы неизменные - str1/str2
        List<Integer> libefore = new ArrayList<>();
        libefore.add(1);
        libefore.add(2);
        libefore.add(3);
        List<Integer> liAfter = libefore;
        liAfter.set(1, 10);
        System.out.println("list before"+libefore);
        System.out.println("list after"+liAfter);

        String str1 = "string";
        String str2 = str1;
        str2 = str2.concat("newString");
        System.out.println(str1);
        System.out.println(str2);

        Date date = new Date();

        System.out.println("date before change date 3= " + date);
        Date date2 = new Date(System.currentTimeMillis()+1000);
        //Use the following with copy not to spoil date changing date3
        Date date3 = (Date) date.clone();
       // Date date3 = date;
        Date date4 = date;
        date3.setTime(System.currentTimeMillis()+1000000);

        System.out.println("date after change date 3 = " + date);
        System.out.println("date3 = " + date3);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -2);

// LocalDate Time неизм тип данніхб если зайти в метод есть return new
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt;
        ldt2 = ldt2.plusWeeks(2);
        System.out.println("ldt"+ldt);
        System.out.println("ldt2"+ldt2);
        ldt = ldt.with(ChronoField.MONTH_OF_YEAR, 10)
                .with(ChronoField.DAY_OF_MONTH, 5);
        System.out.println(ldt);

        MonthDay md = MonthDay.now();
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.isLeapYear());

        System.out.println("MD = " + md);


        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(TimeZone.getDefault());
        Instant instant1 = new Date().toInstant();

        System.out.println(instant1);
        System.out.println("caleder.detTime"+calendar.getTime());


//        Date date3 = new Date(2019, 8, 10, 8, 0, 0);
//        System.out.println(date2);
//        System.out.println(date.equals(date2));


    }
}
