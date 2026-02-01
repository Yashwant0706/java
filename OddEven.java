//---- % => Modulo operator => % = remainder 
//---- (x % 2 ^==0 => even number)
//---- else => odd number
import java.util.*;

public class OddEven {
    public static void main(String args[]){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
    
}
