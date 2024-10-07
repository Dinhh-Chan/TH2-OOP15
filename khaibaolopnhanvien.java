import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien() {
        this.maNV = "00001";
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maSoThue = "";
        this.ngayKyHopDong = "";
    }

    public void nhapThongTin(Scanner scanner) {
        this.hoTen = scanner.nextLine();
        this.gioiTinh = scanner.nextLine();
        this.ngaySinh = scanner.nextLine();
        this.diaChi = scanner.nextLine();
        this.maSoThue = scanner.nextLine();
        this.ngayKyHopDong = scanner.nextLine();
        this.ngaySinh = chuanHoaNgayThang(this.ngaySinh);
        this.ngayKyHopDong = chuanHoaNgayThang(this.ngayKyHopDong);
    }

    private String chuanHoaNgayThang(String ngayThang) {
        String[] parts = ngayThang.split("/");
        String ngay = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        String thang = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        String nam = parts[2];
        return ngay + "/" + thang + "/" + nam;
    }

    public void inThongTin() {
        System.out.printf("%s %s %s %s %s %s %s\n", this.maNV, this.hoTen, this.gioiTinh, this.ngaySinh, this.diaChi, this.maSoThue, this.ngayKyHopDong);
    }
}

public class khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.nhapThongTin(scanner);
        nv.inThongTin();
        scanner.close();
    }
}
