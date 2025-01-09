public class Backtracking {
    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        backtracking("", arr, 0, 0);
    }
    static void backtracking(String p,boolean[][] arr, int r, int c){
        if (r == arr.length-1 && r == arr[0].length-1){
            System.out.println(p);
            return;
        }
        if (arr[r][c] == false){
            return;
        }

        //I'm considering this block in my path
        arr[r][c] = false;
        if (r < arr.length-1){
            backtracking(p+'D', arr, r+1, c);
        }
        if (c < arr[0].length-1){
            backtracking(p+'R', arr, r, c+1);
        }
        if (r > 0) {
            backtracking(p+'U', arr, r-1, c);
        }
        if (c > 0){
            backtracking(p+'L', arr, r, c-1);
        }
        //This line is where the fxn will over
        //So before the fxn is returned, remove the changes that were made by that fxn
        arr[r][c] = true; 
    }
}
