package graphs;

import java.util.*;

class Pair {
    int node;
    int parent;

    Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

public class DetectCycleUndirectedBFS {

    // BFS function to detect cycle
    static boolean bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(start, -1));
        visited[start] = true;

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            int node = current.node;
            int parent = current.parent;

            for (int neighbor : graph.get(node)) {

                // If not visited
                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(new Pair(neighbor, node));
                }

                // If visited and not parent -> cycle exists
                else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    // Detect cycle in disconnected graph also
    static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int vertices) {

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (bfs(i, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(1);
        graph.get(1).add(3);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean hasCycle = detectCycle(graph, vertices);

        System.out.println("Cycle Exists: " + hasCycle);
    }
}