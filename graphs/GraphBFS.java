package graphs;

import java.util.*;

public class GraphBFS {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            // Traverse neighbors
            for (int neighbor : graph.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create empty lists for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);

        bfs(graph, 1);
    }
}
