import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int arr[]){
        int pos = 0;
        for(int i = 0;i<arr.length-1;i++){
            pos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[pos]>arr[j]){
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Inputed array : ");
        printarr(arr);
        System.out.println("The sorted  array : ");
        selectionsort(arr);
        printarr(arr);
    }
}
