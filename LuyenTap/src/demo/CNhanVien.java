package demo;

import java.util.Scanner;

/**
 * Created by FPT on 6/28/2019 at 2:52 PM.
 */
public class CNhanVien {
    private String mHo;
    private String mTen;
    private int mSoSP;

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public CNhanVien() {
    }

    public CNhanVien(String mHo, String mTen, int mSoSP) {
        this.mHo = mHo;
        this.mTen = mTen;
        if (mSoSP < 0) {
            this.mSoSP = 0;
        } else {
            this.mSoSP = mSoSP;
        }
    }

    public void nhapNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho:");
        mHo = scanner.nextLine();
        System.out.println("Nhap ten: ");
        mTen = scanner.nextLine();
        System.out.println("Nhap so san pham: ");
        mSoSP = scanner.nextInt();
    }

    public void xuatNhanVien() {
        System.out.println("Ho: " + mHo);
        System.out.println("Ten: " + mTen);
        System.out.println("So san pham: " + mSoSP);
    }

    public double getLuong() {
        double luong = 0.0;
        if (mSoSP == 0) {
            luong = 0;
        } else if (mSoSP >= 1 && mSoSP <= 199) {
            luong = mSoSP * 0.5;
        } else if (mSoSP >= 200 && mSoSP <= 399) {
            luong = mSoSP * 0.55;
        } else if (mSoSP >= 400 && mSoSP <= 599) {
            luong = mSoSP * 0.6;
        } else {
            luong = mSoSP * 0.65;
        }
        return luong;
    }

    public boolean lonHon(CNhanVien nv2) {
        if (mSoSP > nv2.mSoSP) {
            return true;
        }
        return false;
    }
}
