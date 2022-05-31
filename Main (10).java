//Q1. Print numbers from 5 to 1.
import java.util.*;
public class Main{
    
    public static void printNumbers(int n) {
        if(n == 0) {
         return;
        }
      System.out.println(n);
      printNumbers(n-1);
    }
    public static void main(String args[]){
      int n=55;
      printNumbers(n);
    }
}
