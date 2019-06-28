package kiemtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by FPT on 6/28/2019 at 4:44 PM.
 */
public class StudentManager {
    ArrayList<Student> list;

    public StudentManager() {
        list = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap GPA: ");
        float gpa = scanner.nextFloat();

        Student student = new Student(id, name, age, address, gpa);
        list.add(student);
    }

    public void showStudent() {
        if (list.size() > 0) {

            for (Student hs : list) {

                System.out.println("Id: " + hs.getId());
                System.out.println("Name: " + hs.getName());
                System.out.println("Age: " + hs.getAge());
                System.out.println("Address: " + hs.getAddress());
                System.out.println("GPA: " + hs.getGpa());

            }
        } else {
            System.out.println("Khong co hoc sinh");
        }


    }

    public void editStudent(String idS, String nameS, int ageS, String addressS, float gpaS) {
        boolean exist = false;
        for (Student student : list) {
            if (student.getId().equals(idS)) {

                exist = true;
                student.setName(nameS);
                student.setAge(ageS);
                student.setAddress(addressS);
                student.setGpa(gpaS);
                break;
            }
        }

        if (exist) {
            System.out.println("update thanh cong");
        } else {
            System.out.println("Khong tim thay ");
        }

    }

    public void deleteStudent(String idSt) {
        boolean ex = false;
        for (Student student : list) {
            if (student.getId().equals(idSt)) {
                ex = true;
                list.remove(student);
                break;
            }
        }
        if (ex) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("That bai.");
        }
    }

    public void sortByGpa() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getGpa() - o2.getGpa()); // no so sanh 2 cai gpa cua 2 thang lien tiep nhau trong list
            }
        });

        showStudent();
    }

    public void sortByName() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        showStudent();
    }

}

