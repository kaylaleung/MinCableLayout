
import java.util.*;

public class FindMST { 

        public Queue<Edge> mst = new Queue<Edge>();
        
        public FindMST(EdgeWeightedGraph G)
        {
            MinPQ<Edge> pq = new MinPQ<Edge>();
            for(Edge e: G.edges())
            {
                pq.insert(e);
            }
            
            UF uf = new UF(G.V());
            while(!pq.isEmpty() && mst.size() < G.V() - 1)
            {
                Edge e = pq.delMin();
                int v = e.either(), w = e.other(v);
                if(!uf.connected(v,w))
                {
                    uf.union(v,w);
                    mst.enqueue(e);
                }
            }
        }
}

/*OUTPUT
run:
MST Edges: 
13.0 | 1-5
14.0 | 41-43
15.0 | 2-3
15.0 | 24-29
15.0 | 5-7
15.0 | 17-32
15.0 | 18-32
15.0 | 3-8
15.0 | 3-14
15.0 | 43-47
15.0 | 46-48
16.0 | 14-21
16.0 | 8-9
17.0 | 0-6
18.0 | 23-28
18.0 | 1-6
20.0 | 4-5
20.0 | 26-31
20.0 | 33-49
20.0 | 34-42
20.0 | 7-17
20.0 | 18-21
20.0 | 39-46
20.0 | 40-45
21.0 | 11-45
21.0 | 25-31
22.0 | 10-12
22.0 | 12-14
23.0 | 14-19
23.0 | 41-45
24.0 | 42-44
25.0 | 24-25
25.0 | 27-34
25.0 | 28-35
25.0 | 15-20
25.0 | 33-38
25.0 | 34-41
25.0 | 17-23
25.0 | 36-39
25.0 | 37-38
25.0 | 7-16
25.0 | 33-39
25.0 | 19-25
28.0 | 10-13
28.0 | 13-15
28.0 | 17-22
28.0 | 40-46
30.0 | 25-30
30.0 | 28-34
Total Cable Length for MST: 1035
BUILD SUCCESSFUL (total time: 0 seconds)

*/