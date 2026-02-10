package Operators.RelationalOperator;
import java.util.*;

public class NotEqualto {
    public static void main(String args[]){
        System.out.print("Enter the Two number a & b : ");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a != b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
