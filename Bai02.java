package labtuan2;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(dai, rong);

        System.out.println("\n" + hcn.toString());
    }
}