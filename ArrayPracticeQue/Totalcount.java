public class Totalcount {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }

        System.out.println("Total elements= " + count);
    }
}