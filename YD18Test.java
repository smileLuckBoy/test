import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YD18Test {

    /**
     * 全排列
     * @param arr 数组
     * @param start 起始位置
     * @param end 结束位置
     * @param result 结果集
     */
    private static void arrange(int[] arr, int start, int end, List<String> result) {
        if (start == end) {
            String value = IntStream.of(arr).boxed().map(String::valueOf).collect(Collectors.joining());
            result.add(value);

            return;
        }

        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            arrange(arr, start + 1, end, result);
            swap(arr, i, start);
        }

    }

    /**
     * 元素位置交换
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }

        List<String> result = new LinkedList<>();
        arrange(arr, 0, n - 1, result);


        System.out.println(result);
    }

}
