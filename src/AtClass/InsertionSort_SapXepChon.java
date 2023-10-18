package AtClass;

import Util.ArrayUtil;

public class InsertionSort_SapXepChon {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 6, 5, 3};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    ArrayUtil.swap(arr, j, j-1);
                }
            }
        }
    }
}
