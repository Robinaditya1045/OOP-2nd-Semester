interface StudentFee {
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

class Hostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double hostelFee;
    private double tuitionFee;

    public Hostler(String firstName, String lastName, String address, String contact, double hostelFee, double tuitionFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.hostelFee = hostelFee;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double getAmount() {
        return hostelFee + tuitionFee;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

class NonHostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double tuitionFee;

    public NonHostler(String firstName, String lastName, String address, String contact, double tuitionFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double getAmount() {
        return tuitionFee;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

public class Q14_Hostlers {
    public static void main(String[] args) {
        StudentFee hostler = new Hostler("John", "Doe", "123, Hostel Block, University Campus", "9876543210", 5000, 20000);
        System.out.println("Hostler Details:");
        System.out.println("First Name: " + hostler.getFirstName());
        System.out.println("Last Name: " + hostler.getLastName());
        System.out.println("Address: " + hostler.getAddress());
        System.out.println("Contact: " + hostler.getContact());
        System.out.println("Total Fee: $" + hostler.getAmount());

        System.out.println();

        StudentFee nonHostler = new NonHostler("Jane", "Smith", "456, XYZ Street", "9876543210", 25000);
        System.out.println("Non-Hostler Details:");
        System.out.println("First Name: " + nonHostler.getFirstName());
        System.out.println("Last Name: " + nonHostler.getLastName());
        System.out.println("Address: " + nonHostler.getAddress());
        System.out.println("Contact: " + nonHostler.getContact());
        System.out.println("Total Fee: $" + nonHostler.getAmount());
    }
}
