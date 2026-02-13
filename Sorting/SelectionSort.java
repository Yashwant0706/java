package Sorting;

public class SelectionSort {
    public static void printArray(int array[]){
        for(int i =0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(); // newline for better readability
    }
    public static void main(String args[]){
        System.out.println("------| Selection Sort |------");
        int array[] = {9, 6, 8, 5, 4};
        System.out.println("Original Array:");
        printArray(array);

        for(int i = 0; i<array.length-1; i++){
            int smallest = i; //Assume the smallest element is the first element of the unsorted part
            for(int j = i+1; j<array.length; j++){
                if(array[smallest]>array[j]){
                    smallest = j; //Update the index of the smallest element
                }
                
            }
            int temp = array[smallest];
            array[smallest] = array[i]; 
            array[i] = temp;
    }   
        System.out.println("Sorted Array :");
        printArray(array);
}
}