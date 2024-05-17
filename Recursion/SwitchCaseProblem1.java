import java.util.Scanner;

public class SwitchCaseProblem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        switch (n) {
            case 55:
                System.out.println("yes");
                break;
        
            default:
            System.out.println("no");
                break;
        }
        sc.close();
    }
}
