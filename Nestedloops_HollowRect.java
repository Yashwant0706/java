public class Nestedloops_HollowRect {
    public static void main(String[] args) {
        int n = 5; //rows
        int m = 10; //columns

        //Outerloop
        for (int i = 1; i <= n; i++) {
            
            //Innerloop
            for (int j = 1; j <= m; j++) {
                
                //cell
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}
    

