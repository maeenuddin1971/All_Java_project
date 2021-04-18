package hackerrank_extra_long_factorials;
import java.math.BigInteger;
import java.util.Scanner;
public class Hackerrank_Extra_Long_Factorials {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        BigInteger f = new BigInteger("1");
        
        for(int i=2;i<=t;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
    
}
