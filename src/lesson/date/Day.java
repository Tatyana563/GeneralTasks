package lesson.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

//Задание реализовать метод, который бы на входную строку вида "YYYY-MM-DD" отдавал
// также строкой название дня недели, к примеру метод на вход принимает
// строку "1500-02-20" в ответ отдает либо TUESDAY либо вторник
public class Day {
    public DayOfWeek findDay(LocalDateTime date){
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }

    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
      d1= d1.with(ChronoField.MONTH_OF_YEAR,9).
                with(ChronoField.DAY_OF_MONTH,12).with(ChronoField.YEAR,2019);
     Day day = new Day();
     day.findDay(d1);
    }

}
