public class Consumator extends Thread{
    public Consumator(String nume){
        super(nume);
    }
    @Override
    public void run(){
        try{
            while(true){
                synchronized(ExArhitecturaProducatorConsumator.list){
                    //pana nu eliberez lista, nu o mai poate modifica nimeni
                if(!ExArhitecturaProducatorConsumator.list.isEmpty()){
                    int x = ExArhitecturaProducatorConsumator.list.get(0);
                    ExArhitecturaProducatorConsumator.list.remove(0);
                    ExArhitecturaProducatorConsumator.list.notifyAll();//consumatorul anunta producatorul de micsorarea dimensiunii listei
                    System.out.println("A fost eliminat elementul "+x);
                    
                }else{
                    ExArhitecturaProducatorConsumator.list.wait();//consumatorul asteapta ca un producator sa adauge elemente in lista
                }
            }}
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
