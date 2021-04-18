package hackerrank_gemstones;
import java.util.Scanner;
public class Hackerrank_Gemstones {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        String[] gh=new String[t];
        r.nextLine();
        for(int i=0;i<t;i++)
        {
         gh[i]=r.nextLine();
        }
        
        System.out.println(gh[0]);
        
        Character fr;
        int sum=0;
        for(fr='a';fr<='z';fr++)
        {
          int ht=0;
          for(int i=0;i<gh.length;i++)
          {
            if(gh[i].contains(fr.toString()))
            {
             continue;
            }
            else
            {
             ht=1;
            }
          }
          if(ht==0)
          {
           sum++;  
          }
        }
        System.out.println(sum);
        
        
        
    }
    
}
