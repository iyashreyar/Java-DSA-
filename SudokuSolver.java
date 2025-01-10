

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board)){
            display(board);
        } else {
            System.out.println("Cannot be solved");
        }
    }
    static boolean solve(int[][] board){
        int r = -1;
        int c = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0){
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you find some empty element in a row, then break
            if (emptyLeft == false){
                break;
            }
        }
        if (emptyLeft == true){
            return true;
            //sudoku is solved
        }
        //backtrack 
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, r, c, number)){
                board[r][c] = number;
                if (solve(board)){
                    return true;
                } else {
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        //check the row 
        for (int i = 0; i < board.length; i++){
            //check if the number is in the row
            if (board[r][c] == num){
                return false;
            } 
        }

        //check the col 
        for (int[] nums : board){
            //check if the number is in the row
            if (nums[c] == num){
                return false;
            } 
        }

        //check the box
        int sqrt = (int)(Math.sqrt(board.length));
        int rStart = r - r % sqrt;
        int cStart = c - c % sqrt;
        for (int i = rStart; i < rStart+sqrt; i++) {
            for (int j = cStart; j < cStart+sqrt; j++){
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board){
            for ( int num : row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}
