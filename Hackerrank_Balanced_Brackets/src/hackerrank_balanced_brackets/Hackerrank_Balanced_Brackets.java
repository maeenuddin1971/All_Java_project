package hackerrank_balanced_brackets;

import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        //String kj=r.next();
        
        for(int e=0;e<t;e++)
        {
        String gb=r.next();
        
        char[] km=gb.toCharArray();
        
        
        
        //System.out.println(gb);
        
        Stack<Character>bh=new Stack<>();
        
        for(int c=0;c<gb.length();c++)
        {
            
          if(km[c]=='('||km[c]=='{'||km[c]=='[')
          {
            bh.push(km[c]);
            //System.out.println(km[c]);
          }
          else if(!bh.isEmpty()&&((km[c]==')'&&bh.peek()=='(')||(km[c]=='}'&&bh.peek()=='{')||(km[c]==']'&&bh.peek()=='[')))
          {
           bh.pop();
          }
          else
          {
              bh.push(km[c]);
          }
          
        }
        if(bh.isEmpty())
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
