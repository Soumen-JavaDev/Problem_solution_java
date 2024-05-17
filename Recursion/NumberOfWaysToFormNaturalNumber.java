// import java.io.*;
import java.util.*;
public class NumberOfWaysToFormNaturalNumber {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
        input.close();
    }
    public static long ways(int n, int i){
         if(n==0)return 1;
         else if(n<0)return 0;
         else{
            long count=0;
            for( ;i<=n;i++){
                count +=ways(n-i,i+1);
            }
            return count;
         }

    }
}