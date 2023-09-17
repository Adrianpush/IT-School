package session15.homework.challenge17;

public enum CarTypes {

    DACIA_LOGAN(7000, "Dacia"),
    SKODA_OCTAVIA(8000, "Skoda"),
    WOLKSVAGEN_GOLF(6000, "Wolkswagen");

    private double averagePrice;
    private String manufacturer;

    CarTypes(double averagePrice, String manufacturer) {
        this.averagePrice = averagePrice;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        System.out.println(CarTypes.DACIA_LOGAN);
        System.out.println(CarTypes.SKODA_OCTAVIA);
        System.out.println(CarTypes.WOLKSVAGEN_GOLF);
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        switch (this) {
            case DACIA_LOGAN -> stringBuilder.append("Dacia Logan");
            case SKODA_OCTAVIA -> stringBuilder.append("Skoda Octavia");
            case WOLKSVAGEN_GOLF -> stringBuilder.append(("Wolkswagen Golf"));
        }
        stringBuilder.append("\nAverage Price: ").append(getAveragePrice()).append("$");
        stringBuilder.append("\nManufacturer: ").append(getManufacturer());
        return stringBuilder.toString();
    }
}
