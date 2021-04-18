package hackerrank_circular_array_rotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Circular_Array_Rotation {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       int m=r.nextInt();
       int z=r.nextInt();
       
       Map<Integer,Integer>nm=new HashMap<>();
       int[] me=new int[t];
       for(int u=0;u<t;u++)
       {
        me[u]=r.nextInt();
        m=m%t;
        if(u+m<t)
        nm.put(u+m,me[u]); 
        else
        {
         int b=(u+m)-t;
         nm.put(b,me[u]);
        }
       }
       
       for(int u=0;u<z;u++)
       {
           int s=r.nextInt();
         System.out.println(nm.get(s));  
       }
       
    }
    
}
