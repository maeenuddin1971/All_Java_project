package codeforces_paint_the_numbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Codeforces_Paint_the_Numbers {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int e=r.nextInt();
        
        int[] p=new int[e];
        boolean[] jk=new boolean[e];
        for(int t=0;t<e;t++)
        {
            p[t]=r.nextInt();
            jk[t]=false;
        }
        Arrays.sort(p);
        
        
        List<Integer> yh=new ArrayList<Integer>();
        yh.add(p[0]);
       // System.out.println(p[0]);
        int z=0;
        int vf=p[0];
       // jk[0]=true;
        for(int u=0;u<p.length;u++)
        {   
        vf=p[u];
        if(jk[u]==false)
        {
        z++;
        for(int y=u;y<p.length;y++)
        {
          if(p[y]%vf==0)
          {
             jk[y]=true;             
          }
          
        }
        }
        
        }
        System.out.println(z);
        
    }
    
}
