package demo;

/**
 * Created by FPT on 6/25/2019 at 7:21 PM.
 */
public class MainTest {
    public static void main(String[] args) {
//        HinhChuNhat hinhChuNhat = new HinhChuNhat(5,5);
//
//        System.out.println(hinhChuNhat.tinhChuVi());
//        System.out.println(hinhChuNhat.tinhDienTich());
//
//        hinhChuNhat.setChieuDai(15);
//        System.out.println(hinhChuNhat.getChieuDai());
//
//        HinhTamGiac hinhTamGiac=new HinhTamGiac();
//        hinhTamGiac.setMa(2);
//        hinhTamGiac.setMb(7);
//        hinhTamGiac.setMc(4);
//        if( hinhTamGiac.laTamGiac()){
//            System.out.println("chu vi la: "+hinhTamGiac.getChuVi()+" - dien tich la: "+hinhTamGiac.getDienTich());
//
//        } else {
//            System.out.println("Khong phai tam giac");
//        }
//
//        NhanVien nhanVien=new NhanVien();
//        nhanVien.setSoSP(501);
//        nhanVien.setMaNV("001");
//        nhanVien.xuatTieuDe();
//
//        ArrayList<NhanVien> list1=new ArrayList<>();
//        list1.add(nhanVien);
//        list1.add(new NhanVien("002",600));
//        list1.add(new NhanVien("003",550));
//     //   Collections.sort(list1,);
//    }
//        Circle circle = new Circle();
//        circle.setRadius(5);
//        System.out.println("Dien tich: " + circle.getArea());
//        System.out.println(circle.toString());
//
//        CircleCollection collection = new CircleCollection();
//        ArrayList<Circle> list = new ArrayList<>();
//        list.add(circle);
//
//        collection.setListCircle(list);
//
//        collection.addCircle(new Circle(6));
//
//        System.out.println("Size: " + collection.getSize());
//
//        System.out.println(collection.toString());
//
//        DecimalFormat df = new DecimalFormat("0.###");
//
//        System.out.println("S max la: " + df.format(collection.getMaxS()));
//
//        String a = "Nhung";
//        String b= "Yeu Cuong";
//        if (a.equals(b)){
//            System.out.println("Hai chuoi giong nhau");
//        } else  {
//            System.out.println("hai chuoi khac nhau");
//        }
        // demo NhanVien
//        NhanVien nv1 = new NhanVien("nv01", 600);
//        NhanVien nv2 = new NhanVien("nv02", 300);
//        NhanVien nv3 = new NhanVien("nv03", 200);
//        NhanVien nv4 = new NhanVien("nv04", 700);
//        NhanVien nv5 = new NhanVien("nv05", 650);
//
//        ArrayList<NhanVien> list = new ArrayList<>();
//        list.add(nv1);
//        list.add(nv2);
//        list.add(nv3);
//        list.add(nv4);
//        list.add(nv5);
//
//        // for cu
//
//        System.out.println("For cu");
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).xuatTieuDe();
//        }
//
//        System.out.println("For moi");
//        for (NhanVien nhanVien : list){
//            nhanVien.xuatTieuDe();
//        }

        // ket qua giong nhau, okii, thang moi thi ngan hon, nhung em lai khong biet duoc vi tri
//
//        DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien();
//        danhSachNhanVien.setListNhanVien(list);
//
//        danhSachNhanVien.xuatNhanvien();
//        //test ham tim kiem
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap vao ma nv muon tim: ");
//        String mNv = scanner.nextLine();
//        NhanVien nhanVienTimKiem = danhSachNhanVien.timKiem(mNv);
//        if (nhanVienTimKiem == null) {
//            System.out.println("Khong tim thay");
//        } else {
//            nhanVienTimKiem.xuatTieuDe();
//        }
//
//        NhanVien nvKhongVuotChuanLuongMax = danhSachNhanVien.nvKhongVuotChuanLuongMax();
//        System.out.println("Nhan vien khong vuot chuan co luong max la: ");
//        nvKhongVuotChuanLuongMax.xuatTieuDe();
//        //  test ham sort
//
//        System.out.println("Danh dach nv sau khi sap xep la: ");
//        danhSachNhanVien.sortByLuong();
//        danhSachNhanVien.xuatNhanvien();
//
//        Truong truong=new Truong();
//        truong.nhapDanhSachLop();
//        System.out.println("Thong tin theo lop: ");
//        truong.inThongTinLop();
//        QuanLiBanHang danhMucSanPham=new QuanLiBanHang();
//        danhMucSanPham.nhapDanhMuc();
//        danhMucSanPham.xuatThongTinDanhMuc();

//        Scanner s = new Scanner(System.in);
//        System.out.println("Nhap so ho su dung dien: ");
//        int n = s.nextInt();
//        ArrayList<BienLai> listBienLai = new ArrayList<>(); // k can cai n trong nay, okibb
//        for (int i = 0; i < n; i++) {
//            BienLai bl=new BienLai();
//            bl.nhapBienLai();
//            listBienLai.add(bl);
//        }
//        System.out.println("Danh sach bien lai: ");
//        for (BienLai bienLai : listBienLai) {
//            bienLai.xuatBienLai();
//        }
//        CNhanVien nv1 = new CNhanVien();
//        CNhanVien nv2 = new CNhanVien();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap thong tin nhan vien 1: ");
//        nv1.nhapNhanVien();
//        System.out.println("Nhap thong tin nhan vien 2: ");
//        nv2.nhapNhanVien();
//        System.out.println("Thong tin nhan vien: ");
//        nv1.xuatNhanVien();
//        nv2.xuatNhanVien();
//        System.out.println("Luong cua nhan vien 1: " + nv1.getLuong());
//        System.out.println("Luong cua nhan vien 2: " + nv2.getLuong());
//        if (nv1.lonHon(nv2)) {
//            System.out.println("Nhan vien 1 co so san pham lon hon.");
//            System.out.println("So san pham lon hon la: " + (nv1.getmSoSP() - nv2.getmSoSP()));
//        } else if (nv2.lonHon(nv1)) {
//            System.out.println("Nhan vien 2 co so san pham lon hon.");
//            System.out.println("So san pham lon hon la: " + (nv2.getmSoSP() - nv1.getmSoSP()));
//        } else {
//            System.out.println("Hai nhan vien co so san pham bang nhau");
//        }

//        if (nv1.getmSoSP()>nv2.getmSoSP()){
//            System.out.println("Nhan vien 1 co so san pham lon hon.");
//            System.out.println("So san pham lon hon la: "+(nv1.getmSoSP()-nv2.getmSoSP()));
//        } else if (nv2.getmSoSP()>nv1.getmSoSP()){
//            System.out.println("Nhan vien 2 co so san pham lon hon.");
//            System.out.println("So san pham lon hon la: "+(nv2.getmSoSP()-nv1.getmSoSP()));
//        } else {
//            System.out.println("Hai nhan vien co so san pham bang nhau");
//
//        }
    }
}