package codeforces_farewell_party;
import java.util.*;
public class Codeforces_farewell_party {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       int[] bn=new int[t];
       
       List<Integer>sa=new ArrayList<Integer>();
       
       Boolean[] b=new Boolean[t];
       
       for(int s=0;s<t;s++)
       {
           b[s]=false;
       }
       
       
       Map<Integer,Integer>gh=new HashMap<>();
       
       for(int e=0;e<t;e++)
       {
           bn[e]=r.nextInt();
       }
       
       int x=0;
      int p;
      // b[0]=true;
       int sum=1;
       for(int c=0;c<t;c++)
       {
          
           if(b[c]==false)
           {
            
            p=bn[c];
           // System.out.print(p+"=");  
            b[c]=true;
            for(int v=c;v<t;v++)
            {
                if(p==bn[v])
                {
                  // sum++;
                   gh.put(p,sum);
                  
                  // System.out.print(sum+" ");
                   b[v]=true;
                }
            }
            sum++;    
           }  
           else
           {
               x=1;
           }
       }
       
       if(x==1)
       {
        System.out.println("Possible");   
       for(int u=0;u<t;u++)
       {
           System.out.print(gh.get(bn[u])+" ");
       }
       }
       else
          System.out.println("Impossible");
       
       
       
    }
    
}
