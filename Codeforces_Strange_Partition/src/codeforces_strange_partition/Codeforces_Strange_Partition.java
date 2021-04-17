package codeforces_strange_partition;
import java.util.Scanner;
public class Codeforces_Strange_Partition {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int hy=r.nextInt();
        
        for(int it=0;it<hy;it++)
        {
        int t=r.nextInt();
        int m=r.nextInt();
        //int n=r.nextInt();
        int[] p=new int[t];
        int h=0;
        int sum=0;
        int mg=0;
        for(int i=0;i<t;i++)
        {
         p[i]=r.nextInt();
         sum=sum+p[i];
         if(p[i]%m==0)
         {
             mg=mg+p[i]/m;
         }
         else
         {
             mg=mg+p[i]/m+1;
         }
         if(p[i]%m!=0)
         {
             h=1;
             
         }
        }
        //System.out.println(mg);
        if(h==0)
        {
         if(sum%m==0)
         {
          System.out.println(sum/m+" "+sum/m);
         }
         
        }
        else
        {
         if(sum%m==0)
         {
          int th=sum/m;
          System.out.println(th+" "+mg);
         }
         else
         {
           int th=sum/m;
           System.out.println((th+1)+" "+mg);
         }
        }
        
        
    }
    
}
}