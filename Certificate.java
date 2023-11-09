package qlNhanVien;

import java.util.Scanner;

public class Certificate {
    private String cerificateID;
    private String certificateName;
    private String certificateRank;
    private String cerificatedDate;

    public String getCerificateID() {
        return cerificateID;
    }

    public void setCerificateID(String cerificateID) {
        this.cerificateID = cerificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCerificatedDate() {
        return cerificatedDate;
    }

    public void setCerificatedDate(String cerificatedDate) {
        this.cerificatedDate = cerificatedDate;
    }

    public void displayInfo(){
        System.out.println(this.toString());
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã chứng chỉ");
        cerificateID = sc.nextLine();
        System.out.println("nhập tên chứng chỉ");
        certificateName = sc.nextLine();
        System.out.println("nhập rank chứng chỉ");
        certificateRank = sc.nextLine();
        System.out.println("nhập ngày chứng chỉ");
        cerificatedDate = sc.nextLine();


    }

    @Override // tất cả class trong java cho dù không điền vào nhưng đươc hiểu bọn này kế thừa từ Object / các class tạo ra trong java đều kế thừa trong object(java.lang) và thằng object này nó là thằng cha tẩt cả class trong java
    public String toString() {
        return "Certificate{" +
                "cerificateID='" + cerificateID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", cerificatedDate='" + cerificatedDate + '\'' +
                '}';
    }
}
