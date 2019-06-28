package demo;

/**
 * Created by FPT on 6/25/2019 at 7:56 PM.
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String noiSinh;
    private int maLop;
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String noiSinh, int maLop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.noiSinh = noiSinh;
        this.maLop = maLop;
    }
    public void xuatThongTin() {
        System.out.println("Ma sinh vien: "+maSinhVien);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Noi sinh: "+noiSinh);
        System.out.println("Ma lop: "+maLop);
    }
}
