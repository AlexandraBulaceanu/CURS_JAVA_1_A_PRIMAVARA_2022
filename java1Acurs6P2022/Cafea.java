public enum Cafea {
    SMALL, MEDIUM, LARGE(300), EXTRA_LARGE;
   //0       1       2            3 
    
    private int cantitate;
    
    Cafea() {}
    Cafea(int cantitate) {
        this.cantitate = cantitate;
    }
    
    public void afiseazaCantitate() {
        System.out.println(cantitate);
    }
}