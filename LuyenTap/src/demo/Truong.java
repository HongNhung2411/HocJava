package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by FPT on 6/27/2019 at 8:23 PM.
 */
public class Truong {


    private ArrayList<Lop> listLop = new ArrayList<>();

    public ArrayList<SinhVien> nhapDanhSachSv(int siSo) {
        ArrayList<SinhVien> listSv = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < siSo; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap msv: ");
            String msv = scanner.nextLine();
            sv.setMaSinhVien(msv);
            System.out.println("Nhap ho ten: ");
            String ht = scanner.nextLine();
            sv.setHoTen(ht);
            System.out.println("Nhap noi sinh: ");
            String ns = scanner.nextLine();
            sv.setNoiSinh(ns);
            System.out.println("Nhap ma lop: ");
            int ml = scanner.nextInt();
            sv.setMaLop(ml);
            listSv.add(sv);
        }

        return listSv;
    }

    public void nhapDanhSachLop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so lop: ");
        int soLop = sc.nextInt();
        for (int i = 0; i < soLop; i++) {

            Lop lop = new Lop();
            System.out.println("Nhap ma lop: ");
            int maL = sc.nextInt();
            lop.setMaLop(maL);
            System.out.println("Nhap ten lop: ");
            String ten = sc.nextLine();
            lop.setTenLop(ten);
            System.out.println("Nhap si so: ");
            int ss = sc.nextInt();
            lop.setSiSo(ss);
            lop.setList(nhapDanhSachSv(ss));

            listLop.add(lop);
        }
    }

    public void inThongTinLop() {
        for (Lop lop : listLop) {
            lop.xuatThongTinTheoLop();
        }
    }
}
