import org.json.JSONException;
import org.json.JSONObject;

public class JsonPractice {

    public static void main(String[] args) throws JSONException {
        String inputString = "{\\r\\n    \"completed\": \"true\"\\r\\n}";

        JSONObject jsonObject = new JSONObject(inputString);
        System.out.println(jsonObject);

    }
}
