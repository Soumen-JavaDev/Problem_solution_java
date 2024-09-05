import java.util.Arrays;

/**
 * removeDublicat
 */
public class removeDublicat {

    public static void main(String[] args) {
        int []arr={1,3,5,3,1,2,5,1};
        Arrays.sort(arr);
        int i=2;//i=1,arr[i-1]; remove all only 1 elment;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i-2]){
               arr[i]=arr[j];
              i++;
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr[k]);
        }
    }
}