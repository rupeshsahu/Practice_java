package updatedatesinhtml;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {
      DatesGeneratetor datesGeneratetor=new DatesGeneratetor();
        System.out.println(datesGeneratetor.plusThreeMonthAndLastDateOfMonth("05/15/2023"));
    }
}
