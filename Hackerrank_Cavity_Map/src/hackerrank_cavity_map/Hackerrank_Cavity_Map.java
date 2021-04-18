package hackerrank_cavity_map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hackerrank_Cavity_Map {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int n=r.nextInt();
       String[] p=new String[n];
       List<Integer>fe=new ArrayList<>();
       if(n>=3)
       for(int i=0;i<n;i++)
       {
          p[i]=r.next();
          
          char[] b=p[i].toCharArray();
          fe.clear();
          for(int k=0;k<b.length;k++)
          {
            try
            {
               if((int)b[k-1]<(int)b[k]&&(int)b[k]>b[k+1])
               {
                  
                  if(!fe.contains(k-1))
                  {
                  System.out.print(b[k-1]);
                  fe.add(k-1);
                  }
                  if(!fe.contains(k))
                  {
                  System.out.print("X");
                  fe.add(k);
                  }
                  if(!fe.contains(k+1))
                  {
                  System.out.print(b[k+1]);
                  fe.add(k+1);
                  }            
                  
               }
               else
               {
                 if(!fe.contains(k-1))
                  {
                  System.out.print(b[k-1]);
                  fe.add(k-1);
                  }
                  if(!fe.contains(k))
                  {
                  System.out.print(b[k]);
                  fe.add(k);
                  }
                  
                  if(k+1==b.length-1)
                  {
                   System.out.print(b[k+1]);
                   fe.add(k+1);
                  }
               }
               
            }
            catch(Exception jy)
            {
              //System.out.println(k-1);  
            }
            
          }
          System.out.println();
       }
       else
       {
         for(int g=0;g<n;g++)
         {
         p[g]=r.next();
         System.out.println(p[g]);
         }
       }
    }
    
}
