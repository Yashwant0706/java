// fFinding  if the person is adul t or not by cross verifying tthe age 

import java.util.*;

public class ifElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}
