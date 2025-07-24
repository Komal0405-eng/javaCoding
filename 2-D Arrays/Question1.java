public class Question1 {
    public static void main(String args[]) {
        int[][] array = {{4, 7, 8}, {8, 8, 7}};
        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 8) {
                    counter8++;
                }
            }
        }
        System.out.println("Count of 8 is : " + counter8);
    }
}
