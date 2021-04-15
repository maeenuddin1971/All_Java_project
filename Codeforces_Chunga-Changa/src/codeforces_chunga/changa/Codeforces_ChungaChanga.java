package codeforces_chunga.changa;
import java.util.Scanner;
public class Codeforces_ChungaChanga {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      
      int t=r.nextInt();
      
      int p=r.nextInt();
      
      int e=r.nextInt();
      System.out.println(t%e+" "+p%e);
    /*  if(t>p||t==p)
      {
          int z=t/e;
          int n=z;
          int w=t%e;
          
          if(w==0)
          {
              z=z+p/e;
              
              System.out.println(z+" "+0);
          }
          else
          {
              if(p%e==0)
              {
                  z=z+p/e;
                  System.out.println(z+" "+0);
              }
              else
              {
                 int y=p%e;
                 z=z+p/e;
                 int m1=0,m2=0;
                // System.out.println("this is maeen");
                 for(int ew=y;ew>0;ew--)
                 {
                     int sum=w+ew;
                    // System.out.println(sum);
                     if(sum%e==0)
                     {
                         z=z+sum/e;
                         m1=ew;
                        // System.out.println(z+" "+ew);
                         break;
                     }
                 }
                 
                 int kj=t%e;
                 n=n+p/e;
                // System.out.println("skdjdfksjhf");
                  for(int ew=1;ew<=kj;kj++)
                 {
                     int sum=w+ew;
                    // System.out.println(sum);
                     if(sum%e==0)
                     {
                         z=z+sum/e;
                         m2=ew;
                         //System.out.println(z+" "+ew);
                         break;
                     }
                 }
                  
                  if(m1<m2)
                  {
                     System.out.println(z+" "+m1); 
                  }
                  else
                      System.out.println(z+" "+m2); 
                 
              }
          }
                  
      }
      else if(t<p)
      {
          int fr=t;
          t=p;
          
          p=fr;
          
          
          
          
           int z=t/e;
          
          int w=t%e;
          
          if(w==0)
          {
              z=z+p/e;
              
              System.out.println(z+" "+0);
          }
          else
          {
              if(p%e==0)
              {
                  z=z+p/e;
                  System.out.println(z+" "+0);
              }
              else
              {
                 int y=p%e;
                 z=z+p/e;
                // System.out.println("this is maeen");
                 for(int ew=y;ew>0;ew--)
                 {
                     int sum=w+ew;
                    // System.out.println(sum);
                     if(sum%e==0)
                     {
                         z=z+sum/e;
                         
                         System.out.println(z+" "+ew);
                         break;
                     }
                 }
              }
          }
          
         
      }
    */
      
    }
    
}
