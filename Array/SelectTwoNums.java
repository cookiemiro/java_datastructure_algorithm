package Array;

import java.util.Arrays;
import java.util.ArrayList;

public class SelectTwoNums {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 3, 4, 1};
        int[] arr2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr2)));
    }

    private static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int sum = tmp + arr[j];

                if (list.contains(sum)) {
                    continue;
                }
                list.add(sum);
            }
        }

        // System.out.println(list.stream().mapToInt(i -> i));
        // System.out.println(list.stream().mapToInt(i -> i).toString());

        int [] newArr = list.stream().mapToInt(i -> i).toArray();

        Arrays.sort(newArr);

        // ArrayList를 int[]로 변환하는 방법
        // https://hoehen-flug.tistory.com/49
        return newArr;
    }
}
