//Q2. print no from 1 to 5
import java.util.*;
public class Main{
    
    public static void printNumbers(int n) {
        if(n == 6) {
         return;
        }
      System.out.println(n);
      printNumbers(n+1);
    }
    public static void main(String args[]){
      int n=1;//initialization
      printNumbers(n);
    }
}