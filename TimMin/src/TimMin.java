import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int dodai = scanner.nextInt();
        while (dodai > 20) {
            System.out.println("nhap lai do dai mang");
            dodai = scanner.nextInt();
        }
        System.out.println("nhap ptu mang");
        int[] arr = new int[dodai];
        int i = 0;
        while (i < arr.length) {
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]){
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
