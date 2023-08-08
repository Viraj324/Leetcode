import java.util.*;

public class bsort {
    public static  void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubblesort(arr);
        printarr(arr);
        
    }
}
