
import java.util.ArrayList;

public class EdgeWeightedGraph
        {
            private int V;
            private int E;
            private ArrayList<Edge>[] adj;
            
            
            public EdgeWeightedGraph(int V)
            {
                this.V = V;
                this.E = 0;
                adj = (ArrayList<Edge>[]) new ArrayList[V];
                for(int v = 0; v < V; v++)
                {
                    adj[v] = new ArrayList<Edge>();
                }
            }
            
            public int V()
            {
                return V;
            }
            
            public ArrayList<Edge> edges()
            {
                ArrayList<Edge> b = new ArrayList<Edge>();
                for(int v = 0; v < V; v++)
                {
                    for(int i = 0; i < adj[v].size(); i++)
                    {
                        if((adj[v].get(i)).other(v) > v) b.add((adj[v].get(i)));
                    }     
                }
                return b;
            }
            
            public void addEdge(int v1, int v2, double weight)
            {
                Edge e = new Edge(v1, v2, weight);
                int v = e.either(), w = e.other(v);
                adj[v].add(e);
                adj[w].add(e);
                E++;
            }
        }