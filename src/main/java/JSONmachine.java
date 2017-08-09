import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Класс дает возможности читать из файла/создавать json,
 * а также его парсинг.
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
    //прочитать строку(json) из файла
    public static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
