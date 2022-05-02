import java.util.*;
public class Producator extends Thread{
    private Random r = new Random();
    public Producator(String nume){
        super(nume);
    }
    @Override
    public void run(){
        try{
            while(true){
                synchronized(ExArhitecturaProducatorConsumator.list){
                    //monitor=lista, deoarece e vazuta de toti
                    //un singur fir de executie poate sa intre pe synchronized la un moment dat
                if(ExArhitecturaProducatorConsumator.list.size()<20){
                    int x = r.nextInt();
                    ExArhitecturaProducatorConsumator.list.add(x);
                    ExArhitecturaProducatorConsumator.list.notifyAll();//producatorul anunta consumatorii ca au fost adaugate elem in lista
                    //ii scot din asteptare
                    System.out.println("A fost adaugat un element"+x);
                }else{
                    ExArhitecturaProducatorConsumator.list.wait();//producatorul asteapta ca un consumator sa elimine elemente
                }
            }}
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
