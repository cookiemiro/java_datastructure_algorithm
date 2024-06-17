package Array;

import java.util.Arrays;

public class ArrN2Algorithim {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long end = System.currentTimeMillis();

        System.out.println((end - start) / 1000.0 + "초");

        start = System.currentTimeMillis();
        int[] sorted = doSort(arr);
        end = System.currentTimeMillis();

        System.out.println((end - start) / 1000.0 + "초");

        Arrays.equals(bubble, sorted);
    }

    // 버블 정렬 알고리즘(O(N^2))
    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    // sort() API 활용하려 정렬: O(NlogN)
    private static int[] doSort(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
