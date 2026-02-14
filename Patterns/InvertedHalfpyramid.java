package Patterns;
import java.util.*;

public class InvertedHalfpyramid {
    public static void main (String args[]){
        System.out.println("------| Inverted Half Pyramid |-----");
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer loop
        for(int i=n; i>=1; i--){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
    
}
