package hackerrank_cats_and_a_mouse;
import static java.lang.Math.abs;
import java.util.Scanner;
public class Hackerrank_Cats_and_a_Mouse {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        for(int i=0;i<t;i++)
        {
         int f=r.nextInt();
         int v=r.nextInt();
         int y=r.nextInt();
         
         int cv=abs(f-y);
         int sx=abs(v-y);
         
         if(cv==sx)
         {
             System.out.println("Mouse C");
         }
         else if(cv>sx)
         {
             System.out.println("Cat B");
         }
         else
         {
          System.out.println("Cat A");   
         }
         
        }
    }
    
}
