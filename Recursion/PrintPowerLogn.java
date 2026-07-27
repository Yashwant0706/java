// Print power with stack height O(log n)
public class PrintPowerLogn {

    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x , n/2) * printPower(x , n/2);
        } else {
            return x * printPower(x , n/2) * printPower(x , n/2);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10; // example exponent
        int output = printPower(x, n);
        System.out.println(output);
    }

}
