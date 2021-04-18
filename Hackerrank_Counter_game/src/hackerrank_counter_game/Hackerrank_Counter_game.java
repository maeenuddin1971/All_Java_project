package hackerrank_counter_game;

import java.util.Scanner;

public class Hackerrank_Counter_game {
public static void main(String[] args) 
{ 
   Scanner r=new Scanner(System.in);
   int vg=r.nextInt();
   for(int uh=0;uh<vg;uh++)
   {
   long n=r.nextLong();
   
   int c=0;
   
   //System.out.println(c);
   //int hd=g(13);
   //System.out.println(hd);
   
   
   
   
   if((g(n-1)&1)==1)
   {    
   System.out.println("Louise") ;
   
   }
   else System.out.println("Richard");
   
   }
} 

public static int g(long  t)
{
  int count = 0 ;
   while(t!=0)
   {
     System.out.println(t);
     if((t&1)==1)
     {
      count++;   
     }
     t>>=1;
   }
   System.out.println("count is "+count);
    return count ;  
}
}
