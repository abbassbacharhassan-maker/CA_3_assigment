
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;

        int[] lastSeen = new int[128];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (lastSeen[ch] > left) {
                left = lastSeen[ch];
            }

            lastSeen[ch] = right + 1;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Example 1:");
        System.out.println("Input: " + s1);
        System.out.println("Output: " + lengthOfLongestSubstring(s1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: " + s2);
        System.out.println("Output: " + lengthOfLongestSubstring(s2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("Input: " + s3);
        System.out.println("Output: " + lengthOfLongestSubstring(s3));
    }
}
