public class nQueens{
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }
    static int nQueens(boolean[][] board, int r){
        if (r == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //placing the queen and checking for every row and col
        for (int c = 0; c < board.length; c++){
            //place the queen if it is safe
            if (isSafe(board,r,c)){
                board[r][c] = true;
                count += nQueens(board, r+1);
                board[r][c] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        //check vertical row
        for (int i = 0; i < r; i++){
            if (board[i][c]){
                return false;
            }
        }
        //check left diagonal
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++){
            if (board[r-i][c-i]){
                return false;
            }
        }
        //check right diagonal
        int maxRight = Math.min(r, board.length-c-1);
            for (int i = 1; i <= maxRight; i++){
                if (board[r-i][c+i]){
                    return false;
                }
            }
        return true;
    }
}