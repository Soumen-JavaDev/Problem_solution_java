package Sorting;
import java.util.*;
public class SmallestGreaterElementsBubbleSort {
   
      public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    
        public static int[] SmallestGreaterElements(int[] arr) {
            int n = arr.length;
            int[] sortedArr = Arrays.copyOf(arr, n);
            bubbleSort(sortedArr);
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    if (arr[i]  <sortedArr[j]) {
                        
                            result[i] = sortedArr[j];
                            found = true;
                            break;
                        }
                    
                }
                if (!found) {
                    result[i] = -10000000;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int[] ans = SmallestGreaterElements(arr);
            for(int a : ans) {
                System.out.print(a + " ");
            }
            sc.close();
        }
    }