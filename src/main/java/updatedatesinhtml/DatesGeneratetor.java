package updatedatesinhtml;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/*This utility will generate the Date for AV tx, to check expected dates.*/
public class DatesGeneratetor {
     DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy"); // this is commong format of date which we are expecting in the HTML report.

    //below method will add three month in the given date and then calculate the last Day/date of the month.
    public  String plusThreeMonthAndLastDateOfMonth(String inputDate){
        LocalDate modifiedDate=LocalDate.parse(inputDate,formatter).plusMonths(3).with(TemporalAdjusters.lastDayOfMonth());
        return modifiedDate.format(formatter);
    }

    //this method will generate current date and convert into the expected date format
    public  String currentDateGenerator(){
        LocalDate currentDate= LocalDate.now();
        return currentDate.format(formatter);

    }

    //this method will add 2 months then caluclate the last day of that month and then add 180 days on same.
    public String plusTwoMonthsThenLastDayThenOneEightyDays(String inputDate){
        LocalDate modifiedDate=LocalDate.parse(inputDate,formatter).plusMonths(2).with(TemporalAdjusters.lastDayOfMonth()).plusDays(180);
        return  modifiedDate.format(formatter);
    }

}
