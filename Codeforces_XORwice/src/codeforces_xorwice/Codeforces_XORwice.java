package codeforces_xorwice;
import java.util.Scanner;
public class Codeforces_XORwice {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int jm=r.nextInt();
        for(int hq=0;hq<jm;hq++)
        {
        int a=r.nextInt();
        int b=r.nextInt();
        
        int z=a^b;
        
        System.out.println(z);
        
    }
    
}
}