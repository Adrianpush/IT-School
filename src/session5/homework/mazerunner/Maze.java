package session5.homework.mazerunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Maze {
    private List<int[]> moves;
    private char[][] maze2DArray;
    private Location startLocation;

    public Maze(char[][] mazeBlueprint) throws InstantiationException {
        if (isMazeValid(mazeBlueprint)) {
            maze2DArray = mazeBlueprint;
            setMoves();
        } else {
            throw new InstantiationException("Maze doesn't contain start point.");
        }
    }

    public Maze(String fileName) throws InstantiationException {
        List<char[]> mazeFromFile = new ArrayList<>();
        try {
            File mazeFile = new File(fileName);
            Scanner fileReader = new Scanner(mazeFile);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                mazeFromFile.add(data.toCharArray());
            }
            fileReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            throw new InstantiationException("File not found.");
        }
        char[][] mazeBlueprint = new char[mazeFromFile.size()][mazeFromFile.get(0).length];
        for (int index = 0; index < mazeBlueprint.length; index++) {
            mazeBlueprint[index] = mazeFromFile.get(index);
        }
        if (isMazeValid(mazeBlueprint)) {
            maze2DArray = mazeBlueprint;
            setMoves();
        } else {
            throw new InstantiationException("Maze doesn't contain start point.");
        }
    }

    public Maze(int numRows, int numColumns) {
        char[][] mazeBlueprint = new char[numRows][numColumns];
        Random rand = new Random();
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numColumns; columnIndex++) {
                int randFactor = rand.nextInt(10);
                mazeBlueprint[rowIndex][columnIndex] = (randFactor > 2) ? '0' : '1';
            }

        }
        mazeBlueprint[rand.nextInt(numRows)][rand.nextInt(numColumns)] = 'E';
        int startLocationX = rand.nextInt(numColumns);
        int startLocationY = rand.nextInt(numRows);
        mazeBlueprint[startLocationY][startLocationX] = 'S';
        maze2DArray = mazeBlueprint;
        setMoves();
        setStartLocation(new Location(startLocationX, startLocationY));
    }

    public char getCharAtLocation(Location location) {
        return maze2DArray[location.getYCoordinate()][location.getXCoordinate()];
    }

    public Location getStartLocation() {
        return startLocation;
    }

    private void setStartLocation(Location location) {
        startLocation = location;
    }

    public void printShortestPath(List<Location> path) {
        System.out.println("Initial Maze");
        printMaze();
        for (Location location : path) {
            if (maze2DArray[location.getYCoordinate()][location.getXCoordinate()] == '0') {
                maze2DArray[location.getYCoordinate()][location.getXCoordinate()] = '*';
            }
        }
        System.out.println("Solved Maze");
        printMaze();
    }

    public List<Location> getValidMoves(Location location) {
        List<Location> validMoves = new ArrayList<>();
        for (int[] move : moves) {
            Location possibleLocation = new Location(location.getXCoordinate() + move[0],
                    location.getYCoordinate() + move[1]);
            if (isInsideMaze(possibleLocation)) {
                char possibleLocationChar = getCharAtLocation(possibleLocation);
                if (possibleLocationChar == '0' || possibleLocationChar == 'E') {
                    validMoves.add(possibleLocation);
                }
            }
        }
        return validMoves;
    }

    private void setMoves() {
        List<int[]> allowedMoves = new ArrayList<>();
        allowedMoves.add(new int[]{0, -1});
        allowedMoves.add(new int[]{0, 1});
        allowedMoves.add(new int[]{1, 0});
        allowedMoves.add(new int[]{-1, 0});
        moves = allowedMoves;
    }

    private boolean isMazeValid(char[][] mazeBlueprint) {
        boolean isStartPointFound = false;
        for (int rowIndex = 0; rowIndex < mazeBlueprint.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < mazeBlueprint[rowIndex].length; columnIndex++) {
                if (mazeBlueprint[rowIndex][columnIndex] == 'S') {
                    isStartPointFound = true;
                    setStartLocation(new Location(columnIndex, rowIndex));
                }
            }
        }
        return isStartPointFound;
    }

    private boolean isInsideMaze(Location location) {
        return (location.getYCoordinate() >= 0 && location.getYCoordinate() < maze2DArray.length
                && location.getXCoordinate() >= 0 &&
                location.getXCoordinate() < maze2DArray[location.getYCoordinate()].length
        );
    }

    private void printMaze() {
        for (char[] chars : maze2DArray) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}