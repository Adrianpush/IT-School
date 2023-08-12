package session5.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        char[][] mazeBlueprint = {{'S', '0', '0','0'}, {'0', '0', '0','0'}, {'0', '0', '0','0'}, {'1', '1', '1','E'}};
        Maze maze = new Maze("src/session5/homework/mazerunner/maze.txt");
        MazeRunner mazeRunner = new MazeRunner(maze);
        maze.printMaze();
        System.out.println(mazeRunner.solveMaze());
    }
}