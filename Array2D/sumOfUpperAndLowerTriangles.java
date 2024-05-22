import java.util.*;

public class sumOfUpperAndLowerTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        triangleSums(n, matrix);
        sc.close();
    }

    public static void triangleSums(int n, int[][] matrix) {
        int sumLower = 0;
        int sumUpper = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sumLower += matrix[i][j];
            }
            for (int k = n - 1; k >= i; k--) {
                sumUpper += matrix[i][k];
            }
        }
        System.out.print(sumUpper + " ");
        System.out.println(sumLower + " ");
    }
}
