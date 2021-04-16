package codeforces_interactive_exercise;

import java.util.Scanner;

public class Codeforces_interactive_exercise {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int lw=2;
        int up=10;
        
        for(int i=lw;i<=up;i++)
        {
            System.out.println(i);
            System.out.flush();
            int response=r.nextInt();
            
            if(response==0)
            {
                System.out.println("Number guessed is: "+i);
                break;
            }
        }
       
        
    }
    
}
