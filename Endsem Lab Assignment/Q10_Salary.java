abstract class Employee {
    abstract double getAmount();
}

class WeeklyEmployee extends Employee {
    private double salaryPerWeek;
    private int totalWeeks;

    public WeeklyEmployee(double salaryPerWeek, int totalWeeks) {
        this.salaryPerWeek = salaryPerWeek;
        this.totalWeeks = totalWeeks;
    }

    @Override
    double getAmount() {
        return salaryPerWeek * totalWeeks;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int totalHours;

    public HourlyEmployee(double hourlyRate, int totalHours) {
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    @Override
    double getAmount() {
        return hourlyRate * totalHours;
    }
}

public class Q10_Salary {
    public static void main(String[] args) {
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(1000, 4);
        System.out.println("Amount to be paid to Weekly Employee: $" + weeklyEmployee.getAmount());

        HourlyEmployee hourlyEmployee = new HourlyEmployee(20, 50);
        System.out.println("Amount to be paid to Hourly Employee: $" + hourlyEmployee.getAmount());
    }
}
