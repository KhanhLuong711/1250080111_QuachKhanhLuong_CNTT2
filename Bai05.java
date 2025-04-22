package labtuan2;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap();

        System.out.println("Thong tin san pham");
        sp.xuat();
    }
}