import java.util.Scanner;

public class WaveDisplayMatrix {

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

        waveDisplay(input, rows, cols);
    }

    public static void waveDisplay(int arr[][], int rows, int columns) {
        int i, j;
        for(i=0; i<columns; i++) {
            if(i%2 == 0)
                for(j=0;j<rows;++j)
                    System.out.print(arr[j][i]+" ");
            else
                for(j=rows-1;j>=0;--j)
                    System.out.print(arr[j][i]+" ");
        }
    }

}
