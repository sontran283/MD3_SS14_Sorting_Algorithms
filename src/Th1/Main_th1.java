package Th1;

import Util.ArrayUtil;

public class Main_th1 {
    // Bài tập sắp xếp mảng số nguyên tăng dần
    // Mục tiêu: luyện tập sử dụng 3 loại thuật toán sắp xếp
    // Đề bài: Hàm sau trả về 1 mảng 20 phần từ số nguyên ngẫu nhiên từ 1 -> 100:
    // hãy viết 3 hàm sử dụng 3 thuật toán sắp xếp chọn, chèn, nổi bọt để sắp xếp lại mảng theo thứ tự tang dần và in mảng ra.

    public static void main(String[] args) {

        int[] arr = getArr();
        System.out.println(" \n ___ mang ban dau la ___ ");
        arrBanDau(arr);

        int[] arr2 = sapXepLuaChon(arr.clone());
        System.out.println(" \n ___ mang sau khi sap xep bang thuat toan lua chon la ___  ");
        arrBanDau(arr2);

        int[] arr3 = sapXepChen(arr.clone());
        System.out.println(" \n ___ mang sau khi sap xep bang thuat toan sap xep chen la ___ ");
        arrBanDau(arr3);

        int[] arr4 = sapXepNoiBot(arr.clone());
        System.out.println(" \n ___ mang sau khi sap xep bang thuat toan noi bot la ___ ");
        arrBanDau(arr4);
    }

    private static int[] sapXepLuaChon(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    ArrayUtil.swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    private static int[] sapXepChen(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        return arr;
    }

    private static int[] sapXepNoiBot(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    ArrayUtil.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    private static void arrBanDau(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
