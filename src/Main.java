import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Current Array is " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting is " + Arrays.toString(arr));
    }
    public static int[] insertionSort(int [] list){
        for (int j = 1; j < list.length ; j++) {
            int temp= list[j];
            int i;
            for (i = j-1; i >=0&&list[i]>temp ; i--) {
                list[i+1]= list[i];
            }

            list[i+1]= temp;
        }
        return list;
    }
}
