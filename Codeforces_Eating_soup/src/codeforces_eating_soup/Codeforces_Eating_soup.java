package codeforces_eating_soup;
import java.util.Scanner;
public class Codeforces_Eating_soup {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int y=r.nextInt();
        int fg=r.nextInt();
        
        int vb=y-fg;
        
        int sum=0;
        
        if(vb%2==0&&vb!=0)
        {
            sum=vb/2;
            System.out.println(sum);
        }
        else if(vb==0)
        {
            System.out.println(vb);
        }
        else
        {
            System.out.println(1);
        }
    }
    
}
