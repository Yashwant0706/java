package Patterns;
import java.util.*;

public class HalfNumberPyramid {
    public static void main(String args[]){
        System.out.println("-----| Half Number Pyramid |-----");
        System.out.print("Enter the value of n : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    }
}
