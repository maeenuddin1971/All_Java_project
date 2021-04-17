package hackerrank_beautiful_binary_string;

import java.util.Scanner;

public class Hackerrank_Beautiful_Binary_String {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int fd=r.nextInt();
        r.nextLine();
        String hy=r.nextLine();
        int sum=0;
        for(int y=0;y<hy.length();y++)
        {
         try
         {
         String man=hy.substring(y,y+3);
        // System.out.println(man);
         if(man.contains("010"))
         {
          //System.out.println("maeen");
          sum++;
          y=y+2;
         }
         }
         catch(Exception jh)
         {
             
         }
        }
        System.out.println(sum);
    }
    
}
