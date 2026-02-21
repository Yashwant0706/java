package Sorting;

public class Insertionsort {
    public static void printArray(int array[]){
        for(int i=0; i<array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        System.out.println("-----| Insertion Sort |-----");
        int array[] = {7, 8, 2, 1, 3};
        System.out.print("Original array : ");
        printArray(array);

        //Insertion Sort
        for(int i=0; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && array[j]>current){
                //Keep Swapping
                array[j+1] = array[j];
                j--;
            }
                array[j+1] = current;
        }
            System.out.print("Sorted array   : ");
            printArray(array);
    }
}
