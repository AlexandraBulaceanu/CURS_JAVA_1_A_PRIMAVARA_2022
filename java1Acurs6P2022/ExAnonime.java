public class ExAnonime {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Mihai",3000,8);
        Angajat a2 = new Angajat("Lorena",2000,3);
        Angajat a3 = new Angajat("Catalin",1000,1){
            @Override
            public double determinaSalariu() {
                this.salariu = 5000;
                return this.salariu;
            }
        };
        
        System.out.println("Mihai "+ a1.determinaSalariu());
        System.out.println("Lorena "+a2.determinaSalariu());
        System.out.println("Catalin "+a3.determinaSalariu());
        
        Calculator c1 = new Calculator(){
            @Override
            public void proceseaza() {
                
            }
        };
        
        Calculator c2 = () -> {};
    }
}