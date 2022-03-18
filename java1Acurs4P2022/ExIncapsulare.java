public class ExIncapsulare {
    public static void main(String [] args) {
        Student s = new Student();
        //s.varsta = 20;
        s.setVarsta(20);
        System.out.println(s.getVarsta());
    }
}