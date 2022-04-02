public class Sfera extends Forma3D {
    //trb sa suprascriu toate metodele abstracte mostenite fie direct fie indirect!!
    
    @Override
    public double getVolum() {
        return 8.7;
    }
    
    @Override
    public double getArie() {
        return 3.4;//nu e calculat dpv logic ci strict cu scop demostrativ
    }
}