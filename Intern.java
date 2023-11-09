package qlNhanVien;

import java.util.Scanner;

public class Intern extends Employee{
    private String majors;
    private String semester;
    private String universityName;

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfoEmp();
        System.out.println("nhập chuyên ngành đag học");
        majors = sc.nextLine();
        System.out.println("nhập học kỳ đang học");
        semester = sc.nextLine();
        System.out.println("nhập tên trường đang học");
        universityName = sc.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println(super.toStringEmployee());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
