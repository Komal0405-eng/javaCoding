public class Question3{
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;

        x += y;            // x = x + y = 2 + 2 = 4
        y -= z;            // y = y - z = 2 - 2 = 0
        z /= (x + y);      // z = z / (4 + 0) = 2 / 4 = 0 (integer division)

        System.out.println(x + " " + y + " " + z);
    }
}
