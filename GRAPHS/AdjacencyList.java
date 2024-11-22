import java.util.*;

public class AdjacencyList {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];
        // Array me har iindex pr Arraylist ko initialise kr rhe hai kuki phkle se wo
        // null hota hai
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // finding the neighbours of the vertex

        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest);

        }

    }

}
