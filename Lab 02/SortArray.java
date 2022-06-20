import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
	public static void userArray(int n) {
        Scanner key = new Scanner(System.in);
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Input elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = key.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Array after sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.print("\n");
        System.out.println("Sum=" + sum + "   Average=" + (double) sum / n);

        System.out.println();
    }
	
	public static void constArray(int n) {

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
            sum += arr[i];
        }
        System.out.println("Array before sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nArray after sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Sum=" + sum + "    Average=" + (double) sum / arr.length);
    }
	
	public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = key.nextInt();
        
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
            	userArray(n);
                break;
            case 2:
                constArray(n);
                break;
            default:
                break;
        }
    }
}
