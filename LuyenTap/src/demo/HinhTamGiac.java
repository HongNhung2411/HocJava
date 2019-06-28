package demo;

/**
 * Created by FPT on 6/25/2019 at 7:26 PM.
 */
public class HinhTamGiac {
    private int ma,mb,mc;

    public HinhTamGiac() {
    }

    public HinhTamGiac(int ma, int mb, int mc) {
        if(ma<0 || mb<0||mc<0){
            System.out.println("Nhap sai");
            if(ma<0){
                this.ma=0;
            }
            if(mb<0){
                this.mb=0;
            }
            if(mc<0){
                this.mc=0;
            }
        } else {

            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        this.mc = mc;
    }
    public boolean laTamGiac(){
        if(ma+mb>mc||ma+mc>mb||mb+mc>ma){
            return true;
        }
        return false;
    }
    public int getChuVi(){
        return ma+mb+mc;
    }
    public int getDienTich(){
        return ma*mb*mc; //khong nho cong thuc
    }

}
