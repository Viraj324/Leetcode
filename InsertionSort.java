import java.util.Scanner;

public class InsertionSort {
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = currentElement;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Inputted array : ");
        printarr(arr);
        System.out.println("The sorted array : ");
        insertionsort(arr);
        printarr(arr);
    }
}
