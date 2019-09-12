package lesson.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Реализовать метод, который будет для заданной таймзоны выводить
// правильное время, к примеру передаем в метод таймзону которая может
// задаваться строкой "Europe/Moscow", на выходе метод отдает время с
// правильным смещением
public class TimeZone {
    public static void main(String[] args) {
        // Get your Local Time Zone Where this Program is Running.
        TimeZone timezone = TimeZone.getDefault();

        // Get the Name of Time Zone
        String LocalTimeZoneDisplayName = timezone.getDisplayName();

        // Print the Name of Time Zone
        System.out.println(LocalTimeZoneDisplayName);
    }
}
    

