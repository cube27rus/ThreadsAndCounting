import org.json.JSONException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) {
        try {
            //читаем json из файла
            String jsonString = JSONmachine.readFile("./src/main/Threads.json", StandardCharsets.UTF_8);
            //читаем кол-во трэдов
            int threads =JSONmachine.getThreads(jsonString);
            //читаем конечное значение
            final int toValue = JSONmachine.getValue(jsonString);
            //создаем новые трэды и запускаем их
            for (int i = 0; i < threads; i++) {
                    new ThreadCountingV2(toValue).start();
            }
        } catch (IOException  | JSONException e) {
            e.printStackTrace();
        }
    }
}
