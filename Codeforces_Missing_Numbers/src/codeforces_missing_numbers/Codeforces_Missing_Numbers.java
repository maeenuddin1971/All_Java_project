package codeforces_missing_numbers;
import java.util.*;
public class Codeforces_Missing_Numbers {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      int y=r.nextInt();
      int[] m=new int[y/2];
      List<Integer>v=new ArrayList<Integer>();
      for(int i=0;i<m.length;i++)
      {
          m[i]=r.nextInt();
      }
      int p=0;
      //int h=90;
      int qw=1;
      int sum;
      sum=m[0];
      int cv;
      int k=1;
      
      
      
      
      if(p==0)
      for(int zx=0;zx<y/2;zx++)
      {
          k=1;
         sum=m[zx];
      
      for(int sw=0;sw<=1000000;sw++)
      {
        //  qw=1;
        
          cv=sum+k;
          
         // System.out.println(cv);
         
          if(maeen(Double.valueOf(cv))==true)
          {
              // System.out.println(cv);
             //  break;
             if(maeen(Double.valueOf(cv-m[zx]))==true)
             {
               // System.out.println(cv-m[zx]);
                //System.out.println(cv);
                 v.add(cv-m[zx]);
                 v.add(cv);
                 
                 if(cv-m[zx]<0||cv<0)
                 {
                     p=1;
                 }
                 
                 break;
             }
          }
          
          k++;
          
          if(sw==1000000)
          {
              p=1;
              break;
          }
         
      }
      
      
      
      }
      
      
      
       for(int g=0;g<v.size();g++)
      {
          try
          {
           if((-v.get(g)+v.get(g+1))<0)
           {
               p=1;
               break;
           }
          }
          catch(Exception df)
          {
              
          }
      }
      
      
      
      
      
      if(p==0)
      {
      System.out.println("Yes");
      System.out.print(v.get(0)+" ");
      for(int g=0;g<v.size();g++)
      {
          try
          {
           System.out.print(-v.get(g)+v.get(g+1)+" ");
          }
          catch(Exception df)
          {
              
          }
      }
      }
      else
          System.out.println("No");
    //  }
      
    }
    
    
    
    
    static boolean maeen(double x)
    {
        double sr=Math.sqrt(x);
        return ((sr-Math.floor(sr))==0);
    }
    
    
    
    
    
}
