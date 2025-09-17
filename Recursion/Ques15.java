public class Ques15 {
    static void generateSubsets(String s, int index, String current) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Exclude current char
        generateSubsets(s, index + 1, current);

        // Include current char
        generateSubsets(s, index + 1, current + s.charAt(index));
    }

    public static void main(String[] args) {
        String s = "ab";
        generateSubsets(s, 0, "");
    }
}
