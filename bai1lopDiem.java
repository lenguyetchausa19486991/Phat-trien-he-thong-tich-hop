import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;

public class bai1lopDiem {
    int x;
    int y;

    void nhap(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void xuat() {
        System.out.println("toa do:(" + x + "," + y + ") ");

    }

    public void khoangcach() {
        double c;
        c = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        System.out.print("Khoang cach :" + c);
    }

    public static void main(String[] args) {
        bai1lopDiem a = new bai1lopDiem();

        a.nhap(4, 6);

        a.xuat();

        a.khoangcach();

    }
}
