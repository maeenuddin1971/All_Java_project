package codeforces_harland;
import java.util.*;

public class Codeforces_harland {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        
        int y=r.nextInt();
        
       // char[] p=new char[y];
        
        String msn=r.next();
        
        String bn=msn.substring(0, y);
        char[] mr=bn.toCharArray();
        char[] sc=new char[y];
        char[] pi=bn.toCharArray();
        List<String>df=new ArrayList<String>();
        PriorityQueue<Integer> ph=new  PriorityQueue<Integer>();
        Map<Integer,String> jk4=new HashMap<Integer,String>();
        
        df.add("RGB");
        df.add("RBG");
        df.add("BRG");
        df.add("GBR");
        df.add("GRB");
        df.add("BGR");
        
       if(msn.length()>2)
       {
       for(int ed=0;ed<6;ed++)
        {
            
            sc[0]=df.get(ed).charAt(0);
            sc[1]=df.get(ed).charAt(1);
            sc[2]=df.get(ed).charAt(2);
            
            for(int jk=3;jk<y;jk++)
            {
               if(jk<y)
               {
                   sc[jk]=df.get(ed).charAt(0);
                   jk++;
                   if(jk<y)
                   {
                       sc[jk]=df.get(ed).charAt(1);
                       jk++;
                       if(jk<y)
                       {
                           sc[jk]=df.get(ed).charAt(2);
                       }
                       else
                           break;
                   }
                   else
                       break;
                   
               }
               else
                   break;
                
            }
            
           // System.out.println(sc);
            int sum=0;
            for(int g=0;g<y;g++)
            {
                if(mr[g]!=sc[g])
                {
                   sum++; 
                }
                if(jk4.containsKey(sum))
                    break;
            }
            if(!jk4.containsKey(sum))
            {
            jk4.put(sum,String.copyValueOf(sc));
            }
            ph.add(sum);
         //   System.out.println(sum);
            //System.out.println(sc);
            
        }
        System.out.println(ph.peek());
       
        System.out.println(jk4.get(ph.peek()));
       
    }
       
       if(msn.length()==1)
       {
           System.out.println(0);
           System.out.println(msn);
       }
       if(msn.length()==2)
       {
           if(pi[0]!=pi[1])
           {
              System.out.println(0);
           }
           else
           {
              if(pi[0]=='B')
              {
                  pi[1]='G';
                  System.out.println(1);
              }
              if(pi[0]=='G')
              {
                  pi[1]='R';
                   System.out.println(1);
              }
              if(pi[0]=='R')
              {
                  pi[1]='G';
                   System.out.println(1);
              }
           }
           System.out.println(pi);
       }
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
