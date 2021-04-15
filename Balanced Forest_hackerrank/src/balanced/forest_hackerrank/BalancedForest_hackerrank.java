package balanced.forest_hackerrank;

import java.util.*;
import java.util.HashMap;

public class BalancedForest_hackerrank {
    tree root;
    public static void main(String[] args) {
       BalancedForest_hackerrank fg=new BalancedForest_hackerrank();
       fg.root=new tree(1);
       Scanner r=new Scanner(System.in);
       HashMap<Integer,String>hm=new HashMap<Integer,String>();
       int p=r.nextInt();
       
    }
    
}
class tree
{
    int data;
    tree left,right;
    
    public tree(int i)
    {
        data=i;
        left=right=null;
    }
}
