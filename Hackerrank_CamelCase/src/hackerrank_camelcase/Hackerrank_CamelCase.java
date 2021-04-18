package hackerrank_camelcase;

import java.util.Scanner;

public class Hackerrank_CamelCase {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       String ht=r.nextLine();
       
       char[] mj=ht.toCharArray();
       int sum=1;
       for(int i=0;i<ht.length();i++)
       {
         if(Character.isUpperCase(mj[i]))
         {
          sum++;
         }
       }
       System.out.println(sum);
    }
    
}
