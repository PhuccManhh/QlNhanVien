package qlNhanVien;

import java.util.Scanner;

public class QlNhanVien {
    private Employee[] listnhanvien;
    private int soLuongNhanVien;
    private int tongSoNhanVien;
    public QlNhanVien() {
        this.tongSoNhanVien = 100;
        this.listnhanvien = new Employee[this.tongSoNhanVien];
        this.soLuongNhanVien = 0;
    }

    public void addNhanVien(){
        // nhập loại nhân viên có thêm
        System.out.println("nhập vào nhân viên muốn thêm: 0) có kinh nghiệm 1) fresher 2) intern");
        int loaiNhanVien = new Scanner(System.in).nextInt();
        //khởi tạo đối tượng ứng với loại
         switch (loaiNhanVien){
              case 0: // nhập vào nhân viên thông tin mới
                 Employee experience = new Experience();
                 experience.inputInfo();
                 updateNhanVien(experience);
             break;
             case 1:// nhập vào nhân viên thông tin mới
                 Employee fresher = new Fresher();
                 fresher.inputInfo();
                 updateNhanVien(fresher);
                 break;
             case 2:// nhập vào nhân viên thông tin mới
                 Employee intern = new Intern();
                 intern.inputInfo();
                 updateNhanVien(intern);
                 break;
             default:// nhập vào nhân viên thông tin mới
                 System.out.println("bạn nhập sai không hợp lệ");

         }

    }

    private void updateNhanVien(Employee newEmployee) {
        // tìm kiếm mã nhân viên với danh sách nhân viên cũ

        boolean duplicateId = false;
        int indexDup = -1;
        for (int i = 0; i < soLuongNhanVien; i++) {
            Employee employeeOld = this.listnhanvien[i];
            if (employeeOld.getId() == newEmployee.getId()) {
                duplicateId = true;
                indexDup = i;
                break;
            }
        }
        // nếu trường hợp tồn tại -> xóa nhân viên cũ -> thêm nhân viên vào vị trí đó

        if (duplicateId) {
            listnhanvien[indexDup] = newEmployee;
        } else {
            // nếu không tồn tại trùng nhân viên -> thêm mới vào cuối mảng
            listnhanvien[soLuongNhanVien] = newEmployee;
            soLuongNhanVien++;
        }
    }

    public void hienThiDanhSachNhanVien(){
         for (int i  = 0; i < soLuongNhanVien; i++){
             Employee employee= this.listnhanvien[i];
             employee.showInfo();
         }
    }
}
