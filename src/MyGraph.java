import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<V> {
    private Map<Vertex<V>, List<Vertex<V>>> map = new HashMap<>();
    public void addVertex(V data) {
        Vertex<V> vertex = new Vertex<>(data);
    }
}
