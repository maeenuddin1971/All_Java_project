package hackerrank_hackerrank_highest_value_palindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Hackerrank_highest_value_palindrome {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        int d=r.nextInt();
        r.nextLine();
        String gt=r.nextLine();
        
        char[] k=gt.toCharArray();
        
        Map<Integer,Integer>mk=new HashMap<>();
        Map<Integer,Integer>mk2=new HashMap<>();
        int sum=0;
        int hk=0;
        int mn=0;
        //Map<Integer,Integer>mk2=new HashMap<>();
        if(t%2!=0)
        {
          mk2.put(k.length/2,Integer.parseInt(String.valueOf(k[k.length/2])));
          mn=1;
          
        }
        for(int i=0,n=k.length-1;i<k.length/2;i++,n--)
        {
         if(k[i]!=k[n])
         {
             if(k[i]>k[n])
             {
              mk.put(n,Integer.parseInt(String.valueOf(k[i])));
              mk.put(i,Integer.parseInt(String.valueOf(k[i])));
             }
             else
             {
              mk.put(i,Integer.parseInt(String.valueOf(k[n]))); 
              mk.put(n,Integer.parseInt(String.valueOf(k[n]))); 
             }
             sum++;
         }
         else
         {
           mk2.put(i,Integer.parseInt(String.valueOf(k[n])));
           mk2.put(n,Integer.parseInt(String.valueOf(k[n])));
           hk++;
         }
        }
        /*System.out.println(mk);
        System.out.println(sum);
        System.out.println(hk);
        System.out.println(mk2);*/
        
        if(d>=sum)
        {
            String result="";
            if(d==sum)
            {
                for(int i=0;i<k.length;i++)
                {
                 if(mk.containsKey(i))
                 {
                  result=result+mk.get(i);
                 }
                 else if(mk2.containsKey(i))
                 {
                   result=result+mk2.get(i);
                 }
                 else
                 {
                   result=result+k[i];
                 }
                }
                System.out.println(result);
            }
            else if(d>=t)
            {
                for(int i=0;i<t;i++)
                {
                    result=result+"9";
                }
                System.out.println(result);
            }
            else
            {
                
              int ekta=d;
              int mil=hk;
              String half1="";
              String half2="";
              sum=sum+hk;
              for(int i=0,kr=t-1;i<t/2;i++,kr--)
              {
                //System.out.println("sum is "+sum+" and "+ekta);
                
                if(sum<=ekta&&sum!=0&&sum!=1)
                {
                  
                if(mk.containsKey(i)&&mk.get(i)!=9)
                {
                  mk.put(i,9);
                  mk.put(kr,9);
                  
                  ekta=ekta-2;
                  sum--;
                }
                else if(mk.containsKey(i)&&mk.get(i)==9)
                {
                  mk.put(i,9);
                  mk.put(kr,9);
                  ekta--;
                  sum--;
                }
                else if(mk2.containsKey(i)&&mk2.get(i)!=9)
                {
                  mk2.put(i,9);
                  mk2.put(kr,9);
                  ekta=ekta-2;
                  //sum--;
                }
                }
                else
                {
                   break;
                }
                
                
                
                
                
                
              }
             // System.out.println(mk);
             // System.out.println(mk2);
              
              if(mn==1)
              {
                  
              }
              
              for(int mj=0;mj<t;mj++)
              {
                  if(mk.containsKey(mj))
                  result=result+mk.get(mj);
                  else if(mk2.containsKey(mj))
                  {
                    result=result+mk2.get(mj);
                  }
                  
              }
              System.out.println(result);
              
            }
            
        }
        else
        {
          System.out.println(-1);
        }
        
        
    }
    
}
