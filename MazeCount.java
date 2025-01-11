
//fint the number of steps to go from a point to another point in 2d array if we can only go in either eight or down direction

public class MazePath {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int right = count(r-1, c);
        int left = count(r, c-1);
        return right+left;
    }
}
