package hackerrank_find_digits;
import java.util.Scanner;
public class Hackerrank_Find_Digits {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      int t=r.nextInt();
      
      for(int i=0;i<t;i++)
      {
        int e=r.nextInt();
        String f=String.valueOf(e);
        char[] m=f.toCharArray();
        int sum=0;
        for(int u=0;u<m.length;u++)
        {
          String w=String.valueOf(m[u]);
          int q=Integer.valueOf(w);
          
          try
          {
            if(e%q==0)
            {
             sum++;
            }
          }
          catch(Exception tr)
          {
              
          }
        }
        System.out.println(sum);
        
      }
    }
    
}
