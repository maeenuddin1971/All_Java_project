package codeforces_palindrome_magic;
import java.util.*;
public class Codeforces_palindrome_magic {

    private static void result() {
        System.out.println(gv3.size());
    }

    
    
   
    
    Map<String,Integer>bn=new HashMap<String,Integer>();
    static List<String>gv=new ArrayList<String>();
    static List<String>gv2=new ArrayList<String>();
    static List<String>gv3=new ArrayList<String>();
    
    
    
    
    
    public static void main(String[] args) throws java.lang.Exception{
       Scanner r=new Scanner(System.in);
       String A=r.nextLine();
       String B=r.nextLine();
       
       char[] m=A.toCharArray();
     //  char[] d=B.toCharArray();
       
       
       String sub;
       
       
       for(int v=0;v<m.length;v++)
       {
           for(int sd=1;sd<=m.length-v;sd++)
           {
               sub=A.substring(v,v+sd);
               check(sub);
           }
       }
       
       
        for(int v=0;v<B.length();v++)
       {
           for(int sd=1;sd<=B.length()-v;sd++)
           {
               sub=B.substring(v,v+sd);
               check2(sub);
           }
       }
       
       finalw();
       result();
    }
    
    public static void check(String vb)
    {
        String reverse=new StringBuffer(vb).reverse().toString();
        if(vb.equals(reverse))
        {
           // System.out.println(vb);
            if(!gv.contains(vb))
            {
                gv.add(vb);
               // System.out.println(vb);
            }
        }
    }

    private static void check2(String vb) {
        String reverse=new StringBuffer(vb).reverse().toString();
        if(vb.equals(reverse))
        {
            //System.out.println(vb);
            
             if(!gv2.contains(vb))
            {
                gv2.add(vb);
               // System.out.println(vb);
            }
            
        }
    }
    
    
    
    
    
    
    
    
     private static void finalw() {
         String qw;
        for(int xc=0;xc<gv.size();xc++)
        {
            for(int as=0;as<gv2.size();as++)
            {
                qw=gv.get(xc).concat(gv2.get(as));
                
                if(!gv3.contains(qw))
                {
                gv3.add(qw);
              //  System.out.println(qw);
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
}
