package demo;

/**
 * Created by FPT on 6/25/2019 at 7:15 PM.
 */
public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public float tinhChuVi() {
        return (chieuRong + chieuDai) * 2;
    }

    public boolean kiemTra() {
        if (chieuDai == chieuRong) {
            return true;
        }
        return false;
    }
}
