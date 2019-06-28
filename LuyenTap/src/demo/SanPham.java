package demo;

/**
 * Created by FPT on 6/27/2019 at 9:19 PM.
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private float giaCa;
    private String xuatXu;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(float giaCa) {
        this.giaCa = giaCa;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, float giaCa, String xuatXu) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaCa = giaCa;
        this.xuatXu = xuatXu;
    }
    public void xuatThongTinSanPham(){
        System.out.println("Ma san pham: "+maSanPham);
        System.out.println("Ten san pham: "+tenSanPham);
        System.out.println("Gia ca: "+giaCa);
        System.out.println("Xuat xu: "+xuatXu);
    }
}
