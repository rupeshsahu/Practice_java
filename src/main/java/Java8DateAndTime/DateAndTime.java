package Java8DateAndTime;



import java.time.*;
import java.util.Set;

public class DateAndTime {

    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        System.out.println(ld);
        LocalTime lt =LocalTime.now();
        System.out.println(lt.getHour());
        System.out.println();

        LocalDate birthday=LocalDate.of(1995,11,20);
        Period p=Period.between(birthday,LocalDate.now());
        System.out.println(p.getYears()+" "+p.getDays()+" "+p.getMonths()+" "+birthday.getDayOfMonth());
        System.out.println(birthday.getDayOfMonth()+" "+birthday.getDayOfWeek()+" "+ birthday.toEpochDay());
        System.out.println(Year.of(2024).isLeap());
        Month m =Month.valueOf("JUNE");
        System.out.println(m.firstMonthOfQuarter());
        LocalDateTime ldt=LocalDateTime.now();
        ZoneId zi=ZoneId.systemDefault();
        System.out.println(zi);
        long epochSecounds=1624500000;
        Instant intt=Instant.ofEpochSecond(epochSecounds);
        LocalDateTime ldt1=LocalDateTime.ofInstant(intt,ZoneId.systemDefault());
        System.out.println("Day of year :"+ldt1.getDayOfYear()+" "+ldt1.getDayOfWeek()
        );

        System.out.println(ldt1.minusWeeks(1).toLocalTime());


        long currentEpochTime=LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(currentEpochTime);
        System.out.println(ZoneOffset.UTC);
        LocalDateTime myBirthday= LocalDateTime.of(1995,Month.NOVEMBER,20,9,30);
        LocalDate dateB=myBirthday.toLocalDate();
        System.out.println(myBirthday);
        System.out.println(dateB);
        System.out.println(myBirthday.plusYears(27).plusMonths(7));


        System.out.println(LocalDate.now()+"  "+LocalDate.now().minusWeeks(1));
        Period p1=Period.between(LocalDate.now(),LocalDate.now().minusWeeks(1));
        System.out.println(p1.getDays()

        );
        String str=new String(" rupesh");
        System.out.println(str.compareTo("Sahu"));


      //  System.out.println(LocalDateTime.ofInstant(Instant.ofEpochSecond(LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond()),ZoneId.systemDefault()));



    }
}
