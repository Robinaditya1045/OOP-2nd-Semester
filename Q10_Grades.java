class Student {
    protected String name;
    protected int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Sports extends Student {
    protected int sGrade;

    public Sports(String name, int rollNumber, int sGrade) {
        super(name, rollNumber);
        this.sGrade = sGrade;
    }
}

class Exam extends Student {
    protected int eGrade;

    public Exam(String name, int rollNumber, int eGrade) {
        super(name, rollNumber);
        this.eGrade = eGrade;
    }
}

class Results extends Sports {
    private int eGrade;
    private char finalResult;

    public Results(String name, int rollNumber, int sGrade, int eGrade) {
        super(name, rollNumber, sGrade);
        this.eGrade = eGrade;
        calculateResult();
    }

    private void calculateResult() {
        double totalGrade = (sGrade + eGrade) / 2.0;
        if (totalGrade >= 90) {
            finalResult = 'A';
        } else if (totalGrade >= 80) {
            finalResult = 'B';
        } else if (totalGrade >= 70) {
            finalResult = 'C';
        } else if (totalGrade >= 60) {
            finalResult = 'D';
        } else {
            finalResult = 'F';
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Sports Grade: " + sGrade);
        System.out.println("Exam Grade: " + eGrade);
        System.out.println("Final Result: " + finalResult);
    }
}

public class Q10_Grades {
    public static void main(String[] args) {
        Results studentResult = new Results("John", 101, 85, 75);
        studentResult.display();
    }
}
