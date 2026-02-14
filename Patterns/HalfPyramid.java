package Patterns;
import java.util.*;

public class HalfPyramid {
    public static void main(String args[]){
        System.out.println("------| Half Pyramid |------");
        System.out.print("Enter the value of n : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i = 0; i<=n; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                    System.out.println();
            }
    }
}
