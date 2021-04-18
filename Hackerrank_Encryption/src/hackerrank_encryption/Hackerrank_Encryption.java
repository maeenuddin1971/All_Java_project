package hackerrank_encryption;
import java.util.Scanner;
public class Hackerrank_Encryption {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       String s=r.nextLine();
       int L=s.length();
       
       double f=Math.sqrt(L);
      // System.out.println(f);
       int fd=(int)f;
      // System.out.println(fd);
       if(f-(double)fd==0)
       {
         int yh=fd;
          
          char[] t=s.toCharArray();
          
          for(int gf=0;gf<yh;gf++)
          {
            String ht="";
            try
            {
             for(int a=gf;a<L;a=a+yh)
             {
              ht=ht+s.charAt(a);
             }
            }
            catch(Exception jh)
            {
                
            }
            System.out.print(ht+" ");
          }  
       }
       else
       {
          int yh=fd+1;
          
          char[] t=s.toCharArray();
          
          for(int gf=0;gf<yh;gf++)
          {
            String ht="";
            try
            {
             for(int a=gf;a<L;a=a+yh)
             {
              ht=ht+s.charAt(a);
             }
            }
            catch(Exception jh)
            {
                
            }
            System.out.print(ht+" ");
          }
       }
       
    }
    
}
