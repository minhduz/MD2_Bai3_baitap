import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter cols: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Phần tử [%d][%d] là: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%6d",array[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Nhập vào cột muốn tính tổng: ");
        int sumCols = scanner.nextInt();
        if (sumCols>col){
            System.out.println("Không có cột này");
            System.exit(0);
        } else {
            for (int i = 0; i < row; i++) {
                sum+=array[i][sumCols];
            }
        }
        System.out.printf("Tổng các phẩn tử ở cột %d là %d",sumCols,sum);
    }
}
