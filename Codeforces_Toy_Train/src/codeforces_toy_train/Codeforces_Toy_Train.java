package codeforces_toy_train;
import java.util.*;
public class Codeforces_Toy_Train {
    
    static class Graph 
    { 
        int V; 
        LinkedList<Integer> adjListArray[]; 
      
        Graph(int V) 
        { 
            this.V = V; 
              
            
            adjListArray = new LinkedList[V+1]; 
              
            
            for(int i =1; i <= V ; i++){ 
                adjListArray[i] = new LinkedList<>(); 
            } 
        } 
    } 
      
    
    static void addEdge(Graph graph, int src, int dest) 
    { 
       
        graph.adjListArray[src].add(dest); 
          
    } 
  
    static void printGraph(Graph graph) 
    {        
        for(int v =1; v <= graph.V; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            //System.out.print("head"); 
            
          //  for(int mwe:graph.adjListArray[v])
            //{
                Collections.sort(graph.adjListArray[v]);
            //}
           System.out.println(graph.adjListArray[v]);
            
           /* for(Integer pCrawl: graph.adjListArray[v]){ 
                System.out.print(" -> "+pCrawl); 
            } */
            System.out.println("\n"); 
            
            
            
            
            
            int[] a=new int[205];
            int[] b=new int[205];
            
            
            Arrays.fill(a,0);
            Arrays.fill(b, 0);
            
            
            
            
            
            
            
            
            
            
            
            
        } 
    } 
       
  
    public static void main(String args[]) 
    { 
    
        
        Scanner r=new Scanner(System.in);
        int V=r.nextInt();
        int m=r.nextInt();
      
        Graph graph = new Graph(V); 
        for(int vb=0;vb<m;vb++)
        {
            addEdge(graph,r.nextInt(),r.nextInt());  
        }
        printGraph(graph); 
    } 
}
