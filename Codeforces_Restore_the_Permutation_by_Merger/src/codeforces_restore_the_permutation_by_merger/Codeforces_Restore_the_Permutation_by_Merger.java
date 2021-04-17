package codeforces_restore_the_permutation_by_merger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Restore_the_Permutation_by_Merger {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int u=0;u<n;u++)
        {
        int t=r.nextInt();
        
        int[] p=new int[t*2];
        Map<Integer,Integer>km=new HashMap<>();
        
        for(int i=0;i<t*2;i++)
        {
            p[i]=r.nextInt();
            //System.out.println(p[i]);
            if(!km.containsKey(p[i]))
            {
               System.out.print(p[i]+" "); 
               km.put(p[i], i);
            }
        }
        System.out.println();
        
    }
    
}
}