
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {

        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(strs1));
        System.out.println("Output: " + groupAnagrams(strs1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: " + Arrays.toString(strs2));
        System.out.println("Output: " + groupAnagrams(strs2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("Input: " + Arrays.toString(strs3));
        System.out.println("Output: " + groupAnagrams(strs3));
    }
}
