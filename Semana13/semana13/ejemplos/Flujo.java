public class Flujo {
    public static void main(String[] args) {
        try { Propaga.ejecutar(); } catch (Exception e) { System.out.println("Atendida: " + e.getMessage()); }
    }
}
