
package codeforces_chunga.changa.pkg2;

import java.util.Scanner;

public class Codeforces_ChungaChanga2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
      
        String dsw=r.next();
        
        String fr=r.next();
        
        String xs=r.next();
         
      long n=Long.parseLong(dsw);
     // System.out.println("this is maeen");
      long p=Long.parseLong(fr);
      
      long a=Long.parseLong(xs);
     
      long s=n%a;
      
      long s2=p%a;
      
      long m=a-s;
      long cd=a-s2;
      
      
     // System.out.println(m+" "+cd);
      if(cd<m&&cd!=a&&m!=a)
      
      {    
          
          long sum;
          sum=(p+cd)/a;
          
          
          sum=sum+n/a;
          System.out.println(sum+" "+cd);
      }
      else if(cd>m&&cd!=a&&m!=a)
      {
          long sum;
          sum=(n+cd)/a;
          
          
          sum=sum+p/a;
          System.out.println(sum+" "+m);
      }
      else if(cd==m&&cd!=a&&m!=a)
      {
          if(n%a==0&&p%a==0)
          {
              long vc=n+p;
              
              long sum=vc/a;
              
              System.out.println(sum+" "+0);
          }
         else
          {
               long sum;
          sum=(n+cd)/a;
          
          
          sum=sum+p/a;
          System.out.println(sum+" "+m);
          }
          
      }
      else
      {
          if(cd==a||m==a)
          {
              long sum=n/a+p/a;
              
               System.out.println(sum+" "+0);
          }
      }
      
      
    }
    
}
