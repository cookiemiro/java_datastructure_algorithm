package Array;

import java.util.Arrays;

class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = {1, -5, 2, 4, 3};
        int[] arr2 = new int[] {2, 1, 1, 3, 2, 5, 4};
        int[] arr3 = new int[3];

        arr3[0] = 6;
        arr3[1] = 1;
        arr3[2] = 7;


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}