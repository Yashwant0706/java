package Patterns;
import java.util.*;

public class HollowRectangle {
    public static void main(String agrs[]){
        System.out.println("------| Hollow Rectangle |------");
        System.out.print("Enter the value of n : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            //Outer loop
            for(int i = 1; i<=n; i++){
                //inner loop
                for(int j=1; j<=n; j++){
                    //cell
                    if( i==1 || j==1 || i==n || j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                    System.out.println();
            }
    }
}
