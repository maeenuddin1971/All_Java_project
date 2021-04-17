package hackerrank_apple_and_orange;

import java.util.Scanner;

public class Hackerrank_Apple_and_Orange {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int s=r.nextInt();
        int t=r.nextInt();
        int a=r.nextInt();
        int b=r.nextInt();
        int m=r.nextInt();
        int n=r.nextInt();
        int[] y=new int[m];
        int[] h=new int[n];
        int vf=0,km=0;
        for(int i=0;i<m;i++)
        {
            y[i]=r.nextInt();
            int sum=y[i]+a;
            //System.out.println(sum);
            if(sum>=s&&sum<=t)
            {
                vf++;
            }
            
            
        }
        System.out.println(vf);
        for(int i=0;i<n;i++)
        {
            h[i]=r.nextInt();
            int sum2=h[i]+b;
            
            //System.out.println(sum2);
            
            
            if(sum2>=s&&sum2<=t)
            {
                km++;
            }
            
        }
        System.out.println(km);
        
        
    }
    
}
