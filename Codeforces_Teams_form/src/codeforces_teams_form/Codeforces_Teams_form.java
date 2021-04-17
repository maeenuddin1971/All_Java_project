package codeforces_teams_form;
import java.util.*;
public class Codeforces_Teams_form {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in); 
       int t=r.nextInt();
       
       int[] bn=new int[t];
       
       for(int i=0;i<bn.length;i++)
       {
           bn[i]=r.nextInt();
       }
       
       Arrays.sort(bn);
       int sum=0;
        for(int i=0;i<bn.length;i=i+2)
       {
          try
          {
          sum=sum+bn[i+1]-bn[i];
          }
          catch(Exception rd)
                  {
                  break;
                  }
       }
       System.out.println(sum);
    }
    
}
