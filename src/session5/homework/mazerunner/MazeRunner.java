package session5.homework.mazerunner;

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
        for (int xCoord = 0; xCoord < maze.getColumnCount(); xCoord++) {
            for (int yCoord = 0; yCoord < maze.getRowCount(); yCoord++) {
                if (maze.getElementAtLocation(new Location(xCoord, yCoord)) == 'S') {
                    startLocation = new Location(xCoord, yCoord);
                }
            }
        }
    }

    public String solveMaze() {
        List<Location> currentLocation = new ArrayList<>();
        currentLocation.add(startLocation);
        int shortestPathLength = getShortestPathLengthWithBFS(0, currentLocation);

        if (shortestPathLength == -1) {
            return "This maze cannot be solved.";
        } else {
            List<Location> shortestPath = getShortestPathWithDFS(shortestPathLength, startLocation,
                    new ArrayList<>(), new HashSet<>());
            int count = 0;
            String message = "";
            for (Location loc : shortestPath) {
                String step = count + ". (" + loc.getXCoordinate() + "." + loc.getYCoordinate() + ")\n";
                message = message.concat(step);
                count++;
            }
            return message;
        }
    }

    private int getShortestPathLengthWithBFS(int moveCount, List<Location> startingLocations) {
        moveCount++;
        List<Location> destinations = new ArrayList<>();
        for (Location startingLocation : startingLocations) {
            List<Location> possibleDestinations = maze.getValidMoves(startingLocation);
            for (Location possibleDestination : possibleDestinations) {
                if (maze.getElementAtLocation(possibleDestination) == 'E') {
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
        if (maze.getElementAtLocation(currentLocation) == 'E') {
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
}