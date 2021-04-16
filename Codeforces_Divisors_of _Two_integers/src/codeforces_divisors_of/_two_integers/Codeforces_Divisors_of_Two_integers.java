package codeforces_divisors_of._two_integers;
import java.util.*;
public class Codeforces_Divisors_of_Two_integers {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        List<Integer>jk=new ArrayList<Integer>();
        for(int i=0;i<t;i++)
        {
            jk.add(r.nextInt());
        }
        
        Collections.sort(jk);
        int k=0;
        System.out.print(jk.get(t-1));
        int sum=jk.get(t-1);
        if(sum==jk.get(t-2))
        {
            System.out.print(" "+jk.get(t-1));
        }
        else
        {
        for(int u=t-1;u>=0;u--)
        {
           if(sum%jk.get(u)==0&&jk.get(u)==jk.get(u-1))
            {
                System.out.print(" "+jk.get(u-1));
                //System.out.println("kfbhfhfsfh");
                k=1;
                break;
            }
           else if(sum%jk.get(u)!=0)
            {
                System.out.print(" "+jk.get(u));
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.print(" "+1);
        }
        }
        
    }
    
}
