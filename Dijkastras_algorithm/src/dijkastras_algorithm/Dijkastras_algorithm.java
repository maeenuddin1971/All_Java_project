package dijkastras_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Dijkastras_algorithm {
    public static void main(String[] args) {
       graph jk=new graph(5);
       
       addedge(jk,0,1,1);
       addedge(jk,0,2,3);
       addedge(jk,1,2,15);
       addedge(jk,1,3,10);
       
       addedge(jk,2,3,4);
       addedge(jk,3,4,7);
         
    //  printgraph(jk);
     diskrats2(jk);
    }
    
    
static class graph
{
  int v;
 // int dest;
  List<Integer>adlist[][];
  List<Integer>man[];
  List<Integer>man2[];
  Queue<Integer>man3[];
      boolean ty[][];
  
          graph(int g)
          {
             this.v=g; 
             adlist=new LinkedList[g][g];
             man=new LinkedList[g];
             man2=new LinkedList[g];
             man3=new LinkedList[g];
            ty=new boolean[v][v];
             for(int i=0;i<g;i++)
             {
                 for(int p=0;p<g;p++)
                 {
                  adlist[i][p]=new LinkedList<>(); 
                  
                  ty[i][p]=false;
                 }
             }
             for(int i=0;i<g;i++)
             {
                 man[i]=new LinkedList<>();
                 man2[i]=new LinkedList<>();
                 man3[i]=new LinkedList<>();
             }
             
          }
}


   

static void addedge(graph y,int src,int dest,int w)
{
    y.adlist[src][dest].add(w);
    y.man[src].add(dest);
   y.ty[src][dest]=true;
}



static void printgraph(graph vb)
{
   for(int v=0;v<vb.v;v++)
   {
      for(int bh=0;bh<vb.v;bh++)
      {
          if(vb.ty[v][bh]==true)
          {
              System.out.println("src="+v+" dest="+bh+" weight is="+vb.adlist[v][bh].get(0));
          }
      }
   }
}

/*

static void diskrats(graph vb)
{
     List<Integer>ad[];
    ad=new LinkedList[vb.v];
    for(int u=0;u<vb.v;u++)
    {
       ad[u]=new LinkedList<>();
    }
    int sum2=0; 
    for(int v=0;v<vb.v;v++)
   {
      int gv=v;
      for(int bh=0;bh<vb.v;bh++)
      {
          int ye=bh;
          if(vb.ty[gv][ye]==true)
          {
             int sum=vb.adlist[gv][ye].get(0);
             for(int er=0;er<ad[bh].size();er++)
             {
                 sum=sum+ad[v].get(er);
             }
             gv=ye;
           //  bh=0;
             
             ad[ye].add(sum);
             System.out.println(gv+"="+sum);
          }
      }
      
   }
}


*/

static void diskrats2(graph vb)
{
 // System.out.println("i am clear");
   for(int y=0;y<vb.v;y++)
   {
     // System.out.println(y+" is connected with "+vb.man[y]);
      for(Integer ki:vb.man[y])
      {
         // System.out.print(y+" is connected with "+ki+" , ");
          int se=vb.adlist[y][ki].get(0);
        //  System.out.print("the cost is "+se+" and ");
          if(vb.man3[ki].size()==0&&vb.man3[y].size()==0)
          {
             // System.out.println("i am clear");
              vb.man3[ki].add(se);
            //  vb.man2[ki].add(se);
            // System.out.print(vb.man3[ki].peek()+"    ");
          }
          else
          {
            //  System.out.println("i am clear");
             int sum=vb.man3[y].peek()+vb.adlist[y][ki].get(0);
         //   System.out.print("the sum is "+sum+" ");
            
            if(vb.man3[ki].size()!=0)
            {
             if(sum<vb.man3[ki].peek())
             {
                 // System.out.println("the sum is "+sum);
                 vb.man3[ki].poll();
                 vb.man3[ki].add(sum);
                 // System.out.println("the sum is "+sum);
             }
            }
            else
            {
                vb.man3[ki].add(sum);
            }
          }
          
      }
     // System.out.println();
   }
   
   System.out.println("THe cost to get 4 is "+vb.man3[4].peek());
    
  
}







    
}


