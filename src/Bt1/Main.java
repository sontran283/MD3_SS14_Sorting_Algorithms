package Bt1;

public class Main {
    public static void main(String[] args) {
        // hãy viết 3 hàm sử dụng 3 thuật toán sắp xếp chọn, chèn, nổi bọt
        // để sắp xếp lại mảng theo thứ tự tang dần và in mảng ra.

        int arr[] = getArr();

        System.out.println("\n ___ mang ban dau la ___ ");
        mangBanDau(arr);

        int[] arr2 = luaChon(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep bang thuat toan lua chon la ___ ");
        mangBanDau(arr2);

        int[] arr3 = chen(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep bang thuat toan chen la ___ ");
        mangBanDau(arr3);

        int[] arr4 = noiBot(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep bang thuat toan chen la ___ ");
        mangBanDau(arr4);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void mangBanDau(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static int[] luaChon(int[] arr) {
        int num = arr.length;

        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] chen(int[] arr) {
        int num = arr.length;

        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] noiBot(int[] arr) {
        int num = arr.length;

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}