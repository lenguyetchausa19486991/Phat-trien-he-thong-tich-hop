import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        chuoi = sc.nextLine();

        System.out.println("Chuoi duoc in hoa :");
        System.out.print(chuoi.toUpperCase());

    }
}
