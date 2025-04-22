package labtuan2;

public class Bai04 {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
        Vehicle xe2 = new Vehicle("Lê Minh Tín", "Ford Ranger", 3000, 250000000);
        Vehicle xe3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 175000000);

        System.out.printf("%-20s%-15s%-12s%-15s%-20s\n",
                "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        xe1.display();
        xe2.display();
        xe3.display();
    }
}
