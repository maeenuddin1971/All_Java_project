package codeforces_new_year_acquintance_estimation;
import java.util.*;
public class Codeforces_New_year_acquintance_estimation {
    
    
    
    
    
    
    static class Graph 
    { 
        int V; 
        LinkedList<Integer> adjListArray[]; 
          
        // constructor  
        Graph(int V) 
        { 
            this.V = V; 
              
            // define the size of array as  
            // number of vertices 
            adjListArray = new LinkedList[V]; 
              
            // Create a new list for each vertex 
            // such that adjacent nodes can be stored 
            for(int i = 0; i < V ; i++){ 
                adjListArray[i] = new LinkedList<>(); 
            } 
        } 
    } 
    
    
    
    
     static void addEdge(Graph graph, int src, int dest) 
    { 
        
        graph.adjListArray[src].add(dest); 
         
        graph.adjListArray[dest].add(src); 
    } 
    
    
    
    
    
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
       
      int n=r.nextInt();
      int[] i=new int[n];
      Graph graph = new Graph(n+1); 
     for(int t=0;t<n;t++)
      {
          i[t]=r.nextInt();
      }
      
      
       addEdge(graph, 0, 1); 
       addEdge(graph, 0, 4); 
       addEdge(graph, 1, 2); 
       addEdge(graph, 1, 3); 
       addEdge(graph, 1, 4); 
       addEdge(graph, 2, 3); 
       addEdge(graph, 3, 4); 
      
      
      
      
      
    }
    
}
