package Th2;

import Util.ArrayUtil;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "hoa qua", 90),
                new Student(2, "quan ao", 100),
                new Student(3, "giay dep", 60),
                new Student(4, "may tinh", 80),
        };

        System.out.println(" \n ___ danh sach hoc sinh ban dau ___");
        BanDau(students);

        Student[] list1 = SortingStudent.sapXepChen(students.clone());
        System.out.println("\n ___ sap xep chen ___");
        BanDau(list1);

        Student[] list2 = SortingStudent.sapXepLuaChon(students.clone());
        System.out.println("\n ___ sap xep lua chon ___");
        BanDau(list2);

        Student[] list3 = SortingStudent.sapXepNoiBot(students.clone());
        System.out.println("\n ___ sap xep noi bot ___");
        BanDau(list3);
    }

    private static void BanDau(Student[] students) {
        for (Student student : students) {
            System.out.println(
                    "ID: " + student.getId() +
                            ", Name: " + student.getName() +
                            ", Score: " + student.getScore());
        }
    }

    private static Student[] sapXepChen(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
        return students;
    }

    private static Student[] sapXepLuaChon(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() < students[minIndex].getScore()) {
                    minIndex = j;
                }
            }

            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }

        return students;
    }

    private static Student[] sapXepNoiBot(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }
}
