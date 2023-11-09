package qlNhanVien;

import java.util.Scanner;

public class Employee {
    private long id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private Integer employeeType;
    public Integer employeeCount;
    private Certificate certificate;

    public Employee(){
        certificate = new Certificate();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public void inputInfoEmp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin id nhân viên");
        id = sc.nextLong(); sc.nextLine();
        System.out.println("nhập họ vào tên");
        fullName = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh");
        birthDay = sc.nextLine();
        System.out.println("nhập vào số điện thoại");
        phone = sc.nextLine();
        System.out.println("nhập Email cá nhân");
        email = sc.nextLine();
        System.out.println("nhập loại nhân viên 1: Experience, 2: Fresher , 3: Intern");
        employeeType = sc.nextInt();
        certificate.inputInfo();
    }

    public void inputInfo(){
        this.inputInfoEmp();
    }

    public void showInfo(){
        System.out.println(toStringEmployee());
    }
    public String toStringEmployee() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", employeeCount='" + employeeCount + '\'' +
                ", certificate=" + certificate.toString() +
                '}';
    }
}
