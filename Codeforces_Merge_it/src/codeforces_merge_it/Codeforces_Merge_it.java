package codeforces_merge_it;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Codeforces_Merge_it {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       
       int[] kj=new int[t];
       int[] q=new int[t-1];
       List<Integer> a = new ArrayList();
       List<Integer> a2 = new ArrayList();
       a2.add(99999999);
       boolean[] hy=new boolean[t];
       for(int i=0;i<t;i++)
       {
           kj[i]=r.nextInt();
           hy[i]=false;
       }
       int sum;
       for(int i=0;i<t;i++)
       {
           for(int y=0;y<t;y++)
           {
               if(i!=y)
               {
               
                  
               
                if((!(a2.contains(kj[y])&&a2.contains(kj[i]))))
                {
                
                 System.out.println("skjfhskfh");   
               
               sum=kj[i]+kj[y];
               
               
               
               
               if(sum%3==0)
               {
                    System.out.println("skjfhskfh");   
                   a.add(sum);
                   for(int t1=0;t1<t;t1++)
                   {
                      if(t1==i||t1==y)
                      {
                          
                      }
                      else
                      {
                          a.add(kj[t1]);
                      }
                      
                   }
                   System.out.println(a);
                   a.clear();
               }
              // System.out.println(" kj is "+kj[i]+"  y is "+kj[y]);
              a2.add(kj[i]);
              a2.add(kj[y]);
               }
                
               /* if(!(a2.contains(kj[y])&&a2.contains(kj[i])))
                {
                    
                }*/
                
                
               }
               
              
           }
       }
    }
    
}
