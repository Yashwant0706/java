package Operators.RelationalOperator;
import java.util.*;

public class Greater {
    public static void main(String args[]){
        System.err.println("Enter the Two number a & b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        if(a>b){
            System.err.println("True");
        }
        else{
            System.err.println("False");
        }
    }
}
