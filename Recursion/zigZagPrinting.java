import java.util.Scanner;
public class zigZagPrinting {

    // For n = 1  pattern : 1 1 1 
    // For n = 2  pattern : 2 1 1 1 2 1 1 1 2
    // For n = 3  pattern : 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
  
  
    public static void printZigZag(int n) {
         if (n == 1) {
            for(int i=0;i<3;i++)
              {
                System.out.print(n+" ");
            }
            return;
        }
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZigZag(n);
        sc.close();
    }
}


