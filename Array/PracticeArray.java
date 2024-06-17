package Array;

import java.util.Arrays;

public class PracticeArray {
    private static int[] solution2(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }


    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 5};
        int[] sorted = solution(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sorted));

        System.out.println(Arrays.toString(solution2(arr)));
    }
}
