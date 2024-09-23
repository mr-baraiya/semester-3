//86. Write a program to apply DFS & BFS for a graph.
import java.util.*;

public class DS_LAB_86 {
    public static void main(String[] args) {
        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        System.out.println("Graph:\n" + g.toString());

        g.dfs(0);
        g.bfs(0);
    }
}

class Graph<T> {
    Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {
        if(!map.containsKey(source)) {
            addVertex(source);
        }
        if(!map.containsKey(destination)) {
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(bidirectional) {
            map.get(destination).add(source);
        }
    }

    public void dfs(T start) {
        Set<T> visited = new HashSet<>();
        dfsUtil(start, visited);
    }

    public void dfsUtil(T vertex, Set<T> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for(T adj: map.get(vertex)) {
            if(!visited.contains(adj)) {
                dfsUtil(adj, visited);
            }
        }
    }

    public void bfs(T vertex) {
        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()) {
            T temp = queue.poll();
            System.out.print(temp + " ");

            for(T adj: map.get(temp)) {
                if(!visited.contains(adj)) {
                    visited.add(adj);
                    queue.add(adj);
                }
            }
        }
    }

    @Override public String toString(){
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}