public class Pedido {
    public static void main(String[] args) { registrar(); }
    static void registrar() { validar(); }
    static void validar() { calcularTotal(); }
    static void calcularTotal() { throw new IllegalArgumentException("Pedido sin productos"); }
}
