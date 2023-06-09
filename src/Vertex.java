import java.util.Map;

public class Vertex<V> {
    private V data;
    public V getData() {
        return data;
    }
    public void setData(V data) {
        this.data = data;
    }
    public Vertex(V data) {
        this.data = data;
    }
    public Map<Vertex<V>, Double> adjacentVertices;
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }
}