public class Validar {
    public static int edad(String texto) {
        try { int edad = Integer.parseInt(texto); if (edad < 0) throw new IllegalArgumentException("Edad negativa"); return edad; }
        catch (NumberFormatException e) { throw new IllegalArgumentException("La edad debe ser numérica", e); }
    }
    public static void main(String[] args) { System.out.println(edad("20")); }
}
