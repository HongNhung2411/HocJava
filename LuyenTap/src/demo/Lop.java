package demo;

import java.util.ArrayList;

/**
 * Created by FPT on 6/27/2019 at 4:25 PM.
 */
public class Lop {
    private int maLop;
    private String tenLop;
    private int siSo;
    private ArrayList<SinhVien> list;

    public Lop(int maLop, String tenLop, int siSo, ArrayList<SinhVien> list) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
        this.list = list;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public Lop() {
    }

    public Lop(int maLop, String tenLop, int siSo) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
    }
    public void xuatThongTinTheoLop(){
        System.out.print("Ma lop: "+maLop);
        System.out.print("\t Ten lop: "+tenLop);
        System.out.print("\t Si so: "+siSo);

        System.out.println("Danh sach sinh vien trong lop la: ");
        for (SinhVien sinhVien : list){
            sinhVien.xuatThongTin();
        }


    }
}
