// 85. Write a program to create a graph & implement the adjacency list

import java.util.*;

public class DS_LAB_85{
    public static void main(String args[]){
        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        System.out.println("Graph:\n" + g.toString());

        g.getVertexCount();

        g.getEdgesCount(true);

        g.hasEdge(3, 4);

        g.hasVertex(5);
        g.neighbours(1);
        System.out.println();

        //dfs traversal
        g.dfs(0);

        //bfs traversal
        g.bfs(0);
    }
}


class Graph<T> {

    // We use Hashmap to store the edges in the graph
    Map<T, List<T> > map = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source, T destination, boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    // This function gives the count of vertices
    public void getVertexCount()
    {
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has " + count + " edges.");
    }

    // This function gives whether
    // a vertex is present or not.
    public void hasVertex(T s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains " + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain " + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or
    // not.
    public void hasEdge(T s, T d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between " + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between " + s + " and " + d + ".");
        }
    }
  
      public void neighbours(T s)
    {
        if(!map.containsKey(s)) 
        return ;
        System.out.println("The neighbours of "+s+" are");
        for(T w:map.get(s))
         System.out.print(w+",");
    }

    // Prints the adjancency list of each vertex.
    @Override public String toString()
    {
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

    // This function implements DFS using a recursive approach
    public void dfs(T start) {
        Set<T> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    // Utility function for DFS
    public void dfsUtil(T vertex, Set<T> visited) {
        // Mark the node as visited
        visited.add(vertex);
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        for (T adj : map.get(vertex)) {
            if (!visited.contains(adj)) {
                dfsUtil(adj, visited);
            }
        }
    }

    public void bfs(T start) {
        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();
    
        // Start by adding the initial node to the queue
        visited.add(start);
        queue.add(start);
    
        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            // Remove the front of the queue for processing
            T vertex = queue.poll();
            System.out.print(vertex + " ");
    
            // Enqueue all unvisited adjacent nodes
            for (T adj : map.get(vertex)) {
                if (!visited.contains(adj)) {
                    visited.add(adj);
                    queue.add(adj);
                }
            }
        }
        System.out.println();
    }    
}
