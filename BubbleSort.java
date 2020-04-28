import java.util.Scanner;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int temp;
            int swap=0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap+=1;
                }
            }
            if(swap==0){
                break;
            }
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
        BubbleSort b = new BubbleSort();
        int[] res = b.bubbleSort(arr);
        System.out.print("Array in sorted order : ");
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
