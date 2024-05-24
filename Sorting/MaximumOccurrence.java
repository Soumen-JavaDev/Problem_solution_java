package Sorting;
import java.util.*;;
public class MaximumOccurrence {
    
    
        static int maximum_occurrence(int arr[], int n) {
            // Create a HashMap to store the count of each element
            Map<Integer, Integer> countMap = new HashMap<>();
            
            // Iterate through the array to count occurrences of each element
            for (int i = 0; i < n; i++) {
                int element = arr[i];
                countMap.put(element, countMap.getOrDefault(element, 0) + 1);
            }
            
            int maxCount = 0;
            int maxElement = 0;
            
            // Iterate through the HashMap to find the element with maximum occurrence
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int element = entry.getKey();
                int count = entry.getValue();
                
                if (count > maxCount) {
                    maxCount = count;
                    maxElement = element;
                }
            }
            
            return maxElement;
        }
        
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            System.out.print(maximum_occurrence(arr, n));
    
        }
    }
    
