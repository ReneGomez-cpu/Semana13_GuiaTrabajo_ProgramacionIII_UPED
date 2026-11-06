import java.util.ArrayList;
import java.util.List;
public class Carrito {
    private final List<String> productos = new ArrayList<>();
    public void agregar(String producto) { if (producto == null || producto.isBlank()) throw new IllegalArgumentException("Producto inválido"); productos.add(producto); }
    public int cantidad() { return productos.size(); }
}
