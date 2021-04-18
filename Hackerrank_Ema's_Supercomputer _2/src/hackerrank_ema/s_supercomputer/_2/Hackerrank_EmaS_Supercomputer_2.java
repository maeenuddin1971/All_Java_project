package hackerrank_ema.s_supercomputer._2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_EmaS_Supercomputer_2 {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       int m=r.nextInt();
       r.nextLine();
       char[][] p=new char[n][m];
       
       String[] b=new String[n];
       for(int i=0;i<n;i++)
       {
         b[i]=r.nextLine();
       }
      // System.out.println(b[1]);
       int khg=0;
       Map<String,Integer>kt=new HashMap<>();
      // Map<Integer,Map<Integer,Stack<Integer>>>kt2=new HashMap<>();
      //map Map<String,List<Integer>>kt2=new HashMap<>();
       Map<Integer,List<int[]>>map=new HashMap<>();
       
       for(int i=0;i<n-1;i++)
       {
         for(int v=0;v<m;v++)
         {
          /// System.out.println(khg+" khg");
           if(b[i].charAt(v)=='G'&&v!=0&&v!=m-1&&i!=0)
           {
            System.out.println("maeen");
            
            
        
            
            
            
            
            
               int left=v;
               int right=m-v-1;
               int up=i;
               int down=n-i;
               int small=compare(left,right,up,down);
               
               System.out.println(left+" "+right+" "+up+" "+down+" small "+small);
               khg++;
               List<int[]>jn=map.get(khg);
               int leftg=0;
               int hk=v;
               for(int hn=0;hn<small;hn++)
               {
                 if(b[i].charAt(hk-1)=='G')
                 {
                   
                   //String arisha=String.valueOf(i)+String.valueOf(hk-1);
                   
                   if(jn==null)
                   {
                     jn=new ArrayList<>();
                     jn.add(new int[]{i,hk-1});
                     map.put(khg, jn);
                   }
                   else
                   {
                     jn.add(new int[]{i,hk-1});
                   }
                   hk--;
                   leftg++; 
                 }
                 else
                 {
                   break;
                 }
               }
               hk=v;
               //System.out.println(leftg);
               
               int rightg=0;
               
               for(int hn=0;hn<small;hn++)
               {
                 if(b[i].charAt(hk+1)=='G')
                 {
                     
                   if(jn==null)
                   {
                     jn=new ArrayList<>();
                     jn.add(new int[]{i,hk+1});
                     map.put(khg, jn);
                   }
                   else
                   {
                     jn.add(new int[]{i,hk+1});
                   }  
                     
                     
                   
                   rightg++; 
                   hk++;
       
                 }
                 else
                 {
                   break;
                 }
               }
               //System.out.println(leftg+" "+rightg);
               
               hk=v;
               int mp=i;
               int upg=0;
               
               for(int hn=0;hn<small;hn++)
               {
                 if(b[mp-1].charAt(v)=='G')
                 {
                     
                   if(jn==null)
                   {
                     jn=new ArrayList<>();
                     jn.add(new int[]{mp-1,v});
                     map.put(khg, jn);
                   }
                   else
                   {
                     jn.add(new int[]{mp-1,v});
                   }  
                     
                     
                   
                   upg++; 
                   mp--;
                 }
                 else
                 {
                   break;
                 }
               }
               //System.out.println(leftg+" "+rightg+" "+upg);
               
               mp=i;
               int downg=0;
               
               
               for(int hn=0;hn<small;hn++)
               {
                 try
                 {
                 if(b[mp+1].charAt(v)=='G')
                 {
                   if(jn==null)
                   {
                     jn.add(new int[]{mp+1,v});
                     map.put(khg, jn);
                   }
                   else
                   {
                     jn.add(new int[]{mp+1,v});
                   }  
                     
                   
                   downg++; 
                   mp++;
                 }
                 else
                 {
                   break;
                 }
                 }
                 catch(Exception ju)
                 {
                     
                 }
               }
               System.out.println(leftg+" "+rightg+" "+upg+" "+downg);
               
               int df=compare(leftg,rightg,upg,downg);
               
               System.out.println(df);
               if(df>=1)
               {
                   
                 System.out.println(khg+" khg "+df);
               }
               else
               {
                 map.remove(khg);
               }
               
              
               
            // khg++;  
               
             
           }
           //khg++;
         }
       }
       System.out.println(map);
       
    }
    static int compare(int i,int j,int k,int p)
    {
      if(i<=j&&i<=k&&i<=p)
      {
          return i;
      }
      else if(j<=i&&j<=k&&j<=p)
      {
          return j;
      }
      else if(k<=j&&k<=i&&k<=p)
      {
         return k; 
      }
      else
      {
         return p;
      }
    }
}
