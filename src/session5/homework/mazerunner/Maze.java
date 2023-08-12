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
    private int rowCount;
    private int columnCount;

    public Maze(char[][] mazeBlueprint) throws InstantiationException {
        if (isMazeValid(mazeBlueprint)) {
            maze2DArray = mazeBlueprint;
            rowCount = mazeBlueprint.length;
            columnCount = mazeBlueprint[0].length;
            setMoves();
        } else {
            throw new InstantiationException("Maze is not valid.");
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
            columnCount = mazeFromFile.get(0).length;
            rowCount = mazeFromFile.size();
        } else {
            throw new InstantiationException("Maze is not valid.");
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
        mazeBlueprint[rand.nextInt(numRows)][rand.nextInt(numColumns)] = 'S';
        maze2DArray = mazeBlueprint;
        setMoves();
        columnCount = numColumns;
        rowCount = numRows;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public char getCharAtLocation(Location location) {
        return maze2DArray[location.getYCoordinate()][location.getXCoordinate()];
    }

    public void printMaze() {
        for (char[] chars : maze2DArray) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
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
        int rowLength = mazeBlueprint[0].length;
        boolean startPointFound = false;
        for (char[] chars : mazeBlueprint) {
            if (chars.length != rowLength) {
                return false;
            }
            if (!startPointFound) {
                for (char aChar : chars) {
                    if (aChar == 'S') {
                        startPointFound = true;
                        break;
                    }
                }
            }
        }
        return true;
    }

    private boolean isInsideMaze(Location location) {
        return (location.getXCoordinate() >= 0 && location.getXCoordinate() < columnCount &&
                location.getYCoordinate() >= 0 && location.getYCoordinate() < rowCount);
    }
}