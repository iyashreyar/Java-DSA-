public class MazeWdRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        PathRestrictions("", maze, 0, 0);
    }
    static void PathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        if (r < maze.length-1){
            PathRestrictions(p+'D', maze, r+1, c);
        }
        if (c < maze[0].length-1){
            PathRestrictions(p+'R', maze, r, c+1);
        }
    }
}
