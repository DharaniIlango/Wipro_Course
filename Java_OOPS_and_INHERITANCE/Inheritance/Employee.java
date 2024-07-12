public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getter for annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Setter for annualSalary
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Getter for yearStarted
    public int getYearStarted() {
        return yearStarted;
    }

    // Setter for yearStarted
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    // Getter for nationalInsuranceNumber
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setter for nationalInsuranceNumber
    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Override toString method to display employee information
    @Override
    public String toString() {
        return "Employee:\n" +
        "\tName: " + getName() + "\n" +
        "\tAnnual Salary: " + annualSalary + "\n" +
        "\tYear Started: " + yearStarted + "\n" +
        "\tNational Insurance Number: " + nationalInsuranceNumber;
    }
}
