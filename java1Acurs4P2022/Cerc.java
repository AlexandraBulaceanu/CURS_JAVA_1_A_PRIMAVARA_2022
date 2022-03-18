public class Cerc extends Punct { //extends -> mosteneste = is A
    double raza;// 1 mod de particularizare -> adaugarea de atribut
    String z;// 3 mod de particularizare -> ascunderea campurilor = hiding fields
    
    Cerc() {
        System.out.println("constructor cerc");
        //this.z = 3;
        this.z = "mesaj";
        super.z = 3;
        this.raza = 5;
        //super.raza = 6;
        this.x = 4;
        super.x = 8;
    }
    
    Cerc(double raza) {
        this.raza = raza;
        System.out.println("constructor cerc");
    }
    
    
    public double arie() {
        return Math.PI * this.raza * this.raza; // 2 mod de particularizare -> adaugarea de comportament
    }
    
    public double lungime() {
        return 2 * Math.PI * this.raza;
    }
    
    int nrPuncte() {
        return 2*x + 3*y;
    }
}