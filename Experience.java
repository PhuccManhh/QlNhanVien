package qlNhanVien;

import java.util.Scanner;

public class Experience extends Employee{
    private Integer expInYear;
    private String proSkill;



    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void inputInfo() {
        super.inputInfoEmp();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin số năm kinh nghiệm");
        expInYear = sc.nextInt();sc.nextLine();
        System.out.println("nhập kỹ năm kinh nghiệm");
        proSkill = sc.nextLine();

    }

    @Override
    public void showInfo() {
        System.out.println(super.toStringEmployee());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
