package DateAndTime;

import java.time.*;
import java.util.Set;

public class dateAndTimePractice {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDateTime ld=LocalDateTime.now();
        System.out.println(date);
        System.out.println(ld);
        System.out.println(LocalTime.now());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        LocalTime lt =LocalTime.now();
        System.out.println(lt.getNano());

        System.out.println(ld.plusMonths(6));



        LocalDate birthday= LocalDate.of(1995,11,20);
        LocalDate today= LocalDate.now();
        Period p= Period.between(birthday,today);
        System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays()+" "+p.getChronology());

        Set<String> zidset=  ZoneId.getAvailableZoneIds();
        System.out.println(zidset);
    }
}
