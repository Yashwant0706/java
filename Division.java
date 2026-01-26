
import java.util.*;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            System.out.println("Invalid");
            return;
        }
        if (b == 0) {
            System.out.println("infinite");
            return;
        }

        int div = a / b;
        System.out.println(div);
    }

}
