public class ExJoin {
    public static void main(String [] args) {
        //DB1 -> 2 sec
        //DB2 -> 3 sec
        long timpStart = System.currentTimeMillis();
        /*preiaDateDinDB1();
        preiaDateDinDB2();*/
        
        Thread x = new Thread(()->preiaDateDinDB1());
        Thread y = new Thread(()->preiaDateDinDB2());
        x.start();
        y.start();
        
        try {
            x.join();//main asteapta dupa x
            y.join();//main asteapta dupa y
            //preluarea de informatie se face in paralel pe doua fire (x si y)
            //procesarea de date obtinute se va face aici pe main, doar 
            //dupa ce au terminat firele x si y
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        long timpFinal = System.currentTimeMillis();
        System.out.println(timpFinal - timpStart);//cat a durat executia celor doua metode
        
        
        //wait() -> met din Object
        //notify()/notifyAll() -> met din Object
    }
    
    public static void preiaDateDinDB1() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void preiaDateDinDB2() {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}