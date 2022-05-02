public class NrImpareThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<20;i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}