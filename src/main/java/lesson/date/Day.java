package lesson.date;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

//Задание реализовать метод, который бы на входную строку вида "YYYY-MM-DD" отдавал
// также строкой название дня недели, к примеру метод на вход принимает
// строку "1500-02-20" в ответ отдает либо TUESDAY либо вторник
public class Day {
    public DayOfWeek findDay(LocalDateTime date){
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }

    public DayOfWeek getDayOfWeek(String date) {
        LocalDate ld = LocalDate.parse(date);
        //ld.with(TemporalAdjusters.firstDayOfYear())
        return ld.getDayOfWeek();
    }

    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
      d1= d1.with(ChronoField.MONTH_OF_YEAR,9).
                with(ChronoField.DAY_OF_MONTH,12).with(ChronoField.YEAR,2019);
     Day day = new Day();
     day.findDay(d1);
        System.out.println(day.getDayOfWeek("2019-09-15").getDisplayName(TextStyle.SHORT, Locale.getDefault()));

        Instant instant = Instant.now();
        System.out.println(ZonedDateTime.now()); // timestamp with timezone


    }

}
