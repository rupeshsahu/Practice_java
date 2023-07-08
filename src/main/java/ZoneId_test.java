import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneId_test {
    public static void main(String[] args) {
        ZoneId zoneId =ZoneId.systemDefault();
        System.out.println(zoneId
        );
        System.out.println(zoneId.getRules());
        System.out.println(zoneId.getDisplayName(TextStyle.FULL,new Locale("Japanes")));
    }
}
