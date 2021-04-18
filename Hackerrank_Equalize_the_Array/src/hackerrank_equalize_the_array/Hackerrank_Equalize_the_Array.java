package hackerrank_equalize_the_array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Equalize_the_Array {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        int[] p=new int[t];
        Map<Integer,Integer>v=new HashMap<>(); 
        int sum=0;
        for(int i=0;i<t;i++)
        {
         p[i]=r.nextInt();
         
         if(!v.containsKey(p[i]))
         {
          v.put(p[i],1);
          if(sum<1)
          {
           sum=1; 
          }
         }
         else
         {
          v.put(p[i],v.get(p[i])+1);
          if(sum<v.get(p[i]))
          {
            sum=v.get(p[i]);
            
          }
          
         }
                 
        }
        System.out.println(p.length-sum);
    }
    
}
