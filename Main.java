package qlNhanVien;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean tiepRuc = true;
        QlNhanVien qlNhanVien = new QlNhanVien();
        do {
            System.out.println("mời bạn nhập các chức năng ");
            System.out.println("1: thêm mới nhân viên\n" +
                    "2: hiện thị danh sách nhân viên\n" +
                    "3: thoát chương trình ");
            int hanhdong = new Scanner(System.in).nextInt();
            switch (hanhdong){
                case 1:
                    qlNhanVien.addNhanVien();
                    break;
                case 2:
                    qlNhanVien.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    System.out.println("thoát chương trình");
                    tiepRuc = false;
                    break;
                default:
                    System.out.println("nhập sai thông tin đề nghị nhập lại");
            }
        }while (tiepRuc);

    }
}
