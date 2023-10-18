package AtClass;

import Util.ArrayUtil;

public class SelectionSort_SapXepChen {
    public static void main(String[] args) {
        // sau moi lan duyet ca ham, phan tu dao nhat duoc xep xuong duoi
        int[] arr = {1, 2, 4, 5, 6, 8, 6, 5, 3};

        for (int i = 1; i < arr.length; i++) {
            int indexOfMax = 0;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[indexOfMax]) {
                    indexOfMax = j;
                }
            }

//            int temp = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = arr[indexOfMax];
//            arr[indexOfMax] = temp;

            ArrayUtil.swap(arr, indexOfMax, arr.length - i - 1);

        }
    }
}
