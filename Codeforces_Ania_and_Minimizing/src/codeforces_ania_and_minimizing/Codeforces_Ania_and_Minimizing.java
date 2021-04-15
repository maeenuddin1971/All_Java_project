package codeforces_ania_and_minimizing;
import java.util.Scanner;
public class Codeforces_Ania_and_Minimizing {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        
        int k=r.nextInt();
        
        
        String strInput = r.next();
        
        String gh=strInput.substring(0,n);
        
        //System.out.println(gh);
        
        
        long num = Long.parseLong(gh);
        
        
        //System.out.println(num);
        
        char[] pk=gh.toCharArray();
       // System.out.println(pk);
        
        int y=0;
        int m=0;
        int hy=0;
        
        if(n!=1)
        {
        for(;;)
        {
          
           ///System.out.println(pk[y]);
          if(pk[y]=='1')
          {
              hy=1;
              break;
          }
          else if(pk[y]!='0')
          {   
              //System.out.println(pk[y]);
              pk[y]='1';
              //System.out.println(pk[y]);
              break;
          }
          
          else if(y==n-1)
          {
              m=1;
              break;
          }
          y++;
        }
        //System.out.println("maeen");
        
        
        
        int sum=k-y;
        if(hy==0)
        for(int i=y+1;i<sum;i++)
        {
            try
            {
            //System.out.println("maeen");
            if(pk[i]!='0')
            {
                pk[i]='0';
               // System.out.println("hasib");
            }
            else
            {
                /*if(i==k-1)
                {
                    continue;
                }*/
               
                sum++;
            }
            }
            catch(Exception jt)
            {
                
            }
            
        }
        else
        {
          for(int i=y+1;i<sum+1;i++)
          {
              try
              {
              if(pk[i]!='0')
            {
                pk[i]='0';
               // System.out.println("hasib");
            }
            else
            {
                if(i==k-1)
                {
                    continue;
                }
                else
                sum++;
            } 
              }
              catch(Exception gt)
              {
                  
              }
          }
        }
        
        }
        else
        {
            if(k==1)
            {
              pk[0]='0';  
            }
        }
        
        
        
        //String vf=pk.toString();
        
        System.out.println(pk);
        
        
        
    }
    
}
