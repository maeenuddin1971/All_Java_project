package hackerank_day_of_the_programmer;
import java.util.Scanner;
public class Hackerank_Day_of_the_Programmer {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        //int t=r.nextInt();
        
        String gb=r.nextLine();
        int m=Integer.parseInt(gb);
        
        if(m==1918)
        {
          String b="26.09."+gb;
          System.out.println(b);  
        }
        else if((m%400==0||(m%4==0&&m%100!=0))&&m>=1918)
        {
          String b="12.09."+gb;
          System.out.println(b);
        }
        else if(m>=1918)
        {
          String mb="13.09."+gb;
          System.out.println(mb);
        }
        else if(m%4==0)
        {
         String bv="12.09."+gb;
         System.out.println(bv);
        }
        else
        {
          String mb="13.09."+gb;
          System.out.println(mb); 
        }
    }
    
}
