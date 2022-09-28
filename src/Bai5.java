import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử thứ %d là: ",i+1);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j : arr) {
            System.out.printf("%3d",j);
            if (j < min){
                min = j;
            }
        }
        System.out.println("");
        System.out.printf("Phần tử nhỏ nhất của mảng là: %d",min);
    }
}
