// "static void main" must be defined in a public class.
import java.util.*;
public class TwoDimensionalArray {
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
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(input[i][j] + " ");
            }

            System.out.println();
        }
    }
}