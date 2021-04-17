package codeforces_right_clipher;
import java.util.*;
public class Codeforces_Right_Clipher {
    public static void main(String[] args) {
       
        Scanner r=new Scanner(System.in);
        String mn=r.nextLine();
        
        char[] m=mn.toCharArray();
        
       Stack rf=new Stack();
        
        Stack rf2=new Stack();
       
       List rt=new ArrayList<>();
       
       for(int t=0;t<m.length/2;t++)
       {
           rf.add(m[t]); 
       }
       for(int y=m.length/2;y<m.length;y++)
       {
           rf2.push(m[y]);
       }
       
       int n=0;
       int g1=0;
     //System.out.println(rf2);
       for(;;)
       {
          if(!rf2.empty())
          {
              if(n%2==0)
              {
                 //System.out.print(rf2.pop());
                 rt.add(rf2.pop());
                  //g1--;
                  
              }
          }
         n++;
          
          if(n%2!=0)
          {
             if(g1<rf.size())
             {
            // System.out.print(rf.get(g1)); 
              rt.add(rf.get(g1));
              g1++;
             }
          }
          
          if(rf2.empty())
              break;
          
         
       }
       
      for(int i=rt.size()-1;i>=0;i--)
      {
          System.out.print(rt.get(i));
      }
        
    }
    
}
