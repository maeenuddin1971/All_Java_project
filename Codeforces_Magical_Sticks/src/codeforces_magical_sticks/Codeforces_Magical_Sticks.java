package codeforces_magical_sticks;
import java.util.Scanner;
public class Codeforces_Magical_Sticks {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        for(int i=0;i<t;i++)
        {
        int m=r.nextInt();
        
        if(m%2==0)
        {
           int h=m/2;
           System.out.println(h);
        }
        else
        {
           int h=(m-1)/2;
           System.out.println(h+1);
        }
    }
    
}
}