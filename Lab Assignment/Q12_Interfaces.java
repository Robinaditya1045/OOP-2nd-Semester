interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
    double calculateFuelConsumed(double distance);
}

class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double mileage;

    public TwoWheeler(String color, String number, double mileage) {
        this.color = color;
        this.number = number;
        this.mileage = mileage;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return mileage;
    }

    @Override
    public double calculateFuelConsumed(double distance) {
        return distance / mileage;
    }
}

class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double mileage;

    public FourWheeler(String color, String number, double mileage) {
        this.color = color;
        this.number = number;
        this.mileage = mileage;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return mileage;
    }

    @Override
    public double calculateFuelConsumed(double distance) {
        return distance / mileage;
    }
}

public class Q12_Interfaces {
    public static void main(String[] args) {
        Vehicle twoWheeler = new TwoWheeler("Red", "TS 1234", 50);
        System.out.println("Color of Two Wheeler: " + twoWheeler.getColor());
        System.out.println("Number of Two Wheeler: " + twoWheeler.getNumber());
        System.out.println("Mileage of Two Wheeler: " + twoWheeler.getConsumption() + " kmpl");
        System.out.println("Fuel consumed by Two Wheeler for 100 km: " + twoWheeler.calculateFuelConsumed(100) + " liters");

        System.out.println();

        Vehicle fourWheeler = new FourWheeler("Blue", "AP 5678", 10);
        System.out.println("Color of Four Wheeler: " + fourWheeler.getColor());
        System.out.println("Number of Four Wheeler: " + fourWheeler.getNumber());
        System.out.println("Mileage of Four Wheeler: " + fourWheeler.getConsumption() + " kmpl");
        System.out.println("Fuel consumed by Four Wheeler for 100 km: " + fourWheeler.calculateFuelConsumed(100) + " liters");
    }
}
