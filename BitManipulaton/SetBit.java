package BitManipulaton;
import java.util.*; 

public class SetBit {
    public static void main(String args[]){
        System.out.println("-----| Set Bit |-----");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number n : ");
            int n = sc.nextInt();
            System.out.println("Enter the position pos : ");
            int pos = sc.nextInt();
            
            int bitMask = 1<<pos;
            int newNumber = bitMask | n;
            System.out.println("The new number is : "+newNumber);
    }
}
