
import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            if (result.size() == 0 ||
                result.get(result.size() - 1)[1] < start) {

                result.add(new int[]{start, end});

            } else {

                int[] last = result.get(result.size() - 1);

                last[1] = Math.max(last[1], end);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals1 = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] intervals2 = {
            {1, 4}, {4, 5}
        };

        int[][] intervals3 = {
            {4, 7}, {1, 4}
        };

        System.out.println("Example 1:");
        System.out.println(Arrays.deepToString(merge(intervals1)));

        System.out.println("Example 2:");
        System.out.println(Arrays.deepToString(merge(intervals2)));

        System.out.println("Example 3:");
        System.out.println(Arrays.deepToString(merge(intervals3)));
    }
}
