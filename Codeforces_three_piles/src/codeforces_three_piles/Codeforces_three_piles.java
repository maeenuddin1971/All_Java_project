
package codeforces_three_piles;
import java.util.Scanner;
public class Codeforces_three_piles {

    public static void main(String[] args) {  
        Scanner r=new Scanner(System.in);
        int s=r.nextInt();
        
        for(int i=0;i<s;i++)
        {
        long vg=r.nextLong();
        long vg2=r.nextLong();
        long vg3=r.nextLong();
        long sum=vg+vg2+vg3;
        
        if(sum%2==0)
        {
            System.out.println(sum/2);
        }
        else
        {
            System.out.println((sum-1)/2);
        }
        }
    }
    
}
