package hackerrank_graph;
import java.util.*;
public class Hackerrank_graph {
    
     static final int MAXV      =15000;
    static final int MAXDEGREE = 8000;
    public int       edges[][] = new int[MAXV + 1][MAXDEGREE];
    public int       degree[]  = new int[MAXV + 1];
    public int nvertices;
    public int nedges;
    
    
    static int t;
    static ArrayList<Integer> al=new ArrayList<Integer>();  
    
    
     static boolean   processed[]  = new boolean[MAXV];
    static boolean   discovered[] = new boolean[MAXV];
    static int       parent[]     = new int[MAXV];
    
   static int count=0;
    
    
    
    
    static void connected(Hackerrank_graph  h)
    {
       int c=0;
       initial(h);
       
       for (int i = 1; i <=2*t; i++)
        {
            if (!discovered[i])
            {
                c++;
                //System.out.printf("Component %d:", c);
                bfs(h, i);
              //  System.out.printf("\n");
            }
        }
    }
    
    
    
    
     static void bfs(Hackerrank_graph h,int start)
    {
       Queue<Integer> q = new LinkedList<Integer>();
        int i, v;
        
        q.offer(start);
        discovered[start] = true;
        
        count=0;
         while (!q.isEmpty())
        {
            v = q.remove();
            process_vertex(v);
            processed[v] = true;
           
            for (i = h.degree[v] - 1; i >= 0; i--)
            {
                if (!discovered[h.edges[v][i]])
                {
                    q.offer(h.edges[v][i]);
                    discovered[h.edges[v][i]] = true;
                    parent[h.edges[v][i]] = v;
                }
            }
            
        }
       // System.out.print(" "+count);
        
        al.add(count);
          
        
        
    }
    
    
     
     
     static void process_vertex(int v)
    {
       // System.out.printf(" %d", v);
       count++;
    }
    
    
    
    static void initial( Hackerrank_graph h)
    {
         for (int i = 1; i <=2*t; i++)
        {
            processed[i] = discovered[i] = false;
            parent[i] = -1;
        }
    }
    
    
    static void last()
    {
        Collections.sort(al);
      
       
       for(int i=0;i<al.size();i++)
       {
           if(al.get(i)==1)
           {
               continue;
           }
           else
           {
               System.out.print(al.get(i));
               break;
           }
       }
       
       
        System.out.print(" "+al.get(al.size()-1));
    }
    
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      Hackerrank_graph v=new Hackerrank_graph();
      t=r.nextInt();
      int x,y;
      for(int i=1;i<=t;i++)
       {
           x=r.nextInt();
           y=r.nextInt();
           v.insert(x,y,false);
       }
      
      connected(v);
      last();      
    }
    
    
    void insert(int t,int g,boolean gh)
    {
        edges[t][degree[t]]=g;
        degree[t]++;
        if(!gh)
            insert(g,t,true);
        else
            nedges++;
    }
    
    
}
