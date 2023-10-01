package session5_advancedflowcontrol.homework.mazerunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MazeRunner {
    private final Set<Location> visited = new HashSet<>();
    private Location startLocation;
    private Maze maze;

    public MazeRunner(Maze mazeToSolve) {
        maze = mazeToSolve;
        startLocation = mazeToSolve.getStartLocation();
    }

    public String solveMaze() {
        List<Location> currentLocation = new ArrayList<>();
        currentLocation.add(startLocation);
        int shortestPathLength = getShortestPathLengthWithBFS(0, currentLocation);
        if (shortestPathLength == -1) {
            return "Maze cannot be solved.";
        } else {
            List<Location> shortestPath = getShortestPathWithDFS(shortestPathLength, startLocation,
                    new ArrayList<>(), new HashSet<>());
            String steps = pathToString(shortestPath);
            maze.printShortestPath(shortestPath);
            return steps;
        }
    }

    private int getShortestPathLengthWithBFS(int moveCount, List<Location> startingLocations) {
        moveCount++;
        List<Location> destinations = new ArrayList<>();
        for (Location startingLocation : startingLocations) {
            List<Location> possibleDestinations = maze.getValidMoves(startingLocation);
            for (Location possibleDestination : possibleDestinations) {
                if (maze.getCharAtLocation(possibleDestination) == 'E') {
                    return moveCount;
                } else if (!visited.contains(possibleDestination)) {
                    destinations.add(possibleDestination);
                    visited.add(possibleDestination);
                }
            }
        }
        if (destinations.isEmpty()) {
            return -1;
        }
        return getShortestPathLengthWithBFS(moveCount, destinations);
    }

    private List<Location> getShortestPathWithDFS(
            int moves, Location currentLocation, List<Location> path, Set<Location> visited) {
        path.add(currentLocation);
        visited.add(currentLocation);
        moves--;
        if (maze.getCharAtLocation(currentLocation) == 'E') {
            return path;
        }
        if (moves >= 0) {
            List<Location> possibleDestinations = maze.getValidMoves(currentLocation);
            for (Location possibleDestination : possibleDestinations) {
                if (!visited.contains(possibleDestination)) {
                    List<Location> optimalPath = getShortestPathWithDFS(moves, possibleDestination,
                            new ArrayList<>(path), new HashSet<>(visited));
                    if (!optimalPath.isEmpty()) {
                        return optimalPath;
                    }
                }
            }
        }
        return new ArrayList<>();
    }

    private String pathToString(List<Location> path) {
        int stepCount = 0;
        String message = "";
        for (Location location : path) {
            String step = stepCount + ". (" + location.getXCoordinate() + "." + location.getYCoordinate() + ")\n";
            message = message.concat(step);
            stepCount++;
        }
        return message;
    }
}