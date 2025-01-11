public class nKnights1 {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0));
    }
    static int knights(boolean[][] board, int r){
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
                count += knights(board, r+1);
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
        
        for (int i = 0; i < r; i++){
            if (board[i-2][c-1]){
                return false;
            }
        }
        for (int i = 0; i < r; i++){
            if (board[i-2][c+1]){
                return false;
            }
        }
        for (int i = 0; i < r; i++){
            if (board[i-1][c-2]){
                return false;
            }
        }
        for (int i = 0; i < r; i++){
            if (board[i-1][c+2]){
                return false;
            }
        }
        return true;
    }
}
