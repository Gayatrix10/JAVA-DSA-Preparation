import java.util.*;

public class CycleDetectionGraph {
     static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // Create Graph
    static void createGraph(int v) {
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Directed Graph
    static void addEdge(int src, int dest) {
        graph.get(src).add(dest);
    }

    // BFS
    static void bfs(int src, int v) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int neighbour : graph.get(curr)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    // DFS
    static void dfs(int src, boolean[] visited) {
        visited[src] = true;
        System.out.print(src + " ");

        for (int neighbour : graph.get(src)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }

    // Connected Components DFS
    static void dfsTraverse(int src, boolean[] visited) {
        visited[src] = true;

        for (int neighbour : graph.get(src)) {
            if (!visited[neighbour]) {
                dfsTraverse(neighbour, visited);
            }
        }
    }

    // Count Components
    static int countConnectedComponents(int v) {
        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsTraverse(i, visited);
                count++;
            }
        }

        return count;
    }

    // Directed Cycle Detection Helper
    static boolean dfsCycle(int src,
                            boolean[] visited,
                            boolean[] recStack) {

        visited[src] = true;
        recStack[src] = true;

        for (int neighbour : graph.get(src)) {

            if (!visited[neighbour]) {

                if (dfsCycle(neighbour, visited, recStack)) {
                    return true;
                }

            } else if (recStack[neighbour]) {
                return true;
            }
        }

        recStack[src] = false;
        return false;
    }

    // Directed Cycle Detection (works for disconnected graph)
    static boolean isCyclicDirected(int v) {

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];

        for (int i = 0; i < v; i++) {

            if (!visited[i]) {

                if (dfsCycle(i, visited, recStack)) {
                    return true;
                }
            }
        }

        return false;
    }

    // All Paths with Sum
    static void allPathsWithSum(int src,
                                int dest,
                                boolean[] visited,
                                ArrayList<Integer> path,
                                int sum) {

        visited[src] = true;
        path.add(src);
        sum += src;

        if (src == dest) {
            System.out.println("Path = " + path +
                               " , Sum = " + sum);
        } else {

            for (int neighbour : graph.get(src)) {

                if (!visited[neighbour]) {
                    allPathsWithSum(neighbour,
                                    dest,
                                    visited,
                                    path,
                                    sum);
                }
            }
        }

        path.remove(path.size() - 1);
        visited[src] = false;
    }

    public static void main(String[] args) {

        int v = 7;

        createGraph(v);

        // Component 1
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 1); // cycle

        // Component 2
        addEdge(5, 6);

        System.out.println("Adjacency List:");
        System.out.println(graph);

        System.out.print("\nBFS: ");
        bfs(0, v);

        System.out.print("\nDFS: ");
        boolean[] visited = new boolean[v];
        dfs(0, visited);

        System.out.println("\n\nConnected Components = "
                + countConnectedComponents(v));

        System.out.println("Cycle Present = "
                + isCyclicDirected(v));

        System.out.println("\nAll Paths From 0 to 4:");

        allPathsWithSum(
                0,
                4,
                new boolean[v],
                new ArrayList<>(),
                0
        );
    }
}