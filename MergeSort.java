import java.util.*;

public class MergeSort {
    public void mergeSort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private void merge(int[] arr,int low,int mid,int high){
        int s=high+1;
        int[] crr=new int[s];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high) {
            if (arr[i] <= arr[j]) {
                crr[k] = arr[i];
                i += 1;
                k += 1;
            } else {
                crr[k] = arr[j];
                j += 1;
                k += 1;
            }
        }
        if(i<=mid){
            while(i<=mid) {
                crr[k] = arr[i];
                i += 1;
                k += 1;
            }
        }else{
            while(j<=high){
                crr[k]=arr[j];
                j+=1;
                k+=1;
            }
        }
        int p=0;
        for (int l = low; l <= high; l++) {
            arr[l]=crr[p];
            p=p+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array : "+ Arrays.toString(arr));
        MergeSort m=new MergeSort();
        m.mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }
}
