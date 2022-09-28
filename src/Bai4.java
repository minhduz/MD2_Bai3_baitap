import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập vào số cột: ");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d] là: ",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.printf("%6d",arr[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong mảng là: %d",max);
    }
}
