import java.util.Scanner;

public class baif2 {

    public static void main(String[] args) {
        int temp;
        boolean p = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so cần kiem tra");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                p = false;
                break;

            }
        }
        if (p)
            System.out.println(num + "la so nguyen to");
        else
            System.out.println(num + "khong la so nguyen to");
    }

}