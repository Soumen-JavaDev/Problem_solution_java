import java.util.ArrayList;

/**
 * GeraphImplement
 */
public class GeraphImplement {
   static class Edge{
        int src;
        int drc;
        public Edge(int s,int d){
            this.src=s;
            this.drc=d;
        }
    }public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=(new ArrayList<Edge>());
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        createGraph(graph);
        Edge e=graph[0].get(0);
        System.out.println(e.drc);
    }
}