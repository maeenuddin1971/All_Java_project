package codeforces_move_brackets;

import java.util.Scanner;
import java.util.Stack;

public class Codeforces_Move_Brackets {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        //r.nextLine();
        for(int uh=0;uh<n;uh++)
        {
        int hd=r.nextInt();
        r.nextLine();
        String gh=r.nextLine();
        
        char[] p=gh.toCharArray();
        
        
        Stack<Character>pk=new Stack<>();
        
        
        for(int bx=0;bx<gh.length();bx++)
        {
          if(pk.isEmpty())
          {
            pk.push(p[bx]);
          }
          else
          {
            char ds=pk.peek();
            if(ds=='('&&p[bx]==')')
            {
              pk.pop();
              //System.out.println(pk);
            }
            else
            {
             pk.push(p[bx]);
             
            }
          }
        }
        System.out.println(pk.size()/2);
    }
    
}
}