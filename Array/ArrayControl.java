package Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayControl {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 2, 2, 1, 3, 4};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }

    private static int[] solution(int[] arr) {
        // 중복값 제거, 내림차순으로 정렬
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();

        // 공부할 것
        // 메서드 참조, stream, boxed, distict 메서드 등, Arrays, Set, Collections API
        // arr에서 기본 문법으로 중복값 제거, 내림차순 정렬법 생각하고 찾아보기
    }

    private static int[] solution1(int[] arr) {
        // Set은 중복을 허용하지 않는 자료구조
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }
    
}
