/**
 * Создает новый трэд, считает до значения, переданного в конструкторе.
 */
public class ThreadCounting implements Runnable{

    //конечное значение, до которого отсчитывать
    private int toValue =0;

    public ThreadCounting(int toValue){
        this.toValue=toValue;
    }

    // счет до value
    private void count(){
        for(int i=0;i<=toValue;i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        count();
    }
}
