public class Student {
    private String nume;
    private int varsta;
    private boolean integralist;
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        if(nume != null) {
            this.nume = nume;
        }
    }
    
    public boolean isIntegralist() {
        return this.integralist;
    }
    
    public void setIntegralist(boolean integralist) {
        this.integralist = integralist;
    }
    
    public int getVarsta() {
        return this.varsta;
    }
    
    public void setVarsta(int varsta)
    {
        if(varsta > 18)
            this.varsta = varsta;
        else
            System.out.println("Eroare: s-a pasat un argument ilegal in metoda setVarsta(1) a clasei");
    }
    
    //SA avem caracteristicile de la incapsulare - setteri
    //consrt pt toate atributele -> sa le initializeze
    
}