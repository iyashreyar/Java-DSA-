public class nKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }
    static void knight(boolean[][] board, int r, int c, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (r == board.length - 1 && c == board.length) {
            return;
        }

        if (c == board.length) {
            knight(board, r + 1, 0, knights);
            return;
        }

        if (isSafe(board, r, c)) {
            board[r][c] = true;
            knight(board, r, c + 1, knights - 1);
            board[r][c] = false;
        }

        knight(board, r, c + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        if (isValid(board, r - 2, c - 1)) {
            if (board[r - 2][c - 1]) {
                return false;
            }
        }

        if (isValid(board, r - 1, c - 2)) {
            if (board[r - 1][c - 2]) {
                return false;
            }
        }

        if (isValid(board, r - 2, c + 1)) {
            if (board[r - 2][c + 1]) {
                return false;
            }
        }

        if (isValid(board, r - 1, c + 2)) {
            if (board[r - 1][c + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int r, int c) {
        if (r >= 0 && r < board.length && c >= 0 && c < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] r : board) {
            for(boolean element : r) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
