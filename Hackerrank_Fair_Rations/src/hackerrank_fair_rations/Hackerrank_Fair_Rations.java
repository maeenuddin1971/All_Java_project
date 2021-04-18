package hackerrank_fair_rations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Fair_Rations {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        int[] p=new int[t];
        
        List<Integer>m=new ArrayList<>();
        Map<Integer,Integer>mn=new HashMap<>();
        List<Integer>s=new ArrayList<>();
        for(int dw=0;dw<t;dw++)
        {
            p[dw]=r.nextInt();
            if(p[dw]%2!=0)
            {
               m.add(p[dw]);
               mn.put(p[dw],dw+1);
               s.add(dw+1);
            }     
        }
        //System.out.println(mn);
        int sum=0;
        if(m.size()%2==0)
        {
           //System.out.println(); 
            
            for(int y=0;y<s.size();y=y+2)
            {
              int dis=s.get(y+1)-s.get(y);
              sum=sum+2*dis;
            }
            System.out.println(sum);
           
        }
        else
        {
           System.out.println("NO");  
        }
        
        
    }
    
}
