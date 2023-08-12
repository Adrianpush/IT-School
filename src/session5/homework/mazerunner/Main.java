package session5.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        //Maze from char[][]//
        char[][] mazeBlueprint = {{'S', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}, {'1', '1', 'E'}};
        try {
            Maze mazeFromCharArray = new Maze(mazeBlueprint);
            mazeFromCharArray.printMaze();
            MazeRunner mazeRunner1 = new MazeRunner(mazeFromCharArray);
            System.out.println(mazeRunner1.solveMaze());
        } catch (InstantiationException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Cannot instantiate maze.");
        }
        //Maze from file//
        try {
            Maze mazeFromFile = new Maze("src/session5/homework/mazerunner/maze.txt");
            mazeFromFile.printMaze();
            MazeRunner mazeRunner2 = new MazeRunner(mazeFromFile);
            System.out.println(mazeRunner2.solveMaze());
        } catch (InstantiationException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Cannot instantiate maze.");
        }
        //Randomly generate maze//
        Maze randomMaze = new Maze(25, 25);
        randomMaze.printMaze();
        MazeRunner mazeRunner3 = new MazeRunner(randomMaze);
        System.out.println(mazeRunner3.solveMaze());
    }
}
