
//fint the path from a point to another point in 2d array using an arraylist if we can only go in either right or down direction

import java.util.ArrayList;

public class MazePathAL {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
    }
    static ArrayList<String> path(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(path(p+'D', r-1, c));
        }
        if (c > 1){
            list.addAll(path(p+'R', r, c-1));
        }
        return list;
    }
}
