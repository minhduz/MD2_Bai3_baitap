import java.util.Scanner;

public class Bai1_Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Phẩn thử thứ %d của mảng: ",i+1);
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nCác phẩn tử của mảng đã nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d",arr[i]);
        }
        System.out.println("");
        do {
        System.out.println("");
        System.out.println("*********** MENU ***********");
        System.out.println("1. Thêm phần tử");
        System.out.println("2. Xóa phần tử");
        System.out.println("3. Xóa");
        System.out.print("Lựa chọn của bạn: ");
        int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Phần tử muốn thêm vào: ");
                    int value = scanner.nextInt();
                    System.out.print("Vị trí muốn thêm vào: ");
                    int position = scanner.nextInt();
                    arr = insert(arr,arr.length,value,position);
                    System.out.print("\nMảng sau khi thêm là: ");
                    for (int k : arr) {
                        System.out.printf("%2d", k);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("\nPhần tử muốn xóa: ");
                    int deleteKey = scanner.nextInt();
                    int pos = searchElement(arr,deleteKey);
                    if (pos < 0){
                        System.out.println("Không tìm thấy phần tử "+deleteKey);
                        break;
                    } else {
                        arr = delete(arr,pos);
                        for (int k : arr) {
                            System.out.printf("%2d", k);
                        }
                        System.out.println("");
                        break;
                    }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Mời chọn lại (1-3)");
            }
        } while (true);
    }

    static int searchElement(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int[] delete(int[] a,int pos){

        int[] newArr3 = new int[a.length-1];
        for (int i = 0; i < newArr3.length; i++) {
            if (i < pos){
                newArr3[i] = a[i];
            } else{
                newArr3[i] = a[i+1];
            }
        }
        return newArr3;
    }
    static int[] insert(int[] a, int n,int val,int pos){

        int[] newArr2 = new int[a.length+1];

        for (int i = 0; i < newArr2.length; i++) {
            if(i<pos){
                newArr2[i]=a[i];
            } else if(i==pos) {
                newArr2[i]=val;
            } else {
                newArr2[i] = a[i-1];
            }
        }
        return newArr2;
    }
}