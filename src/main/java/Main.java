import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            //создаем новый json файл, передаем в него кол-во трэдов и конечное значение
            JSONObject jsonObject=JSONmachine.generetaJSON(7,15);
            //читаем кол-во трэдов
            int threads =JSONmachine.getThreads(jsonObject.toString());
            //читаем конечное значение
            int toValue = JSONmachine.getValue(jsonObject.toString());
            //пока i меньше threads, считаем до toValue в каждой нити
            for(int i=0;i<threads;i++){
                new Thread(new ThreadCounting(toValue)).start();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
