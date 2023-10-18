package Bt3;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        System.out.println("\n ___ mang ban dau ___ ");
        mangBanDau(arr);

        String[] arr1 = chen(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep chen ___ ");
        mangBanDau(arr1);

        String[] arr2 = luaChon(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep lua chon ___ ");
        mangBanDau(arr2);

        String[] arr3 = noiBot(arr.clone());
        System.out.println("\n ___ mang sau khi sap xep noi bot ___ ");
        mangBanDau(arr3);
    }

    public static String[] chen(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    public static String[] luaChon(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static String[] noiBot(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void mangBanDau(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

