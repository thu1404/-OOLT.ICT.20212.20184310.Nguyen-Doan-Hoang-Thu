import java.util.Scanner;

public class Add2Matrices {
	public static void constArray(int row, int col) {
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = (int) Math.random() * 20 + 10;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = (int) Math.random() * 30 + 5;
            }
        }
        System.out.println("Matrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Matrix 2:");
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.print("\n");
        }
         System.out.println("Sum of two matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void userArray(int row, int col) {
        Scanner key = new Scanner(System.in);
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum= new int[row][col];
        System.out.println("Input elements for matrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = key.nextInt();
            }
        }
        System.out.println("Input elements for matrix 2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = key.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Matrix 2:");
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int row, col;
        System.out.println("Input rows of matrix : ");
        row = key.nextInt();
        System.out.println("Input columns of matrix : ");
        col = key.nextInt();
        int choose;
        System.out.println("Choose the options:");
        System.out.println("1. Array by user");
        System.out.println("2. Constant array");
        do {
            System.out.println("Enter option: ");
            choose = key.nextInt();
        } while (choose != 1 && choose != 2);
        switch (choose) {
            case 1:
                userArray(row, col);
                break;
            case 2:
                constArray(row, col);
                break;
            default:
                break;
        }
    }
}
