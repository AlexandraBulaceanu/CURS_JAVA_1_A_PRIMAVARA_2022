public class Cilindru extends Cerc {
    double h;
    
    Cilindru() {
        super(3); // apelul catre constructorul clasei superioare!!! - prima instructiune din consrt
                  //este adaugat default de catre compilator - fara param = super()
        System.out.println("constructor cilindru");
    }
    //this() = apelul care un constructor din ac clasa(supraincarcat)
    
    // 4 mod de particularizare - modificarea comportamentului = suprascriere
    @Override
    public double arie() {
        //2*A + L*h
        return 2 * super.arie() + super.lungime() * this.h;
    }
    
    //clasa superioara = clasa parinte = clasa pe care o mostenesc = super
    //clasa inferioara = clasa copil = clasa din care mostenes / clasa ce mosteneste = this
    
    @Override
    public int nrPuncte() {
        return 10;
    }
}