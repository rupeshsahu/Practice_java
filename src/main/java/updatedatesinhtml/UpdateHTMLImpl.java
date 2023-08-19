package updatedatesinhtml;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateHTMLImpl{
   /* public static void main(String[] args) {
        UpdateHTMLImpl updateHTML=new UpdateHTMLImpl();
        updateHTML.updateDatesBatch("06/15/2023","C:\\perforce\\IDQ_Automation\\HTml\\inputFile.html");

    } created this main class for testing purpose*/

    public static void updateHTMLDate(String filePath, String newDate, int leftPixel, int topPixel) throws IOException {
        StringBuilder htmlContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line).append(System.lineSeparator());
            }
        }

        String regex = "<div style='position: absolute; left:(\\d+)px; top:(\\d+)px;'><nobr><span class='st0'>(\\d{2}/\\d{2}/\\d{4})</span></nobr></div>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(htmlContent);
        if (matcher.find()) {
            System.out.println("pattern matched");

            String replacedHtml = matcher.replaceFirst("<div style='position: absolute; left: (\\d+)px; top:(\\d+)px;'><nobr><span class='st0'>" +
                    newDate + "</span></nobr></div>");
            replacedHtml=replacedHtml+"##################################################added";

            // Write the modified content back to the file, removing trailing whitespace
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(replacedHtml.trim());
            }
        }
        else
            System.out.println("pattern didnt match");
    }





    public   void  updateDatesBatch(String givenDate,String filePath) throws IOException {
        /*
        Example of update dates in html:-
        #current Date:-
,400,445":07/17/2023
,260,705":07/17/2023
,400,520":07/17/2023
,620,790":07/17/2023
,620,750":07/17/2023
,620,705":07/17/2023

#given date
,570,445":05/15/2023
,570,520":05/15/2023

#plus three months then last date of the month
,330,705":08/31/2023
,690,750":08/31/2023
,690,790":08/31/2023

#plus two months then last date of the month then plus 180 days
,690,705":01/27/2024
        * */
        DatesGeneratetor datesGeneratetor=new DatesGeneratetor();
        String currentDate=datesGeneratetor.currentDateGenerator();
        String plusThreeMonthsThenLastDayOfMonth=datesGeneratetor.plusThreeMonthAndLastDateOfMonth(givenDate);
        String plusTwoMonthsThenLastDayThenPlusOneEightyDay=datesGeneratetor.plusTwoMonthsThenLastDayThenOneEightyDays(givenDate);
        // updating current date
        updateHTMLDate(filePath,currentDate,400,445);
        updateHTMLDate(filePath,currentDate,260,705);
        updateHTMLDate(filePath,currentDate,400,520);
        updateHTMLDate(filePath,currentDate,620,790);
        updateHTMLDate(filePath,currentDate,620,750);
        updateHTMLDate(filePath,currentDate,620,705);
        //updating given date
        updateHTMLDate(filePath,givenDate,570,445);

        updateHTMLDate(filePath,givenDate,570,520);
        //updating plus three months then last date of the month
        updateHTMLDate(filePath,plusThreeMonthsThenLastDayOfMonth,330,705);
        updateHTMLDate(filePath,plusThreeMonthsThenLastDayOfMonth,690,750);
        updateHTMLDate(filePath,plusThreeMonthsThenLastDayOfMonth,690,790);
        //updating plus two months then last date of the month then plus 180 days
        updateHTMLDate(filePath,plusTwoMonthsThenLastDayThenPlusOneEightyDay,690,705);

    }

    /*public static void main(String[] args) {
        updateDatesBatch(cassDate,baselinePath+"CASS_AV_MAP516.html");
    }*/
}
