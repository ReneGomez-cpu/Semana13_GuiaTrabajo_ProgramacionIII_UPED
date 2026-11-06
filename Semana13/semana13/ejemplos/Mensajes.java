public class Mensajes {
    public static void main(String[] args) {
        try { throw new RuntimeException("mensaje de prueba"); }
        catch (RuntimeException e) { System.out.println(e.getMessage()); }
        finally { System.out.println("El bloque finally siempre se ejecuta"); }
    }
}
