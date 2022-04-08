public class SoldInsuficientException extends Exception {
    public SoldInsuficientException() {
        super("Nu exista bani suficienti! Va rugam introduceti alta suma!");
    }
}