public class SizeThread implements Runnable{ 
    @Override
    public void run(){    
         try{ 
             while(true){
                 Thread.sleep(60000);
                 System.out.println(Comanda.getInstance().getPizza().size());
                }}
         catch(InterruptedException e){
               System.out.println(":)");
            }
        }
}