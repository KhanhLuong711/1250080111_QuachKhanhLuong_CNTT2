package labtuan2;

import java.util.Scanner;

public class Bai03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(1250080111, "Quach Khanh Luong", 6.5f, 8.5f);

        SinhVien sv2 = new SinhVien(1250080061, "Pham Hoang", 7.5f, 8.0f);

        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSV(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap ho ten cua sinh vien sv3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(Float.parseFloat(sc.nextLine()));

        System.out.printf("%-6s %-20s %6s %8s %8s\n", "masv", "hoten", "diemlt", "diemth", "diemtb");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}