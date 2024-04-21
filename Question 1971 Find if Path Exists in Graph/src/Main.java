public class Main {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0) return true;
        boolean[] visited = new boolean[n];
        boolean flag = true;
        visited[source] = true;
        while(flag){
            flag = false;
            for(int[] edge : edges){
                if(visited[edge[0]] != visited[edge[1]]){
                    visited[edge[0]] = true;
                    visited[edge[1]] = true;
                    flag = true;
                }
                if(visited[destination]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 3, source = 0, destination = 2;
        int[][] edges = {{0,1},{1,2},{2,0}};
        System.out.println(validPath(n,edges,source,destination));
    }
}