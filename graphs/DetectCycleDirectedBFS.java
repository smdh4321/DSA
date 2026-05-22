package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirectedBFS {

    static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int vertices) {

        int[] indegree = new int[vertices];

        // Calculate indegree
        for (int i = 0; i < vertices; i++) {

            for (int neighbor : graph.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes with indegree 0
        for (int i = 0; i < vertices; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            count++;

            for (int neighbor : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If all nodes are processed -> no cycle
        // Else cycle exists
        return count != vertices;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed edges
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);

        // Cycle edge
        graph.get(3).add(1);

        boolean hasCycle = detectCycle(graph, vertices);

        System.out.println("Cycle Exists: " + hasCycle);
    }
}