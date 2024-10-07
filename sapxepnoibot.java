import java.util.Scanner;

public class sapxepnoibot {
        public static void sapxep(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped) {
                inmang(arr, n, i + 1);
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void inmang(int[] arr, int n, int buoc) {
        System.out.print("Buoc " + buoc + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        sapxep(arr, n);
        
        scanner.close();
    }
}
