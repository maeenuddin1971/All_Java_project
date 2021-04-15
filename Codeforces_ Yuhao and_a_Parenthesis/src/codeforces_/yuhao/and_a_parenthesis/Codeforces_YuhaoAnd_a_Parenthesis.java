package codeforces_.yuhao.and_a_parenthesis;
import java.util.*;
public class Codeforces_YuhaoAnd_a_Parenthesis {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       String[] m=new String[t];
       Map<Integer,String>bn=new HashMap<Integer,String>();
        Map<String,Integer>bn2=new HashMap<String,Integer>();
        List<String>bn3=new ArrayList<String>();
       for(int e=0;e<t;e++)
       {
           m[e]=r.next();
          
       }
       int g=0;
       for(int e=0;e<t;e++)
       {
          if(!bn2.containsKey(m[e]))
          {
              bn2.put(m[e],g);
              g++;
          }
       }
     
       
       
       String[] strs = bn2.keySet().toArray(new String[bn2.size()]);
       
         for(String str : strs) {
	bn3.add(str);
     }
       //  System.out.println(bn3);
         
         
      boolean[] qw=new boolean[bn3.size()];
      for(int dx=0;dx<bn3.size();dx++)
      {
          qw[0]=false;
      }
         
      int vb=0;
      
      for(int y=0;y<bn3.size();y++)
      {
      //System.out.println(check(bn3.get(y)));
        
          
          if(qw[y]==false)
          for(int df1=y+1;df1<bn3.size();df1++)
          {
              if(qw[df1]==false)
              {
              String sde=bn3.get(y)+bn3.get(df1);
              String cvs=bn3.get(df1)+bn3.get(y);
              boolean dfw=check(sde);
              if(dfw==true)
              {
                 qw[y]=true;
                 qw[df1]=true;
                 // System.out.println("true");
                  System.out.println(sde);
                  vb++;
              }
             else
              {
                  if(check(cvs)==true)
                  {
                       qw[y]=true;
                       qw[df1]=true;
                     // System.out.println("true");
                        System.out.println(cvs);
                      vb++;
                  }
                  
              }
              }
          }
         
      }
         
         
         
       System.out.println(vb);
         
         
         
        
       
        
        
    }
    
    
    
    public static boolean check(String mn)
    {
        
         
    char[] jh=mn.toCharArray();
         
    char L_PAREN    = '(';
    char R_PAREN    = ')';
        
    
    
    
    Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i <mn.length(); i++) {

            if      (mn.charAt(i) == L_PAREN)   stack.push(L_PAREN);
   

            else if (mn.charAt(i) == R_PAREN) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_PAREN) return false;
            }
        }
        return stack.isEmpty();
    
    
    
    
    
    
    
    
    
    
    
    
    
         
    }
    
    
    
}
