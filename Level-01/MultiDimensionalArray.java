import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int column = sc.nextInt();

        // Create  2D array
        int[][] Matrix = new int[rows][column];

   
        System.out.println("Enter the elements of  matrix  : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                Matrix[i][j] = sc.nextInt();
            }
        }

    
        int[] arr = new int[rows * column];
        int index = 0;

  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[index++] = Matrix[i][j];
            }
        }

    
        System.out.println("The 2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display 1D array
        System.out.println("The 1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
