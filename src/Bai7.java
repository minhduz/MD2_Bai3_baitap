import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cột,hàng: ");
        int soHang = scanner.nextInt();



        int[][] array = new int[soHang][soHang];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soHang; j++) {
                System.out.printf("Phần tử thứ [%d][%d] là: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soHang; j++) {
                System.out.printf("%6d",array[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soHang; j++) {
                if (i==j){
                    sum1+=array[i][j];
                }
                if (i+j == array.length-1){
                    sum2+=array[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trong đường chéo chính là: "+sum1);
        System.out.println("Tổng các phần tử trong đường chéo phụ là: "+sum2);
    }
}
