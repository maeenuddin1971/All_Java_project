package hackerrank_hackerrank_in_a_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_HackerRank_in_a_String {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int er=r.nextInt();
        String ny="hackerrank";
        
        List<Character>pr=new ArrayList<>();
        pr.add('h');
        pr.add('a');
        pr.add('c');
        pr.add('k');
        pr.add('e');
        pr.add('r');
        pr.add('r');
        pr.add('a');
        pr.add('n');
        pr.add('k');
        r.nextLine();
        for(int hq=0;hq<er;hq++)
        {
            
        
        String h=r.nextLine();
        
        
        
        
       
        
        char[] nt=h.toCharArray();
        char[] pk=ny.toCharArray();
        
        //System.out.println(pr);
        int dw=0;
        for(int i=0;i<nt.length;i++)
        {
         if(pr.get(dw)==nt[i])
         {
           dw++;
         }
         
         if(dw==10)
         {
             break;
         }
        }
        
        
        if(dw>=10)
        {
          System.out.println("YES");
        }
        else
        {
          System.out.println("NO");
        }
        
    }
    
}
}