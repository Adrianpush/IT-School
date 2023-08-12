package session5.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        char[][] mazeBlueprint = {{'S', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}, {'1', '1', 'E'}};
        Maze mazeFromCharArray = new Maze(mazeBlueprint);
        mazeFromCharArray.printMaze();
        MazeRunner mazeRunner = new MazeRunner(mazeFromCharArray);
        System.out.println(mazeRunner.solveMaze());

        Maze mazeFromFile = new Maze("src/session5/homework/mazerunner/maze.txt");
        mazeFromFile.printMaze();
        mazeRunner = new MazeRunner(mazeFromFile);
        System.out.println(mazeRunner.solveMaze());
    }
}