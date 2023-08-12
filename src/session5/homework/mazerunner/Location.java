package session5.homework.mazerunner;

import java.util.Objects;

public class Location {

    private int xCoordinate;
    private int yCoordinate;

    public Location(int xCoord, int yCoord) {
        xCoordinate = xCoord;
        yCoordinate = yCoord;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xCoordinate == location.xCoordinate && yCoordinate == location.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }
}
