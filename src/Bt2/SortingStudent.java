package Bt2;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "son tran", 85.5),
                new Student(2, "tuan anh", 95.0),
                new Student(3, "bang nguyen", 76.8),
                new Student(4, "tinh tran", 89.2),
                new Student(5, "anh duc", 92.3)
        };

        System.out.println("\n ___ danh sach hoc sinh ban dau ___ ");
        hsBanDau(students);

        Student[] list1 = SortingStudent.chen(students.clone());
        System.out.println("\n ___ danh sach hoc sinh sau khi sap xep theo chen ___ ");
        hsBanDau(list1);

        Student[] list2 = SortingStudent.luaChon(students.clone());
        System.out.println("\n ___ danh sach hoc sinh sau khi sap xep theo lua chon ___ ");
        hsBanDau(list2);

        Student[] list3 = SortingStudent.noiBot(students.clone());
        System.out.println("\n ___ danh sach hoc sinh sau khi sap theo noi bot ___ ");
        hsBanDau(list3);
    }

    private static void hsBanDau(Student[] students) {
        for (Student student : students) {
            System.out.println(
                    "ID: " + student.getId() +
                            ", Name: " + student.getName() +
                            ", Score: " + student.getScore());
        }
    }

    private static Student[] chen(Student[] students) {
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


    private static Student[] luaChon(Student[] students) {
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

    private static Student[] noiBot(Student[] students) {
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
