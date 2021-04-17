package codeforces_regular_bracket_sequence;

import java.util.Scanner;
import java.util.Stack;

public class Codeforces_Regular_Bracket_Sequence {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int hg=r.nextInt();
        r.nextLine();
        for(int uy=0;uy<hg;uy++)
        {
        String gh=r.nextLine();
        
        
        char[] p=gh.toCharArray();
        
        if(p[0]==')'||p[p.length-1]=='(')
        {
          System.out.println("NO");
        }
        else if(p.length%2==0)
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