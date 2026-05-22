package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class UndirectedGraph{
    ArrayList<ArrayList<Integer>> graph;
    UndirectedGraph(int vertices){
        graph = new ArrayList<>();
        for(int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void printGraph() {
        for (int i = 0; i < graph.size(); i++) {

            System.out.print(i + " -> ");

            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    void bfs(int start){
        Queue<Integer> q =  new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        visited[start] = true;
        q.offer(start);

        while(!q.isEmpty()){
            int current  = q.poll();
            System.out.print(current + " ");
            for(int neighbour : graph.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        System.out.println();
    }

    void dfs(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");

        for(int neighbour : graph.get(start)){
            if(!visited[neighbour]){
                dfs(neighbour,visited);
            }
        }
    }

}

public class UndirectedGraphTraversal {
    public static void main(String[] args) {
        int vertices = 8;
        UndirectedGraph ug = new UndirectedGraph(vertices);
        ug.addEdge(1,2);
        ug.addEdge(1,3);
        ug.addEdge(3,4);
        ug.addEdge(3,6);
        ug.addEdge(6,7);
        ug.addEdge(7,5);
        ug.addEdge(2,5);

        ug.printGraph();
        System.out.println();
        ug.bfs(1);
        boolean[] visited = new boolean[vertices];
        ug.dfs(1,visited);

    }
}
