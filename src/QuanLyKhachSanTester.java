import java.util.Scanner;

public class QuanLyKhachSanTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QuanLyKhachSan hs = new QuanLyKhachSan();
        int act;
        do {
            System.out.println("Chon thao tac can thuc hien:\n1. Them moi\n2. Xoa\n3. Tinh tien\n4. Thoat");
            act = checkInput(1, 4);
            if (act == 1) {
                System.out.print("Nhap ho ten: ");
                String hoTen = scan.nextLine();
                System.out.print("Nhap tuoi: ");
                int tuoi = checkInput(1, 150);
                System.out.print("Nhap so CMND: ");
                int soCMND = checkInput(1, Integer.MAX_VALUE);
                Nguoi n = new Nguoi(hoTen, tuoi, soCMND);
                System.out.print("Nhap so ngay thue: ");
                int soNgayThue = checkInput(1, Integer.MAX_VALUE);
                System.out.print("Nhap loai phong: ");
                char loaiPhong = scan.next().toUpperCase().charAt(0);
                KhachSan k = new KhachSan(soNgayThue, loaiPhong);
                hs.put(n, k);
            }
            else if(act == 2) {
                System.out.print("Nhap so CMND: ");
                int soCMND = checkInput(1, Integer.MAX_VALUE);
                hs.xoa(soCMND);
            }
            else if (act == 3){
                System.out.print("Nhap so CMND: ");
                int soCMND = checkInput(1, Integer.MAX_VALUE);
                int gia = hs.tinhTien(soCMND);
                if (gia >0){
                    System.out.println("Gia thue khach san cua ban la: " + gia);

                }
                else{
                    System.out.println("Ko tim thay khach thue voi so CMND tren.");
                }
            }
            } while (act!=4);
        hs.exit();


    }
    private static int checkInput(int a, int b){
        Scanner scan = new Scanner (System.in);
        int choice = scan.nextInt();

        while (choice<a || choice>b){
            System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
            choice = scan.nextInt();
        }

        return choice;
    }

}
