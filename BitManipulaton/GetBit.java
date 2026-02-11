package BitManipulaton;
import java.util.*;

public class GetBit {
    public static void main(String args[]){
        System.out.println("-----| Get Bit |-----");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number n : ");
            int n = sc.nextInt();
            System.out.println("Enter the position pos : ");
            int pos = sc.nextInt();
            
            int bitMask = 1<<pos;
            if((bitMask & n) == 0){
                System.out.println("Bit was zero");
            }
            else{
                System.out.println("Bit was one");
        
        }
    }
}
