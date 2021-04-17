package codeforces_required_remainder;

import java.util.Scanner;

public class Codeforces_Required_Remainder {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int i=0;i<n;i++)
        {
        int x=r.nextInt();
        int y=r.nextInt();
        int z=r.nextInt();
        
        int sum=(z-y)/x;
        
        int sum2=sum*x+y;
        System.out.println(sum2);
        
    }
    
}
}