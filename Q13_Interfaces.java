interface Fare {
    double getAmount();
}

class Bus implements Fare {
    private double distance;
    private double farePerKm;

    public Bus(double distance, double farePerKm) {
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    @Override
    public double getAmount() {
        return distance * farePerKm;
    }
}

class Train implements Fare {
    private double distance;
    private double farePerKm;

    public Train(double distance, double farePerKm) {
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    @Override
    public double getAmount() {
        return distance * farePerKm;
    }
}

public class Q13_Interfaces {
    public static void main(String[] args) {
        Fare busFare = new Bus(100, 2.5);
        System.out.println("Bus Fare: $" + busFare.getAmount());

        Fare trainFare = new Train(200, 4.0);
        System.out.println("Train Fare: $" + trainFare.getAmount());
    }
}
