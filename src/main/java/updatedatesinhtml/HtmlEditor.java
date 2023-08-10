package updatedatesinhtml;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlEditor {

    public void htmlDateModifier(String cassDate) {
        String givenDate=cassDate;
        DatesGeneratetor datesGeneratetor=new DatesGeneratetor();
        String currentDate=datesGeneratetor.currentDateGenerator();
        String plusThreeMonthsThenLastDayOfMonth=datesGeneratetor.plusThreeMonthAndLastDateOfMonth(givenDate);
        String plusTwoMonthsThenLastDayThenPlusOneEightyDay=datesGeneratetor.plusTwoMonthsThenLastDayThenOneEightyDays(givenDate);
        // List of file paths to be edited
        List<String> filePaths = new ArrayList<>();
        filePaths.add("C:\\perforce\\IDQ_Automation\\HTml\\Target_actual\\CASS_5_16_3.html");
        filePaths.add("C:\\perforce\\IDQ_Automation\\HTml\\Target_actual\\CASS_516_ora_src.html");
        // Add more file paths as needed

        // updating current date
        List<PixelLocation> pixelLocations = new ArrayList<>();
        pixelLocations.add(new PixelLocation(400, 445, currentDate));
        pixelLocations.add(new PixelLocation(260, 705, currentDate));
        pixelLocations.add(new PixelLocation(400, 520, currentDate));
        pixelLocations.add(new PixelLocation(620, 790, currentDate));
        pixelLocations.add(new PixelLocation(620, 750, currentDate));
        pixelLocations.add(new PixelLocation(620, 705, currentDate));
        //updating given date

        pixelLocations.add(new PixelLocation(570, 445, givenDate));
        pixelLocations.add(new PixelLocation(570, 445, givenDate));

        //updating plus three months then last date of the month
        pixelLocations.add(new PixelLocation(330, 705, plusThreeMonthsThenLastDayOfMonth));
        pixelLocations.add(new PixelLocation(690, 750, plusThreeMonthsThenLastDayOfMonth));
        pixelLocations.add(new PixelLocation(690, 790, plusThreeMonthsThenLastDayOfMonth));


        //updating plus two months then last date of the month then plus 180 days
        pixelLocations.add(new PixelLocation(690, 705, plusTwoMonthsThenLastDayThenPlusOneEightyDay));

        try {
            editHtmlFiles(filePaths, pixelLocations);
            System.out.println("HTML files edited successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void editHtmlFiles(List<String> filePaths, List<PixelLocation> pixelLocations) throws IOException {
        for (String filePath : filePaths) {
            StringBuilder htmlContent = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    htmlContent.append(line).append(System.lineSeparator());
                }
            }

            for (PixelLocation location : pixelLocations) {
                String regex = "<div style='position: absolute; left: " + location.getLeftPixel() + "px; top:" + location.getTopPixel() + "px;'><nobr><span class='st0'>(\\d{2}/\\d{2}/\\d{4})</span></nobr></div>";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(htmlContent);

                if (matcher.find()) {
                    System.out.println("pattern matched now updating date in HTML file");
                    String replacedHtml = matcher.replaceFirst("<div style='position: absolute; left: " +
                            location.getLeftPixel() + "px; top:" + location.getTopPixel() + "px;'><nobr><span class='st0'>" +
                            location.getDate() + "</span></nobr></div>");

                    // Update the content for the next iteration
                    htmlContent = new StringBuilder(replacedHtml);
                }
                else
                    System.out.println("pattern didnt match please check in HTML file");
            }

            // Write the modified content back to the file, removing trailing whitespace
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(htmlContent.toString().trim());
            }
        }
    }

    static class PixelLocation {
        private int leftPixel;
        private int topPixel;
        private String date;

        public PixelLocation(int leftPixel, int topPixel, String date) {
            this.leftPixel = leftPixel;
            this.topPixel = topPixel;
            this.date = date;
        }

        public int getLeftPixel() {
            return leftPixel;
        }

        public int getTopPixel() {
            return topPixel;
        }

        public String getDate() {
            return date;
        }
    }
}
