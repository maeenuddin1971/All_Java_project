package hackerrank_grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_grade {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        
        List<Integer>mn=new ArrayList<Integer>();
        
        for(int i=0;i<t;i++)
        {
            mn.add(r.nextInt());
            if(mn.get(i)>37)
            {
             float yr=mn.get(i)/5;
             float we=(float)mn.get(i)/5;
             float cv=we-yr;
             if(cv>0.59)
             {
             int ds=mn.get(i)/5;
             ds++;
             
             mn.set(i,ds*5);
             }
                
            }
            System.out.println(mn.get(i));
        }
       // System.out.println(mn);
        
        
    }
    
}
