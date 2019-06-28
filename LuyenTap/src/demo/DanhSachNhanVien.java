package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by FPT on 6/27/2019 at 2:09 PM.
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> listNhanVien;

    public ArrayList<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(ArrayList<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    public DanhSachNhanVien() {
    }

    public DanhSachNhanVien(ArrayList<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    public void themNhanVien(NhanVien nv1) {
        listNhanVien.add(nv1);
    }

    public void xuatNhanvien() {
        if (listNhanVien.size() >= 1) {
            for (int i = 0; i < listNhanVien.size(); i++) {
                listNhanVien.get(i).xuatTieuDe();
            }
        } else {
            System.out.println("Danh sach trong");
        }
    }

    public int tongSoNhanVien() {
        return listNhanVien.size();
    }

    public void thongTinNvVuotChuan() {
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).coVuotChuan()) {
                listNhanVien.get(i).xuatTieuDe();
            }
        }
    }

    public int demNvKhongVuotChuan() {
        int dem = 0;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (!listNhanVien.get(i).coVuotChuan()) {
                dem += 1;
            }
        }
        return dem;
    }

    public double tongLuong() {
        double luong = 0.0;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).coVuotChuan()) {
                luong = listNhanVien.get(i).getLuong();
            }
        }
        return luong;
    }

    public NhanVien NvCoSpMin() {
        NhanVien nvMin = listNhanVien.get(0);
        for (int i = 1; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getSoSP() < nvMin.getSoSP()) {
                nvMin = listNhanVien.get(i);
            }
        }
        return nvMin;
    }

    public NhanVien nvCoLuongMax() {
        NhanVien nhanVien = listNhanVien.get(0);
        for (int i = 1; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getLuong() > nhanVien.getLuong()) {
                nhanVien = listNhanVien.get(i);
            }
        }
        return nhanVien;
    }

    public NhanVien nvKhongVuotChuanLuongMax() {
        ArrayList<NhanVien> list = new ArrayList<>();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (!listNhanVien.get(i).coVuotChuan()) {
                list.add(listNhanVien.get(i));
            }
        }
        NhanVien nv1 = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getLuong() > nv1.getLuong()) {
                nv1 = list.get(i);
            }
        }
        return nv1;
    }

    public double tongLuongAll() {
        double tong = 0.0;
        for (int i = 0; i < listNhanVien.size(); i++) {
            tong += listNhanVien.get(i).getLuong();
        }
        return tong;
    }

    public NhanVien timKiem(String s1) {
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMaNV().equals(s1)) {
                return listNhanVien.get(i);
            }
        }
        return null;
    }

    // so sanh chuoi, su dung ham equals(), @@ nho roi hung quen cach dung, em cu code di,co bai nao dung cai nay r y nhi
// ham xoa nhan vien, xoa khoi lisst la gi as, remove()
    public void xoaNhanVien(int x) {
        if (x >= listNhanVien.size() || x < 0 || listNhanVien.size() == 0) {
            System.out.println("Khong co nhan vien nay");
        } else {
            listNhanVien.remove(x);
        }
    }
    public void sortByLuong() {
        // truyen vao 2 tham so, tham so 1 la list muon sap xep, tham so thu 2 la 1 cai Comparator, thi em cu viet
        // new Comparator la no goi y cho

//o1, o2 la 2 nhan vien lien ke nhau trong list, em so snah theo tieu chi nao thi cu retun tieu chi do la dc
        Collections.sort(listNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return (int) (o1.getLuong() - o2.getLuong());
            }
        }); // su dung comparator de so sanh 2 nhan vien lien ke nhau theo 1 thuoc tinh nao do, o day la luong
    }
}
