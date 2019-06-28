package demo;

import java.util.ArrayList;

/**
 * Created by FPT on 6/27/2019 at 9:24 PM.
 */
public class DanhMucSanPham {
    private String maDanhMuc;
    private String tenDanhMuc;
    private ArrayList<SanPham> listSanPham=new ArrayList<>();

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public ArrayList<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(String maDanhMuc, String tenDanhMuc, ArrayList<SanPham> listSanPham) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        this.listSanPham = listSanPham;
    }
    public void xuatThongTin(){
        System.out.println("Ma danh muc: "+maDanhMuc);
        System.out.println("Ten danh muc: "+tenDanhMuc);
        for (SanPham sanPham:listSanPham){
            sanPham.xuatThongTinSanPham();
        }
    }
}
