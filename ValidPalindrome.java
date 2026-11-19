
class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            }
        }

        String clean = str.toString();

        String reverse = str.reverse().toString();

        return clean.equals(reverse);
    }
}
