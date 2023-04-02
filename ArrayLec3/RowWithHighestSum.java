// "static void main" must be defined in a public class.
import java.util.*;
public class RowWithHighestSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols");
        int cols = sc.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                input[i][j] = sc.nextInt();
            }
        }
        // print the elements

       /* for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(input[i][j] + " ");
            }

            System.out.println();
        }*/

        System.out.print("Max row sum is: " + HighestSumArray(input, rows,cols));
    }

    public static int HighestSumArray(int[][] matrix, int rows, int cols)
    {
        int maxSum = 0;
        for(int i=0;i<rows;i++)
        {
            int sum = 0;
            for(int j=0;j<cols;j++)
            {
               sum = sum + matrix[i][j];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}