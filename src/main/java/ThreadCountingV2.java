/**
 * Запускает в потоке отсчет до заданного значения
 */
public class ThreadCountingV2 extends Thread{
    //текущее значение которое будем увеличивать
    static volatile Integer curentValue = 0;
    //до какого значения
    private  int finalValue;
    public ThreadCountingV2(int finalValue){
        this.finalValue=finalValue+1;
    }
    //если текущее значение меньше конечного, то увеличиваем текущее
    @Override
    public void run(){
        while(curentValue<finalValue){
            synchronized (curentValue){
                if(curentValue<finalValue) {
                    System.out.println(this.toString() + " incriment to value to " + curentValue);
                    curentValue++;
                }
            }
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){}
        }
    }




}
