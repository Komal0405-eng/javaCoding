public class Queen {
    // Check if placing a queen at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // Safe placement
    }

    public static void nQueens(char board[][], int row) {
        // Base case: all queens are placed
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nQueens(board, row + 1); // Recurse
                board[row][j] = 'X'; // Backtrack
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Chess Board-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int n = 4; // try 4 queens
        char board[][] = new char[n][n];

        // Initialize board with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // call solver
        nQueens(board, 0);
    }
}
