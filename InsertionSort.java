import java.util.Scanner;
public class InsertionSort {
    public int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort b = new InsertionSort();
        int[] res = b.insertionSort(arr);
        System.out.println("Array in sorted order : ");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
