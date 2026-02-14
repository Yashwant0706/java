package Patterns;
import java.util.*;

public class HalfMirrorPyramid {
    public static void main(String ars[]){
        System.out.println("-----| Right Side Half Pyramid |-----");
        System.out.print("Enter the value of n : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            //For space printing
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //For Star printing
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }  
                System.out.println(); 
            }
    }
}
