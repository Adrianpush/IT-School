package session5.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        char[][] mazeBlueprint = {{'S', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}, {'1', '1', 'E'}};
        Maze mazeFromCharArray = new Maze(mazeBlueprint);
        if (mazeFromCharArray.getRowCount() == 0) {
            System.out.println("Maze not successfully initialized");
        } else {
            mazeFromCharArray.printMaze();
            MazeRunner mazeRunner1 = new MazeRunner(mazeFromCharArray);
            System.out.println(mazeRunner1.solveMaze());
        }

        Maze mazeFromFile = new Maze("src/session5/homework/mazerunner/maze.txt");
        if (mazeFromFile.getRowCount() == 0) {
            System.out.println("Maze not successfully initialized");
        } else {
            mazeFromFile.printMaze();
            MazeRunner mazeRunner2 = new MazeRunner(mazeFromFile);
            System.out.println(mazeRunner2.solveMaze());
        }
    }
}