package bfs_graph;
import java.util.*;
public class BFS_GRAPH {
    
      static LinkedList<Integer>q2=new LinkedList<Integer>();
    
    
    static public  int kf;
    LinkedList<Integer>adj[];
    
    BFS_GRAPH(int v)
    {
        this.kf=v;
        adj=new LinkedList[kf];
        for(int i=0;i<kf;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    
    void addedge(int c,int k)
    {
        adj[c].add(k);
    }
    
    public static void main(String[] args) {
        Scanner bn=new Scanner(System.in);
        int cv=bn.nextInt();
       BFS_GRAPH  b=new  BFS_GRAPH (cv);
       
       int u=bn.nextInt();
       for(int e=0;e<u;e++)
       {
           int vb=bn.nextInt();
           int sx=bn.nextInt();
           b.addedge(vb,sx);
       }
       
       
       
       
      // b.addedge(0,2);
      // b.addedge(2,3);
       //b.addedge(0,4);
       b.visit();
       b.ans();
      // System.out.println("dskfnkfbsddkjbf");
    }
    
    public void ans()
    {
        int sum;
        int cx=0;
        for(int i=0;i<q2.size();i++)
        {
            for(int t=i+1;t<q2.size();t++)
            {
               sum=q2.get(i)*q2.get(t);
               cx=cx+sum;
            }
        }
        System.out.println(cx);
    }
    
    static boolean visited[]=new boolean[100];
    void visit()
    {
       //System.out.println("dskfnkfbsddkjbf");
       visitf();
       for(int r=0;r<kf;r++)
       {
            //System.out.println("dskfnkfbsddkjbf");
           if(visited[r]==false)
           {
             // System.out.println("dskfnkfbsddkjbf");
              bfs(r); 
             // System.out.println();
           }
       }
    }
 
    
    void visitf()
    {
        for(int i=0;i<kf;i++)
        {
            visited[i]=false;
        }
    }
    
    
    
     void bfs(int s)
    {
        int df=0;
        LinkedList<Integer>q=new LinkedList<Integer>();
        
        visited[s]=true;
        q.add(s);
        
        while(q.size()!=0)
        {
            s=q.poll();
            df++;
           // System.out.print(s+" ");
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        q2.add(df);
    }
    
    
}
