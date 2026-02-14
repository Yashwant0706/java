package Patterns;
import java.util.*;

public class InvertedHalfNumberPyramid {
    public static void main(String args[]){
        System.out.println("-----| Inverted Half Number Pyramid |-----");
        System.out.print("enetr the value of n : ");
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
