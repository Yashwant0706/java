package Sorting;

public class BubbleSort {
    public static void printArray(int Array[]){
        for( int i=0; i<Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println(); // newline for better readability
    }
    public static void main(String[] args) {
        System.out.println("-----| Bubble Sort Algorithm |-----");
        int Array[] = {5, 1, 4, 2, 8};
        System.out.println("Original Array:");
        printArray(Array);

        // Bubble Sort Algorithm
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    // Swap Array[j] and Array[j + 1]
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        printArray(Array);
    }
    
}
