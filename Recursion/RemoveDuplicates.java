public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // Duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    public static void main(String args[]) {
        String str = "appnnacollege";
        boolean[] map = new boolean[26]; // for 'a' to 'z'
        StringBuilder newStr = new StringBuilder("");
        removeDuplicates(str, 0, newStr, map);
    }
}
