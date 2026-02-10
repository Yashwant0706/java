package Operators.Logical_Operator;
import java.util.*;

public class LogicalNot {
    public static void main(String args[]){
        System.out.println("-----| Logical NOT (!) |-----");
        System.out.println("Enter the  numbers to check the condition : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(!(a<b)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
        
        }
    }
}
