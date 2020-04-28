import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    private int partition(int[] arr,int lower,int upper){
        int pivot=arr[lower];
        int down=lower+1;
        int up=upper;
        while(down<=up){
            while(arr[down]<pivot && down<upper){
                down=down+1;
            }
            while(arr[up]>pivot){
                up=up-1;
            }
            if(down<up){
                int temp=arr[down];
                arr[down]=arr[up];
                arr[up]=temp;
                down+=1;
                up-=1;
            }else
                break;
        }
        arr[lower]=arr[up];
        arr[up]=pivot;
        return up;
    }
    public void quickSort(int[] arr,int lower,int upper){
        if(lower<upper){
            int pivotindex=partition(arr,lower,upper);
            quickSort(arr,lower,pivotindex-1);
            quickSort(arr,pivotindex+1,upper);
        }
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
        QuickSort q=new QuickSort();
        System.out.println("unsorted"+ Arrays.toString(arr));
        q.quickSort(arr,0,arr.length-1);
        System.out.println("sorted"+Arrays.toString(arr));
    }
    //abhishek jaiswal
    //roll no.-02
    //section-D

}