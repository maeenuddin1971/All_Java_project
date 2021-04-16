package codeforces_maximum_element;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
public class Codeforces_Maximum_Element {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      
      int t=r.nextInt();
      Stack<Integer> s = new Stack<Integer>();
      Stack<Integer>s2 = new Stack<Integer> ();
      PriorityQueue<Integer> p=new PriorityQueue<Integer>();
      for(int i=0;i<t;i++)
      {
          int w=r.nextInt();
          
          if(w==1)
          {
              int fr=r.nextInt();              
              s.push(fr);
              
              
              
              if(fr>=s2.peek()||s2.isEmpty())
              {
                  s2.push(fr);
              }
              else
              {
                  s2.push(s2.peek());
              }
              
              
          }
          
          if(w==2)
          {
              int de=s.pop(); 
              if(de==s2.peek())
              {
                s2.pop();
              }
              
          }
          
          if(w==3)
          {
              //Object[] arr = s.toArray();
              //Arrays.sort(arr);
              //System.out.println(arr[arr.length-1]);
              System.out.println(s2.peek());
          }
          
      }
    }
    
}
