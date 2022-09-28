import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        String arr = scanner.nextLine();
        System.out.print("Ký tự muốn tìm: ");
        char c = scanner.next().charAt(0) ;
        int count = 0;

        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == c){
                count++;
            }
        }
        if (count<=0){
            System.out.printf("Không tồn tại ký tự %c trong chuỗi %s",c,arr);
            System.exit(0);
        }
        System.out.printf("Ký tự %c xuất hiện trong chuỗi %s là %d",c,arr,count);
    }
}
