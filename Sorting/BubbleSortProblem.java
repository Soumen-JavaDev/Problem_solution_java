package Sorting;
import java.util.*;
public class BubbleSortProblem {
   

    public static void swap(int[] arr, int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
       arr [j]=temp;
        
    }
    static void bubbleSort(int a[], int n)
    {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    count++;
                }
            }
            
        }

        System.out.println(count);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
       bubbleSort(arr1, n);
       sc.close();
    }
}
