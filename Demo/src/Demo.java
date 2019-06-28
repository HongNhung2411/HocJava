import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by FPT on 6/24/2019 at 9:25 PM.
 */
public class Demo {

    public static boolean check(int x, int y){
        if (x == y){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Random rd = new Random();
        int diemSo = 5;
        Scanner sc = new Scanner(System.in);

        while (true){
            int soRandom = rd.nextInt(6); // tao 1 so random tu 0-->5
            System.out.print("Nhap so: ");
            int soNhap = sc.nextInt(); // so minh nhap
            if (check(soNhap,soRandom)){
                diemSo++;
                System.out.println("Ban da doan dung");
                System.out.println("so random la: "+ soRandom);
                System.out.println("So diem con lai: "+diemSo);
            } else {
                diemSo--;
                System.out.println("Ban da doan sai");
                System.out.println("so random la: "+ soRandom);
                System.out.println("So diem con lai: "+diemSo);
            }
            if (diemSo == 10){
                System.out.println("You win");
                break;
            }
            if (diemSo == 0){
                System.out.println("you loss");
                break;
            }

        }
    }
}
