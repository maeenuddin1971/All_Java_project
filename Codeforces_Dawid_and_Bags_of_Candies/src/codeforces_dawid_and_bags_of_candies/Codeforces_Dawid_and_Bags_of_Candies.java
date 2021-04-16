package codeforces_dawid_and_bags_of_candies;

import java.util.Arrays;
import java.util.Scanner;
public class Codeforces_Dawid_and_Bags_of_Candies {
    public static void main(String[] args) {
       // TODO code application logic here
        Scanner r=new Scanner(System.in);
        
       
        
        int[] y=new int[4];
        int sum=0;
        for(int i=0;i<4;i++)
        {
            y[i]=r.nextInt();  
            sum=sum+y[i];
        }
        Arrays.sort(y);
        
       
       if(sum%2==0)
       {
           if(y[0]+y[2]==y[1]+y[3])
           {
               System.out.println("YES");
           }
           else if(y[0]+y[3]==y[1]+y[2])
           {
               System.out.println("YES");
           }
           else if(y[0]+y[1]+y[2]==y[3])
           {
               System.out.println("YES");
           }
           else
           {
             System.out.println("NO");  
           }
       }
       else
       {
           System.out.println("NO");
       }
        
        
    }
    
}
