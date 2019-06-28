package demo;

import java.util.Scanner;

/**
 * Created by FPT on 6/28/2019 at 8:30 AM.
 */
public class BienLai {
    private float chiSoCu;
    private float chiSoMoi;
    private float soTienDien;
    private KhachHang khachHang;

    public BienLai(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public float getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(float chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public float getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(float chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public float getSoTienDien() {
        return soTienDien;
    }

    public void setSoTienDien(float soTienDien) {
        this.soTienDien = soTienDien;
    }

    public BienLai() {
    }

    public BienLai(float chiSoCu, float chiSoMoi, float soTienDien) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienDien = soTienDien;
    }

    public void nhapBienLai() {
        khachHang = new KhachHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin khach hang: ");
        khachHang.nhapThongTin();

        do {
            System.out.println("Nhap chi so cu: ");
            chiSoCu = sc.nextFloat();
            System.out.println("Nhap chi so moi: ");
            chiSoMoi = sc.nextFloat();
        } while (chiSoCu > chiSoMoi);
        soTienDien = (chiSoMoi - chiSoCu) * 750;
    }

    public void xuatBienLai() {
        System.out.println("Thong tin ho su dung dien: ");
        khachHang.xuatThongTin();
        System.out.println("Chi so cu: " + chiSoCu);
        System.out.println("Chi so moi:" + chiSoMoi);
        System.out.println("So tien phai tra: " + soTienDien);
    }
}
