package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by FPT on 6/27/2019 at 9:32 PM.
 */
public class QuanLiBanHang {
    private ArrayList<DanhMucSanPham> listDanhMucSanPham = new ArrayList<>();

    public void xuatThongTinDanhMuc() {
        for (DanhMucSanPham danhMucSanPham : listDanhMucSanPham) {
            danhMucSanPham.xuatThongTin();
        }
    }

    public void xuatSpDanhMucBatKi(String maDm) {
        for (DanhMucSanPham danhMuc : listDanhMucSanPham) {
            if (danhMuc.getMaDanhMuc().equals(maDm)) {
                danhMuc.xuatThongTin();
            }
        }
    }

    public void xoaSanPhamBatKy(String maSp) {
        for (DanhMucSanPham danhMucSp : listDanhMucSanPham) {
            for (SanPham sanPham : danhMucSp.getListSanPham()) {
                if (sanPham.getMaSanPham().equals(maSp)) {
                    danhMucSp.getListSanPham().remove(sanPham);
                }
            }
        }
    }

    public float tongGiaTriMatHang() {
        float tong = 0;
        for (DanhMucSanPham dmSp : listDanhMucSanPham) {
            for (SanPham sp : dmSp.getListSanPham()) {
                tong += sp.getGiaCa();
            }
        }
        return tong;
    }

    public void xuatSpTheoXuatXu(String xx) {
        for (DanhMucSanPham dmSanPham : listDanhMucSanPham) {
            for (SanPham sPham : dmSanPham.getListSanPham()) {
                if (sPham.getXuatXu().equals(xx)) {
                    sPham.xuatThongTinSanPham();
                }
            }
        }
    }

    public void capNhatThongTin(String maSp, String newXuatXu, float newGia) {
        for (DanhMucSanPham dmSp : listDanhMucSanPham) {
            for (SanPham sanP : dmSp.getListSanPham()) {
                if (sanP.getMaSanPham().equals(maSp)) {
                    sanP.setXuatXu(newXuatXu);
                    sanP.setGiaCa(newGia);
                }
            }
        }
    }

    public void nhapDanhMuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so danh muc: ");
        int soDanhMuc = scanner.nextInt();
        for (int i = 0; i < soDanhMuc; i++) {
            Scanner s = new Scanner(System.in);

            DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
            System.out.println("Nhap ma danh muc: ");
            String ma = s.nextLine();
            danhMucSanPham.setMaDanhMuc(ma);
            System.out.println("Nhap ten danh muc: ");
            String ten = s.nextLine();
            danhMucSanPham.setTenDanhMuc(ten);
            System.out.println("Nhap so san pham; ");
            int soSp = s.nextInt();
            ArrayList<SanPham> listSp = new ArrayList<>();
            for (int j = 0; j < soSp; j++) {
                Scanner a = new Scanner(System.in);

                SanPham sp = new SanPham();
                System.out.println("Nhap ma sp: ");
                String maSp = a.nextLine();
                sp.setMaSanPham(maSp);
                System.out.println("Nhap ten san pham: ");
                String tenSp = a.nextLine();
                sp.setTenSanPham(tenSp);
                System.out.println("Nhap gia:");
                float gia = a.nextFloat();
                sp.setGiaCa(gia);
                System.out.println("Nhap xuat xu: ");
                String xx = a.nextLine();
                sp.setXuatXu(xx);
                listSp.add(sp);
            }

            danhMucSanPham.setListSanPham(listSp);

            listDanhMucSanPham.add(danhMucSanPham);

        }

    }
}
