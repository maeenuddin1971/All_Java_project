package hackerrank_components_in_a_graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hackerrank_Components_in_a_graph {
    static class Graph 
    { 
        int V; 
        LinkedList<Integer> adjListArray[]; 
        boolean[] bc;
        Graph(int V) 
        { 
            this.V = V; 
           // System.out.println("This is maeen");
            adjListArray = new LinkedList[V+1]; 
            bc=new boolean[V+1];
            // Create a new list for each vertex 
            // such that adjacent nodes can be stored 
            for(int i =0; i <= V ; i++){ 
                adjListArray[i] = new LinkedList<>(); 
                bc[i]=false;
            } 
        } 
    } 
      
    // Adds an edge to an undirected graph 
    static void addEdge(Graph graph, int src, int dest) 
    {  
        graph.adjListArray[src].add(dest); 
        graph.adjListArray[dest].add(src); 
    } 
       
    // A utility function to print the adjacency list  
    // representation of graph 
    static void printGraph(Graph graph) 
    {   
        
        List<Integer>pm=new ArrayList<Integer>(); 
        int arc=0;
        int sd=0;
        for(int t=0;t<=graph.V;t++)
        {
        int sum=0;
        t=sd;
       // graph.bc[t]=true;
        int sum2=0;
        if(graph.bc[t]==false)
        for(int u=0;u<=graph.V;u++)
        {
            
            if(graph.bc[t]==false&&graph.adjListArray[t].size()>0)
            {
                //System.out.println(u);
                graph.bc[t]=true;
                try{
                  for(int hb=0;hb<graph.adjListArray[t].size();hb++)
                  {
                      if(graph.bc[graph.adjListArray[t].get(hb)]==false)
                      {
                          t=graph.adjListArray[t].get(hb);
                         // System.out.println("Here "+t);
                         // t--;
                          sum2++;
                          arc=1;
                          break;
                      }
                      
                  }
                  if(arc==0)
                  {
                   t=sd;
                   break; 
                   
                  }
                }
                catch(Exception jg)
                {
                    
                }
            }
            else
            {
             break;   
            }
            
            
        }
        sd++;
        //System.out.println(sum2+1);
        if(sum2+1>1)
        {
            pm.add(sum2+1);
        }
        
        
         
         
        
        //System.out.println(sum);
        }
        Collections.sort(pm);
        System.out.println(pm.get(0)+" "+pm.get(pm.size()-1));
    
    }
    
    
       
    // Driver program to test above functions 
    public static void main(String args[]) 
    { 
        // create the graph given in above figure 
        Scanner r=new Scanner(System.in);
        int V=r.nextInt();
        int k=2*V;
        Graph graph = new Graph(k); 
        
        for(int i=0;i<V;i++)
        {
        addEdge(graph,r.nextInt(),r.nextInt()); 
        }
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
    } 
    
}
