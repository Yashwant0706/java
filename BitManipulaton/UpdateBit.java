package BitManipulaton;
import java.util.*;

public class UpdateBit {
    public static void main(String args[]){
        System.out.println("-----| Update Bit |-----");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number n : ");
            int n = sc.nextInt();
            System.out.println("Enter the position pos : ");
            int pos = sc.nextInt();
            System.out.println("Enter the Operation (0 or 1)");
            int operation = sc.nextInt();
            int bitMask = 1<<pos; 
            
            if (operation == 1){
                //Set 
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }
            else{
                //Cleqr
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }
    }
}
