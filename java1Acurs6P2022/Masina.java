public class Masina {
    //Masina = clasa outer, clasa top-level
    int x; //coordonata -> unde ne aflam
    public class Motor {
        public void ruleaza() {
            ++x;
        }
    }
}