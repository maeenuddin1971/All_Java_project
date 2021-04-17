package codeforces_replacing_elements;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Codeforces_Replacing_Elements {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int f=r.nextInt();
        for(int gc=0;gc<f;gc++)
        {
        int n=r.nextInt();
        int h=r.nextInt();
        
        int[] p=new int[n];
        
        int gf=0;
        Map<Integer,Integer>ph=new HashMap<>();
        int hd=0;
        for(int uh=0;uh<n;uh++)
        {
          p[uh]=r.nextInt();
          
          if(p[uh]>h)
          {
            gf=1;
          }
          
        }
        //System.out.println(ph);
        if(gf==0)
        {
            System.out.println("Yes");
        }
        else
        {
          Arrays.sort(p);
          
          if(p[0]+p[1]<=h)
          {
            System.out.println("Yes");
          }
          else
          {
              System.out.println("No");
          }
          
        }
        
        
    }
    
}
}