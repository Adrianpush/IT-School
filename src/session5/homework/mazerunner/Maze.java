package session5.homework.mazerunner;

public class Maze {

    private String[][] maze;

    public Maze(String[][] mazeBlueprint) {
        maze = mazeBlueprint;
    }

    public String getElementAtLocation(int xCoordinate, int yCoordinate) {
        return maze[yCoordinate][xCoordinate];
    }

    public void printMaze(int mazeRunnerXCoordinate, int mazeRunnerYCoordinate) {
        for (int yPosition = 0; yPosition < maze.length; yPosition++) {
            for (int xPosition = 0; xPosition < maze[yPosition].length; xPosition++) {
                if (xPosition == mazeRunnerXCoordinate && yPosition == mazeRunnerYCoordinate) {
                    System.out.print("*");
                } else {
                    System.out.print(maze[yPosition][xPosition]);
                }
            }
            System.out.println();
        }
    }
}