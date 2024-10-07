import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    public SinhVien() {
        this.maSV = "B20DCCN001";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }
    public void nhapThongTin(Scanner scanner) {
        this.hoTen = scanner.nextLine();
        this.lop = scanner.nextLine();
        this.ngaySinh = scanner.nextLine();
        this.gpa = Float.parseFloat(scanner.nextLine());
        
        this.ngaySinh = chuanHoaNgaySinh(this.ngaySinh);
    }
    private String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        String ngay = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        String thang = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        String nam = parts[2];
        return ngay + "/" + thang + "/" + nam;
    }
    public void inThongTin() {
        System.out.printf("%s %s %s %s %.2f\n", this.maSV, this.hoTen, this.lop, this.ngaySinh, this.gpa);
    }
}
public class khaibaolopsinhvien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.nhapThongTin(scanner);
        sv.inThongTin();
        scanner.close();
    }
}