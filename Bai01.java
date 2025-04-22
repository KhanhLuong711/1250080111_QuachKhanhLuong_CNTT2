package labtuan2;
import java.util.Scanner;
public class Bai01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
           int[]a = new int[n];
        
        for (int i = 0; i < n; i++){
             System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
         }
        
           System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Nhap x de tim vi tri: ");
        int x = sc.nextInt();
          boolean found = false;
             for (int i = 0; i < n; i++){
            if (a[i] == x){
                System.out.println("x xuat hien o vi tri: " + i);
                found = true;
            }
        }
        if (!found){
            System.out.println("Khong tim thay x trong mang");
        }

        int max = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] > max) {
                max = a[i];
            }
          } 
        System.out.println("Gia tri lon nhat: " + max);

        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min){
                min = a[i];
             }
        }
        System.out.println("Gia tri nho nhat: " + min);

        System.out.print("Vi tri phan tu co gia tri lon nhat: ");
        for (int i = 0; i < n; i++){
            if (a[i] == max){
                System.out.print(i + " ");
             } 
        }
         System.out.println();

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
          } 
        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
         }
   }
}