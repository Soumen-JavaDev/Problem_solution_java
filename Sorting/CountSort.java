package Sorting;

/**
 * CountSort
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr={3,4,6,2,9,8,1,0,5,7};
        int n=arr.length;
        //find the max element
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }

        //careat a max element +1 size array
        int[] domy=new int[max+1];
        for(int i=0;i<n;i++){
          int j=arr[i];
          domy[j]++; //increment the valu index size
        }
        int k=0;
        for(int i=0;i<domy.length;){
             if(domy[i]==0)i++;
             else{
                arr[k++]=i;
                domy[i]--;
             }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }



    }
    
}