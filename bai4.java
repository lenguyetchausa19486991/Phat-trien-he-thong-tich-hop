import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap N:");
        int n = sc.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++)
            s = s + i;
        System.out.println("tong:" + s);

    }

}
