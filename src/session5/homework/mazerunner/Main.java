package session5.homework.mazerunner;

public class Main {

    public static void main(String[] args) {
        String[][] mazeBlueprint = {{"S", "0", "0"}, {"0", "0", "0"}, {"E", "1", "1"}};
        Maze maze = new Maze(mazeBlueprint);
        maze.printMaze(0, 0);
    }
}