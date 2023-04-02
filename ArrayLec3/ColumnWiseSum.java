import java.util.Scanner;

public class ColumnWiseSum {

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
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(input[i][j]+ " ");
            }
            System.out.println();
        }

        ColumnWiseSum(input);
    }

    public static void ColumnWiseSum(int arr[][])
    {
        int i, j, sum = 0;

        System.out.print(
                "\nFinding Sum of each column:\n\n");

        // finding the column sum
        for (i = 0; i < arr[i].length; ++i) {
            for (j = 0; j < arr.length; ++j) {

                // Add the element
                sum = sum + arr[j][i];
            }

            // Print the column sum
            System.out.println("Sum of the column " + i
                    + " = " + sum);

            // Reset the sum
            sum = 0;
        }
    }
}
