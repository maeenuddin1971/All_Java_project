package hackerrank_grid_challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hackerrank_Grid_Challenge {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        Map<Character,Integer>pk=new HashMap<>();
        PriorityQueue<String>mj=new PriorityQueue<>();
        int z=1;
        for(Character h='a';h<='z';h++)
        {
           pk.put(h,z);
           z++;
        }
        
        //System.out.println(pk);
        r.nextLine();
        for(int hg=0;hg<n;hg++)
        {
         String gt=r.nextLine();
         
         mj.add(gt);
         
         
         
        }
        System.out.println(mj);
    }
    
}
