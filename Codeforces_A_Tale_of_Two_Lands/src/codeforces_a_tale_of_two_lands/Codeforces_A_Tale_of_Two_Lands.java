package codeforces_a_tale_of_two_lands;

import java.util.Scanner;

public class Codeforces_A_Tale_of_Two_Lands {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        int[] p=new int[t];
        
        for(int i=0;i<t;i++)
        {
            p[i]=r.nextInt();
        }
        
        int sum=0;
        for(int i=0;i<t;i++)
        {
            int vf=p[i];
            for(int k=i+1;k<t;k++)
            {
                try
                {
                    int bf=p[k];
                    
                    
                    int neg=vf-bf;
                    
                    if(neg<0)
                    {
                        neg=neg*-1;
                         
                    }
                  //  System.out.print(neg+" ");
                    int posit=vf+bf;
                    
                    if(posit<0)
                    {
                        posit=posit*-1;
                         
                    }
                  //  System.out.print(posit+" ");
                    
                    
                    if(vf<0)
                    {
                        vf=vf*-1;
                        
                    }
                  // System.out.print("vf "+vf+" ");
                    if(bf<0)
                    {
                        bf=bf*-1;
                        
                    }
                  //  System.out.print("bf "+bf+" ");
                   
                    if(bf<=vf)
                    {
                        if(neg<posit)
                        {
                            if(neg<=bf&&posit>=vf)
                                sum++;
                        }
                        else if(neg>posit)
                        {
                            if(posit<=bf&&neg>=vf)
                                sum++;
                        }
                    }
                    else if(bf>vf)
                    {
                       if(neg<posit)
                        {
                            if(neg<=vf&&posit>=bf)
                                sum++;
                        }
                        else if(neg>posit)
                        {
                            if(posit<=vf&&neg>=bf)
                                sum++;
                        } 
                    }
                    
                    
                    
                   // System.out.print("bf="+bf+" vf="+vf+" neg"+neg+" posit"+posit);
                    //System.out.println();
                }
                catch(Exception ju)
                {
                    
                }
            }
         //   System.out.println();
        }
        System.out.println(sum);
    }
    
}
