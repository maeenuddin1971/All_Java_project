
package hackerrank_beautiful_quadruples;


import java.util.Scanner;
public class Hackerrank_Beautiful_Quadruples {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        /*int x=r.nextInt();
        int y=r.nextInt();
        int z=r.nextInt();
        int g=r.nextInt();*/
        maeen(2,2,1,1);
    }
    
    static void maeen(int x,int y,int z,int d)
    {
       int bd=(x|y|z|d)&(~x|~y|~z|~d);
       System.out.println(bd);
    }
    
    
}
