/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestFindMST {

    public static void main(String[] args)
    {
            
            EdgeWeightedGraph g = new EdgeWeightedGraph(51);
        
            g.addEdge(0, 1, 33);
            g.addEdge(0, 2, 30);
            g.addEdge(0, 6, 17);
            g.addEdge(0, 9, 25);
            
            g.addEdge(1, 4, 25);
            g.addEdge(1, 5, 13);
            g.addEdge(1, 6, 18);
            
            g.addEdge(2, 3, 15);
            g.addEdge(2, 9, 20);
            g.addEdge(2, 10, 35);
            g.addEdge(2, 12, 27);

            g.addEdge(3, 8, 15);
            g.addEdge(3, 9, 31);
            g.addEdge(3, 12, 23);
            g.addEdge(3, 14, 15);
            g.addEdge(3, 21, 20);
            
            g.addEdge(4, 5, 20);
            g.addEdge(4, 7, 31);
            g.addEdge(4, 16, 40);
            
            g.addEdge(5, 6, 20);
            g.addEdge(5, 8, 30);
            g.addEdge(5, 7, 15);
            
            g.addEdge(6, 8, 25);
            g.addEdge(6, 9, 21);
            
            g.addEdge(7, 8, 35);
            g.addEdge(7, 16, 25);
            g.addEdge(7, 17, 20);
            g.addEdge(7, 32, 30);
            
            g.addEdge(8, 9, 16);
            g.addEdge(8, 32, 32);
            g.addEdge(8, 21, 35);
            
            g.addEdge(10, 12, 22);
            g.addEdge(10, 13, 28);
            
            g.addEdge(11, 47, 33);
            g.addEdge(11, 43, 35);
            g.addEdge(11, 45, 21);
            g.addEdge(11, 48, 44);
            
            g.addEdge(12, 14, 22);
            g.addEdge(12, 15, 30);
            
            g.addEdge(13, 15, 28);
            g.addEdge(13, 20, 40);
            
            g.addEdge(14, 15, 36);
            g.addEdge(14, 19, 23);
            g.addEdge(14, 20, 35);
            g.addEdge(14, 21, 16);
            
            g.addEdge(15, 20, 25);
            
            g.addEdge(16, 17, 30);
            g.addEdge(16, 22, 35);
            g.addEdge(16, 27, 50);
            
            g.addEdge(17, 32, 15);
            g.addEdge(17, 22, 28);
            g.addEdge(17, 23, 25);
            g.addEdge(17, 28, 38);
            
            g.addEdge(18, 21, 20);
            g.addEdge(18, 32, 15);
            g.addEdge(18, 23, 30);
            g.addEdge(18, 29, 40);
            g.addEdge(18, 24, 30);
            
            g.addEdge(19, 20, 30);
            g.addEdge(19, 21, 30);
            g.addEdge(19, 24, 35);
            g.addEdge(19, 25, 25);
            g.addEdge(19, 26, 40);
            
            g.addEdge(20, 26, 30);
            
            g.addEdge(21, 24, 45);
            g.addEdge(21, 32, 26);
            
            g.addEdge(22, 27, 35);
            g.addEdge(22, 28, 30);
            
            g.addEdge(23, 28, 18);
            g.addEdge(23, 29, 32);
            g.addEdge(23, 32, 30);
            
            g.addEdge(24, 25, 25);
            g.addEdge(24, 29, 15);
            
            g.addEdge(25, 26, 30);
            g.addEdge(25, 30, 30);
            g.addEdge(25, 31, 21);
            g.addEdge(25, 37, 50);
            
            g.addEdge(26, 31, 20);
            g.addEdge(26, 38, 55);
            
            g.addEdge(27, 28, 43);
            g.addEdge(27, 34, 25);
            g.addEdge(27, 42, 26);
            
            g.addEdge(28, 29, 42);
            g.addEdge(28, 34, 30);
            g.addEdge(28, 35, 25);
            
            g.addEdge(29, 30, 35);
            g.addEdge(29, 35, 30);
            g.addEdge(29, 36, 37);
            
            g.addEdge(30, 36, 33);
            g.addEdge(30, 37, 30);
            
            g.addEdge(31, 37, 35);
            g.addEdge(31, 38, 40);
            
            g.addEdge(33, 37, 35);
            g.addEdge(33, 38, 25);
            g.addEdge(33, 39, 25);
            g.addEdge(33, 46, 30);
            g.addEdge(33, 49, 20);
            
            g.addEdge(34, 35, 33);
            g.addEdge(34, 41, 25);
            g.addEdge(34, 42, 20);
            g.addEdge(34, 43, 37);
            
            g.addEdge(35, 36, 43);
            g.addEdge(35, 41, 35);
            g.addEdge(35, 40, 30);
            
            g.addEdge(36, 37, 28);
            g.addEdge(36, 39, 25);
            g.addEdge(36, 40, 30);
            
            g.addEdge(37, 38, 25);
            g.addEdge(37, 39, 30);
            
            g.addEdge(38, 49, 45);
            
            g.addEdge(39, 40, 40);
            g.addEdge(39, 46, 20);
            
            g.addEdge(40, 41, 27);
            g.addEdge(40, 45, 20);
            g.addEdge(40, 46, 28);
            
            g.addEdge(41, 43, 14);
            g.addEdge(41, 45, 23);
            
            g.addEdge(42, 43, 34);
            g.addEdge(42, 44, 24);
            g.addEdge(42, 47, 36);
            
            g.addEdge(43, 45, 30);
            g.addEdge(43, 47, 15);
            
            g.addEdge(44, 47, 26);
            
            g.addEdge(45, 46, 30);
            g.addEdge(45, 48, 33);
            
            g.addEdge(46, 48, 15);
            g.addEdge(46, 49, 35);
            
            g.addEdge(48, 49, 32);
            
            g.addEdge(50, 7, 0);
            g.addEdge(50, 14, 0);
            g.addEdge(50, 25, 0);
            g.addEdge(50, 28, 0);
            g.addEdge(50, 40, 0);

        FindMST a = new FindMST(g);
        
        System.out.println("MST Edges: ");
        int cable = 0;
        
        for(Edge e : a.mst)
        {
            cable += e.weight();
            System.out.println( e.weight() + " | " + e.v + "-" +e.w);
        } 
        
        System.out.println("Total Cable Length for MST: " + cable);
    }
}

/* OUTPUT
MST Edges: 
0.0 | 50-7
0.0 | 50-14
0.0 | 50-25
0.0 | 50-28
0.0 | 50-40
13.0 | 1-5
14.0 | 41-43
15.0 | 24-29
15.0 | 46-48
15.0 | 2-3
15.0 | 5-7
15.0 | 17-32
15.0 | 3-14
15.0 | 18-32
15.0 | 3-8
15.0 | 43-47
16.0 | 14-21
16.0 | 8-9
17.0 | 0-6
18.0 | 23-28
18.0 | 1-6
20.0 | 4-5
20.0 | 26-31
20.0 | 33-49
20.0 | 7-17
20.0 | 34-42
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
25.0 | 33-39
25.0 | 34-41
25.0 | 7-16
25.0 | 36-39
25.0 | 37-38
28.0 | 10-13
28.0 | 13-15
28.0 | 17-22
28.0 | 40-46
30.0 | 25-30
Total Cable Length for MST: 935
BUILD SUCCESSFUL (total time: 0 seconds)

*/