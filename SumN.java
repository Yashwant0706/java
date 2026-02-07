import java.util.*;

public class SumN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----| Sum of first n natural numbers |-----");
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        int sum = 0; 

        for ( int i =0; i<n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
