package geekforgeeks_bitwise_basic_two;

import java.util.Scanner;

public class Geekforgeeks_bitwise_basic_two {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=100;
        
        System.out.println(Integer.toBinaryString(t));
        
        int h=-100;
        
        System.out.println(Integer.toBinaryString(h));
        
        int gh=t^h;
        
        if(gh>0)
        {
          System.out.println("They have same sign");
        }
        else
        {
          System.out.println("THey have different colour");
        }
        
        
    }
    
}
