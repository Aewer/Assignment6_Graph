import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph {
    public class Edge<Vertex> {
        private Vertex source;
        private Vertex dest;
        private Double weight;
        public Edge(Vertex source, Vertex dest, Double weight) {
            this.source = source;
            this.dest = dest;
            this. weight = weight;
        }
    }
    public class WeightedGraph<Vertex> {
        private Map<Vertex, List<Edge<Vertex>>> map = new HashMap<>();
    }
}
