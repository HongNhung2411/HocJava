package demo;

/**
 * Created by FPT on 6/25/2019 at 7:40 PM.
 */
public class NhanVien {
    private String  maNV;
    private int soSP;

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if(soSP>0){
            this.soSP=soSP;
        }else {
           this.soSP=0;
        }
    }
    public boolean coVuotChuan(){
        if(soSP>500){
            return true;
        }
        return false;
    }
    public String  getTongKet(){
        if(coVuotChuan()){
            return "Vuot";
        }else{
            return " ";
        }
    }

    public double getLuong(){
        if(coVuotChuan()){
            return 500*2+(soSP-500)*3;
        }
        return soSP*2;
    }
    public void xuatTieuDe(){
        System.out.println("Ma nhan vien: "+maNV+", so san pham: "+soSP+", luong: "+getLuong()+", tong ket: "+getTongKet());
    }
}
