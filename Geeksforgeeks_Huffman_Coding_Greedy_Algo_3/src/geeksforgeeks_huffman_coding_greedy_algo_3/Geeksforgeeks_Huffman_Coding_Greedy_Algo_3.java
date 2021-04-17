package geeksforgeeks_huffman_coding_greedy_algo_3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Geeksforgeeks_Huffman_Coding_Greedy_Algo_3 {
    
    class HuffmanNode { 
  
    int data; 
    char c; 
  
    HuffmanNode left; 
    HuffmanNode right; 
} 
  class MyComparator implements Comparator<HuffmanNode> { 
    public int compare(HuffmanNode x, HuffmanNode y) 
    { 
  
        return x.data - y.data; 
    } 
} 

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
  
        // number of characters. 
        int n = 6; 
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
        
        
        PriorityQueue<HuffmanNode> q 
            = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 
        
        
    }
    
}
