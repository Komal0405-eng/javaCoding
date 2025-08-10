public class UpdateIthbit {

    // Clear the ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update the ith bit to newBit (0 or 1)
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i); 
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1)); 
    }
}
