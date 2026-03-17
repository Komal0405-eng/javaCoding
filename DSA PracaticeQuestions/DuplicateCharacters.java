class DuplicateCharacters {

    public static void printDuplicates(String str) {

        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        printDuplicates("programming");
    }
}