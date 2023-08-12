package session5.homework.mazerunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Maze {

    private HashMap<String, int[]> moves;
    private char[][] maze2DArray;
    private int length;

    public Maze(char[][] mazeBlueprint) {
        maze2DArray = mazeBlueprint;
        length = mazeBlueprint.length;
        moves = new HashMap<>();
        moves.put("North", new int[]{0, -1});
        moves.put("South", new int[]{0, 1});
        moves.put("East", new int[]{1, 0});
        moves.put("West", new int[]{-1, 0});
    }

    public Maze(String fileName) {
        try {
            File mazeFile = new File(fileName);
            Scanner fileReader = new Scanner(mazeFile);
            List<char[]> mazeFromFile = new ArrayList<>();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                mazeFromFile.add(data.toCharArray());
            }
            fileReader.close();
            char[][] mazeBlueprint = new char[mazeFromFile.size()][mazeFromFile.size()];
            for (int index = 0; index < mazeBlueprint.length; index++) {
                mazeBlueprint[index] = mazeFromFile.get(index);
            }
            maze2DArray = mazeBlueprint;
            moves = new HashMap<>();
            moves.put("North", new int[]{0, -1});
            moves.put("South", new int[]{0, 1});
            moves.put("East", new int[]{1, 0});
            moves.put("West", new int[]{-1, 0});
            length = mazeBlueprint.length;
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FIle not found.");
        }
    }

    public int getLength() {
        return length;
    }

    public char getElementAtLocation(Location location) {
        return maze2DArray[location.getYCoordinate()][location.getXCoordinate()];
    }

    public void printMaze() {
        for (int yPosition = 0; yPosition < maze2DArray.length; yPosition++) {
            for (int xPosition = 0; xPosition < maze2DArray[yPosition].length; xPosition++) {
                System.out.print(maze2DArray[yPosition][xPosition]);
            }
            System.out.println();
        }
    }

    public List<Location> getValidMoves(Location location) {
        List<Location> validMoves = new ArrayList<>();
        for (int[] move : moves.values()) {
            Location tempLocation = new Location(location.getXCoordinate() + move[0],
                    location.getYCoordinate() + move[1]);

            if (isInsideMaze(tempLocation)) {
                char tempLocationChar = getElementAtLocation(tempLocation);
                if (tempLocationChar == '0' || tempLocationChar == 'E') {
                    validMoves.add(tempLocation);
                }
            }
        }
        return validMoves;
    }

    private boolean isInsideMaze(Location location) {
        return (location.getXCoordinate() >= 0 && location.getXCoordinate() < maze2DArray.length &&
                location.getYCoordinate() >= 0 && location.getYCoordinate() < maze2DArray.length);
    }
}