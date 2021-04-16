package codeforces_maximum_product;
import java.util.Arrays;
import java.util.Scanner;
public class Codeforces_Maximum_Product {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int hs=r.nextInt();
        for(int it=0;it<hs;it++)
        {
        int p=r.nextInt();
        
        int[] k=new int[p];
        
        for(int i=0;i<p;i++)
        {
          k[i]=r.nextInt();
        }
        Arrays.sort(k);
        
       // long hc=243000000000000000L;
        
        //System.out.println(sum1);
        long[] pr=new long[6];
        pr[0]=sh(k,p,2,3);
        //System.out.println(s);
        pr[4]=sh(k,p,3,2);
        pr[5]=sh(k,p,1,4);
        pr[1]=sh(k,p,4,1);
        //System.out.println(sd);
        pr[2]=sh(k,p,0,5);
        //System.out.println(hf);
        pr[3]=sh(k,p,5,0);
        //System.out.println(hd);
        long high=pr[0];
        for(int jh=0;jh<6;jh++)
        {
           if(high<pr[jh])
           {
             high=pr[jh];
           }
        }
        System.out.println(high);
        
    }
    }
    public static long sh(int[] k,int p,int i,int j)
    {
        long sum1=1;
        
        for(int kh=0;kh<i;kh++)
        {
          sum1=sum1*k[kh];
        }
        int hg=p-1;
        for(int uh=0;uh<j;uh++)
        {
          sum1=sum1*k[hg];
          hg--;
        }
        return sum1; 
    }
    
}
