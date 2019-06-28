package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by FPT on 6/25/2019 at 8:21 AM.
 */
public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so cac phan tu: ");
        int soPt = scanner.nextInt();
//        int[] soNguyen = new int[soPt];
//        for (int i = 0; i < soNguyen.length; i++) {
//            System.out.println("Nhap phan tu thu " + (i + 1));
//            soNguyen[i] = scanner.nextInt();
//        }
//        int temp = soNguyen[0];
//        for (int i = 0; i < soPt; i++) {
//            for (int j = i + 1; j < soPt; j++) {
//                if (soNguyen[i] < soNguyen[j]) {
//                    temp = soNguyen[i];
//                    soNguyen[i] = soNguyen[j];
//                    soNguyen[j] = temp;
//                }
//            }
//        }
//        System.out.printf("so lon thu 2: " + soNguyen[1]);

//
//        ArrayList<Integer> arrInt = new ArrayList<>(); // khai bao 1 list cac so nguyen
//        for (int i = 0; i < soPt; i++) {
//            System.out.print("Nhap phan tu thu " + (i + 1) + " la: ");
//            arrInt.add(scanner.nextInt());
//        }
//
//        System.out.printf("Cac phan tu cua list la: ");
//
//        for (int i =0;i<arrInt.size();i++){
//
//            System.out.printf(arrInt.get(i) + "\t"); // get(i) de lay ra phan tu thu i
//
//        }
//
//        // xoa di phan tu dau tien:
//        arrInt.remove(0);
//
//        System.out.printf("\n Cac phan tu cua list sau khi xoa la: ");
//
//        for (int i =0;i<arrInt.size();i++){
//
//            System.out.printf(arrInt.get(i) + "\t"); // get(i) de lay ra phan tu thu i
//
//        }
//        // co 2 cach tim max, cach 1 la sap xep nhu em, sau do lay thang dau tien, cach 2 la su dung
//        // ham san co
//        // cung co 2 cach sap xep luon
//        // sap xep
//        Collections.sort(arrInt);
//
//        System.out.printf("\n Cac phan tu cua list sau khi sap xep la la: ");
//
//        for (int i =0;i<arrInt.size();i++){
//
//            System.out.printf(arrInt.get(i) + "\t"); // get(i) de lay ra phan tu thu i
//
//        }
//
//        int max = Collections.max(arrInt);
//        System.out.printf("Max la: "+max);
//
//        // them gia tri vao vi tri thu i, thi dung ham add()
//        // vi du them vao vi tri thu 2, gia tri la -3
//        arrInt.add(2, -3);
//
//        System.out.printf("\n Cac phan tu cua list sau khi them la: ");
//
//        for (int i =0;i<arrInt.size();i++){
//
//            System.out.printf(arrInt.get(i) + "\t"); // get(i) de lay ra phan tu thu i
//
//        }
//
//        // arrInt.size() lay kich thuong cua list
//


        ArrayList<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < soPt; i++) {
            arrInt.add(scanner.nextInt());
        }
        System.out.printf("Cac phan tu: ");
        for (int i = 0; i < arrInt.size(); i++) {
            System.out.printf(arrInt.get(i) + " ");
        }

        int max1 = Collections.max(arrInt);
        System.out.printf("Phan tu co gia tri lon nhat: " + max1 +"\n");

        int min1 = Collections.min(arrInt);
        System.out.printf("Phan tu co gia tri nho nhat: " + min1 + "\n");

        for (int i = 0; i < arrInt.size(); i++) {
            if (arrInt.get(i) % 2 == 0) {
                System.out.println(arrInt.get(i));
            }
        }
        Collections.sort(arrInt);

        System.out.printf("Cac phan tu sau khi sap xep: ");
        for (int i = 0; i < arrInt.size(); i++) {
            System.out.printf(arrInt.get(i) + " ");
        }

    }
}
