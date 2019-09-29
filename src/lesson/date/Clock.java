package lesson.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
//Реализовать метод, который будет для заданной таймзоны выводить правильное время,
// к примеру передаем в метод таймзону которая может задаваться
// строкой "Europe/Moscow", на выходе метод отдает время с правильным смещением
public class Clock {
    public void changeTime(){
        //Source TimeZone, z1;
        ZoneId fromTimeZone = ZoneId.of("Asia/Istanbul");
        //Target TimeZone
        ZoneId toTimeZone = ZoneId.of("Australia/Melbourne");
        //Current time
        LocalDateTime today = LocalDateTime.now();
        //Zoned time at source timezone

        //ZonedDateTime currentSourceTime = today.atZone(fromTimeZone);
        ZonedDateTime currentSourceTime = ZonedDateTime.now(fromTimeZone);
        //Zoned time at target timezone
        ZonedDateTime currentTargetTime = today.atZone(toTimeZone);

        ZonedDateTime currentChangedTime=
                currentSourceTime.withZoneSameInstant(toTimeZone);
        System.out.println(currentSourceTime);
        System.out.println(currentTargetTime);
        System.out.println(currentChangedTime);
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.changeTime();

    }
}
