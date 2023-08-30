package session10.homework.vehicle.bicycles;

public class MountainBIke extends Bicycle{

    String tireType;
    String suspension;

    public MountainBIke(String tireType, String suspension) {
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(){
        System.out.println("Adjusting suspension");
    }
}
