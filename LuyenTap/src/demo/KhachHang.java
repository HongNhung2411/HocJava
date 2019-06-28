package demo;

import java.util.Scanner;

/**
 * Created by FPT on 6/28/2019 at 8:26 AM.
 */
public class KhachHang {
    private String hoTenChuHo;
    private int soNha;
    private String maSoCongTo;

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public KhachHang() {
    }

    public KhachHang(String hoTenChuHo, int soNha, String maSoCongTo) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten chu ho: ");
        hoTenChuHo = scanner.nextLine();
        System.out.println("Nhap so nha: ");
        soNha = scanner.nextInt();
        System.out.println("Nhap ma so cong to: ");
        maSoCongTo = scanner.nextLine();
    }


    public void xuatThongTin() {
        System.out.println("Ho ten chu ho: " + hoTenChuHo);
        System.out.println("So nha: " + soNha);
        System.out.println("Ma so cong to: " + maSoCongTo);
    }
}
