package qlNhanVien;

import java.util.Scanner;

public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;
    private String education;

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.println(super.toStringEmployee());
        System.out.println(this.toString());
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfoEmp();
        System.out.println("nhập vào ngày tốt nghiệp");
        graduationDate = sc.nextLine();
        System.out.println("nhập xếp loại tốt nghiệp");
        graduationRank = sc.nextLine();
        System.out.println("nhập trường tốt nghiệp");
        education = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
