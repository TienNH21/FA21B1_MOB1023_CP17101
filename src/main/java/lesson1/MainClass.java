package lesson1;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("PH12345", 2000, "Nguyen Van A", 20, "0122123123");

        System.out.println(sv.getThongTin());
        System.out.println(sv.getThongTin("UDPM"));
    }
}
