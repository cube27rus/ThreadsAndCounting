import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Самодеятельность.
 * Посчитал нужным не читать из файла , а создавать JSON прямо
 * в коде для того, чтобы упростить тестирование.
 * Если необходимо, расширю возможности класса для считывания из файла. *
 */
public class JSONmachine {

    //создать новый json обьект
    public static JSONObject generetaJSON(int threads,int toValue) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Threads",String.valueOf(threads));
        jsonObject.put("toValue",String.valueOf(toValue));
        return jsonObject;
    }
    // прочитать кол-во нитей
    public static int getThreads(String stringJSON) throws JSONException {
        JSONObject object = new JSONObject(stringJSON); //sampleText is json that has been split by line
        return Integer.parseInt(object.getString("Threads"));
    }
    // прочитать конечное значение
    public static int getValue(String stringJSON) throws JSONException {
        JSONObject object = new JSONObject(stringJSON); //sampleText is json that has been split by line
        return Integer.parseInt(object.getString("toValue"));
    }
}
