import java.util.*;

public class Tables {
    public static void main(String args[]){
        System.out.println("-----| Tables |-----");
        System.out.print("Enter the number of which table you want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<11; i++){
            System.out.println(i*n);
        }
    }
    
}
