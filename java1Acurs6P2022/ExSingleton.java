public class ExSingleton {
    public static void main(String [] args) {
        //Conexiune con = new Conexiune();
        Conexiune con = Conexiune.getInstance();
        con.nume = "Oracle";
        Conexiune con1 = Conexiune.getInstance();
        System.out.println(con1.nume);
    }
}