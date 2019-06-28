package kiemtra;

import java.util.Scanner;

/**
 * Created by FPT on 6/28/2019 at 4:16 PM.
 */
public class ProgramStudent {


    public static void showMenu() {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Add student.", "|");
        System.out.printf("\n| %-90s %7s", "2. Edit student by id.", "|");
        System.out.printf("\n| %-90s %7s", "3. Delete student by id.", "|");
        System.out.printf("\n| %-90s %7s", "4. Sort student by gpa.", "|");
        System.out.printf("\n| %-90s %7s", "5. Sort student by name.", "|");
        System.out.printf("\n| %-90s %7s", "6. Show student.", "|");
        System.out.printf("\n| %-90s %7s", "0. Exit.", "|");
        printLine();
        System.out.printf("\nPlease choose: ");

    }

    public static void printLine() {
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i == 1 || i == 100) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        String choose;
        boolean exit = false;
        showMenu();
        StudentManager studentManager = new StudentManager();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("m muon thoat ah ? (y/n)");
                    String check = sc.nextLine();
                    if (check.equals("y") || check.equals("Y")){
                        exit = true;
                        System.out.println("Da thoat");
                    }
                    break;
                case "1":
                    studentManager.addStudent();
                    break;
                case "2":
                    System.out.print("Nhap id muon sua: ");
                    id = sc.nextLine();
                    System.out.print("New name: ");
                    String newName = sc.nextLine();
                    System.out.print("New age: ");
                    int newAge = sc.nextInt();
                    System.out.print("New address: ");
                    String newAddress = sc.nextLine();
                    System.out.print("New gpa: ");
                    float newGpa = sc.nextFloat();
                    studentManager.editStudent(id, newName, newAge, newAddress, newGpa);
                    break;
                case "3":
                    System.out.print("id muon xoa: ");
                    id = sc.nextLine();
                    studentManager.deleteStudent(id);
                    break;
                case "4":
                    studentManager.sortByGpa();
                    break;
                case "5":
                    studentManager.sortByName();
                    break;
                case "6":
                    studentManager.showStudent();
                    break;
            }

            if (exit) {
                break;
            } else {
                showMenu();
            }
        }
    }
}
