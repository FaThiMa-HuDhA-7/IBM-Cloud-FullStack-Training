
import java.util.*;

public class arrayQ {

    public static int[] rotate(int[] arr, int k, int size) {
        int[] result = new int[size];

        int j = 0;

        for (int i = k; i < size; i++) {
            result[j++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            result[j++] = arr[i];
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index:");
        int k = sc.nextInt();

        int[] output = rotate(arr, k, size);

        System.out.println("Rotated Array:");
        for (int num : output) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
