public class Caja {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        try { carrito.agregar("Libro"); carrito.agregar(""); }
        catch (IllegalArgumentException e) { System.out.println("Caja: " + e.getMessage()); }
        finally { System.out.println("Productos procesados: " + carrito.cantidad()); }
    }
}
