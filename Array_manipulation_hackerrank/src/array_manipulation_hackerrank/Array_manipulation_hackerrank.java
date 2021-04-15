package array_manipulation_hackerrank;
import java.util.*;
public class Array_manipulation_hackerrank {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int er=r.nextInt();
        int p[]=new int[er];
        int j=r.nextInt();
        int first[]=new int[j];
        int scnd[]=new int[j];
        int value[]=new int[j];
        for(int i=0;i<j;i++)
        {
            first[i]=r.nextInt();
            scnd[i]=r.nextInt();
            value[i]=r.nextInt();
        }
        for(int y=0;y<er;y++)
        {
            p[y]=0;
           // System.out.println(value[y]);
        }
        for(int y=0;y<j;y++)
        {
           for(int n=first[y]-1;n<scnd[y];n++)
           {
              //p[n]=p[n]+value[n];
               p[n]=p[n]+value[y];
             //  System.out.println(n+" "+p[n]);
               
           }
           
        }
        /*for(int n=0;n<er;n++)
        {
            
        }*/
        Arrays.sort(p);
       System.out.println(p[er-1]);
        
    }
    
}
