package Operators.Logical_Operator;
import java.util.*;

public class LogicalAND {
    public static void main(String args[]){
        System.out.println("-----| Logical AND (&&) |-----");
        System.out.println("Enter the 3 numbers to check the condition : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
        if(a<b && b<c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
