package codeforces_odd_sum_segements;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Codeforces_Odd_sum_segements {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int z=r.nextInt();
       
       for(int pk=0;pk<z;pk++)
       {
       int t=r.nextInt();
       int n=r.nextInt();
       int[] pg=new int[t];
       List<Integer>odd=new ArrayList<Integer>();
       List<Integer>odd2=new ArrayList<Integer>();
       for(int i=0;i<t;i++)
       {
           pg[i]=r.nextInt();
           if(pg[i]%2!=0)
           {
              odd.add(pg[i]);
              odd2.add(i+1);
           }
       }
       //System.out.println(odd);
       if (odd.size()>=n)
       {
           System.out.println("YES");
           
           for(int i=0;i<odd2.size();i++)
           {
               System.out.print(odd2.get(i)+" ");
           }
           
       }
       else
       {
           System.out.print("NO");
       }
       System.out.println();
       }
    }
    
}
