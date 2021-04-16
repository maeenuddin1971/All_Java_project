package codeforces_multiply_by_2._divide_by_6;

import java.util.Scanner;

public class Codeforces_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int x=r.nextInt();
       int z=0;
       int a=x;
       int ct=0;
       for(;;)
       {
            if(a==1)
				break;
			if(a%6==0)
            {
			   a/=6;
               System.out.println(a);
            }
			else
				a*=2;
			ct++;
			if(ct>20000){
				//flag=1;
				break;
			}
         
       }
       System.out.println(ct);
       
    }
    
}
