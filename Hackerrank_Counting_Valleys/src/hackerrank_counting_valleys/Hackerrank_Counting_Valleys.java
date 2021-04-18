
package hackerrank_counting_valleys;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hackerrank_Counting_Valleys {

    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       
       String vb=r.next();
       String hb=vb.substring(0,t);
       
       char[] nb=hb.toCharArray();
       List<String> nv=new ArrayList<>();
       nv.add(Character.toString(nb[0]));
       //System.out.println(nv.get(0));
       
       int km=-1,kj=0;
       int sum=0;
       for(int cv=0;cv<nb.length;cv++)
       {
         if(nb[cv]=='U')
         {
          kj++;
         }
         else
         {
          kj--;   
         }
         
         if(kj==0&&nv.get(0).equals("D"))
         {
          sum++;
          nv.clear();
          try
          {
          nv.add(Character.toString(nb[cv+1]));
          }
          catch(Exception jb)
          {
              
          }
         }
         else if(kj==0&&nv.get(0).equals("U"))
         {
           //System.out.println("uddin");
             nv.clear();
             
             try
             {
             nv.add(Character.toString(nb[cv+1]));
             }
             catch(Exception jb)
             {
                 
             }
           
         }
       }
       System.out.println(sum);
       
    }
    
}
