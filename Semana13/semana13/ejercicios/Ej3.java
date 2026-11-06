public class Ej3 { public static void main(String[] args) { try { Integer.parseInt("abc"); } catch (NumberFormatException e) { System.out.println("Número inválido"); } } }
