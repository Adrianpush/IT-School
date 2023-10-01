package session5_advancedflowcontrol.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        //Maze from char[][]
        char[][] mazeBlueprint = {{'0', '0', '0', '0', '0', '0', 'S', '0', '0'}, {'0', '0', '0'},
                {'0', '0', '0', '0', '0'}, {'1','E', '1'}};
        try {
            Maze mazeFromCharArray = new Maze(mazeBlueprint);
            MazeRunner mazeRunner1 = new MazeRunner(mazeFromCharArray);
            System.out.println("Path\n" + mazeRunner1.solveMaze());
        } catch (InstantiationException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Cannot instantiate maze.");
        }
        //Maze from file
        try {
            Maze mazeFromFile = new Maze("src/session5/homework/mazerunner/maze.txt");
            MazeRunner mazeRunner2 = new MazeRunner(mazeFromFile);
            System.out.println("Path\n" +mazeRunner2.solveMaze());
        } catch (InstantiationException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Cannot instantiate maze.");
        }
        //Randomly generate maze
        Maze randomMaze = new Maze(20, 22);
        MazeRunner mazeRunner3 = new MazeRunner(randomMaze);
        System.out.println("Path\n" +mazeRunner3.solveMaze());
    }
}
