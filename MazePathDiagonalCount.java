
//fint the number of steps to go from a point to another point in 2d array if we can go right, down or diagonal direction

public class MazePathDiagonalCount {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int diagonal = count(r-1, c-1);
        int right = count(r, c-1);
        int down = count(r-1, c);
        return diagonal+right+down;
    }
}
