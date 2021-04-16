package codeforces_lcm_problem;

import java.util.Scanner;

public class Codeforces_LCM_Problem {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int i=r.nextInt();
        
        for(int uh=0;uh<i;uh++)
        {
        int it=r.nextInt();
        int jh=r.nextInt();
        
        if(it*2<=jh)
        {
            System.out.println(it+" "+it*2);
        }
        else
        {
            System.out.println(-1+" "+-1);
        }
    }
    
}
}