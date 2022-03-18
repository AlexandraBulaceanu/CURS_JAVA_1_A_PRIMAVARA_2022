public class ExMostenire {
    public static void main(String [] args) {
        Cerc cerc = new Cerc(2);
        cerc.x = 2;
        cerc.y = 4;
        cerc.raza = 6;
        
        Cilindru cil = new Cilindru();
        
        System.out.println(cerc.arie());
    }
}