package codeforces_yet_another_array_partitioning_task;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_Yet_Another_Array_Partitioning_Task {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int n=r.nextInt();
       int m=r.nextInt();
       int k=r.nextInt();
     //  System.out.println(m);
       int[] u=new int[n];
       
       for(int t=0;t<n;t++)
       {
           u[t]=r.nextInt();
       }
       
       if(n%k==0)
       {
           int fg=n/k;
        // System.out.println(fg);
          int start=0;
          int finish=fg;
         // System.out.println(start+" "+finish);
         int sum=0;
         /* for(int er=0;er<jk.length;er++)
          {
              System.out.println(jk[er]);
          }*/
           for(int er=0;er<=fg;er++)
          {
               int[] jk=Arrays.copyOfRange(u,start,finish);
               start=finish;
               finish=finish+fg;
              Arrays.sort(jk); 
        /*  for(int er1=0;er1<jk.length;er1++)
          {
              System.out.print(jk[er1]+" ");
          }*/
       //   System.out.println();
           
          // /* Arrays.sort(jk);
            //System.out.println(jk[m]);
               int kp=0;
            for(int g=jk.length-1;g>=0;g--)
            {
               
                if(kp==m)
                {
                   // System.out.println("yesss");
                    break;
                }
                sum=sum+jk[g];
               // System.out.print(jk[g]+" ");
                kp++;
            }
              // System.out.println();
            
          }
         System.out.println(sum);
         
         ///uporer ta complete
          
       }
       else
       {
           
           
           
           
           
           
           
           
           
           
           
           
       }
    }
    
}
