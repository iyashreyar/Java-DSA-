
//fint the path from a point to another point in 2d array if we can go right(H), down(V) or diagonal(D) direction

public class MazePathDiagonal {
    public static void main(String[] args) {
        diagonal("", 3, 3);
    }
    static void diagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1){
            diagonal(p+'D', r-1, c-1);
        }
        if (r > 1){
            diagonal(p+'V', r-1, c);
        }
        if (c > 1){
            diagonal(p+'H', r, c-1);
        }
    }
}
