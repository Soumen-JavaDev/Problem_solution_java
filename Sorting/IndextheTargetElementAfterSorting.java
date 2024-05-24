package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class IndextheTargetElementAfterSorting {
    
   
       
        static int findIndex(int[] arr, int n, int k) {
            Arrays.sort(arr);
                // for(int i=0;i<arr.length-1;i++){
                //     for(int j=0;j<arr.length-i-1;j++){
                //         if(arr[j]>arr[j+1]){
                //             int temp=arr[j];
                //             arr[j]=arr[j+1];
                //             arr[j+1]=temp;
                //         }
                //     }
                // }
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                   return i;
                }
            }
            return -1;
        }
    
        // Main function
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int n = scanner.nextInt(); // Input size of array
            int[] arr = new int[n]; // Declare array of size n
    
            // Input elements into the array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
    
            int k = scanner.nextInt(); // Input value of k
    
            // Call the function findIndex and store the result in index
            int index = findIndex(arr, n, k);
    
            // Output the result
            System.out.println(index);
    
            scanner.close(); // Close the scanner
        }
    }
    
    