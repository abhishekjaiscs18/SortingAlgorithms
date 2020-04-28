import java.util.Scanner;

public class SelectionSort {
    public int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int temp;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex){
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        SelectionSort s=new SelectionSort();
        int[] res=s.selectionSort(arr);
        System.out.print("Array in sorted order : ");
        for (int i:res) {
            System.out.print(i+" ");
        }

    }
}
