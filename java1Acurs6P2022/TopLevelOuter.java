public class TopLevelOuter {
    int x;
    private static int y;
    
    public class InnerNonStatica {
        //clasa TopLevelOuter este clasa outer(exterioara, cea care contine in int ei
        //cealalta clasa) pentru clasa InnerNonStatica
        //clasa interna = inner
        //cls outer != cls superioara
        int z;
        int x;
        
        public void met1() {
            this.x = 5;
            TopLevelOuter.this.x = 10; //outer.this.camp
        }
    }
    
    public static class InnerStatic {
        public void met2() {
            // x = 13; -> x este non-static(atribut) => nu este accesibil 
                        //din cadrul unui membru static
            y = 50; // pot sa accesez si zonele private ale clasei exterioare
        }
    }
}