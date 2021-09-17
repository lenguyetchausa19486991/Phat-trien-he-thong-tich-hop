import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class bai2phanso {

    double a;
    double b;
    static double tu, mau;

    bai2phanso() {
    };

    bai2phanso(double x, double y) {
        a = x;
        b = y;
    }

    public static void tong(bai2phanso c, bai2phanso d) {
        tu = (c.a * d.b) + (d.a * c.b);
        mau = d.a * d.b;
    }

    public static void hieu(bai2phanso c, bai2phanso d) {
        tu = (c.a * d.b) - (d.a * c.b);
        mau = d.a * d.b;
    }

    public static void tich(bai2phanso c, bai2phanso d) {
        tu = c.a * d.a;
        mau = c.b * d.b;
    }

    public static void thuong(bai2phanso c, bai2phanso d) {
        tu = (c.a * d.b);
        mau = c.b * d.a;
    }

    public static Double UCLN(double c, double d) {
        while (c != d) {
            if (c > d)
                c = c - d;
            else
                d = d - c;
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String s;
        double x, y;
        bai2phanso p1, p2;
        System.out.print("nhap p1:");
        System.out.print(" \n nhap tu:");
        s = d.readLine();
        x = Double.parseDouble(s);
        System.out.print("nhap mau");
        s = d.readLine();
        y = Double.parseDouble(s);
        p1 = new bai2phanso(x, y);
        System.out.print("\n");

        System.out.print("nhap p2:");
        System.out.print(" \n nhap tu:");
        s = d.readLine();
        x = Double.parseDouble(s);
        System.out.print("nhap mau");
        s = d.readLine();
        y = Double.parseDouble(s);
        p2 = new bai2phanso(x, y);
        System.out.print("\n");

        System.out.print("phan tu thu 1:" + p1.a + "/" + p1.b);
        System.out.print("\n phan tu thu 2:" + p2.a + "/" + p2.b);

        System.out.print("\n");
        Double usc;
        bai2phanso.tich(p1, p2);
        usc = bai2phanso.UCLN(bai2phanso.tu, bai2phanso.mau);
        System.out.print("\n tich la:" + bai2phanso.tu / usc + "/" + bai2phanso.mau / usc);
        bai2phanso.tong(p1, p2);
        usc = bai2phanso.UCLN(bai2phanso.tu, bai2phanso.mau);
        System.out.print("\n tong la:" + bai2phanso.tu / usc + "/" + bai2phanso.mau / usc);
        bai2phanso.hieu(p1, p2);
        usc = bai2phanso.UCLN(bai2phanso.tu, bai2phanso.mau);
        System.out.print("\n hieu la:" + bai2phanso.tu / usc + "/" + bai2phanso.mau / usc);
        bai2phanso.thuong(p1, p2);
        usc = bai2phanso.UCLN(bai2phanso.tu, bai2phanso.mau);
        System.out.print("\n thuong la:" + bai2phanso.tu / usc + "/" + bai2phanso.mau / usc);

    }

}