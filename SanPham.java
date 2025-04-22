package labtuan2;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Nhập thông tin sản phẩm
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    // Tính thuế nhập khẩu (10%)
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Tên SP: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}