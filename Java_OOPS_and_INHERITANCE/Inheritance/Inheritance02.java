public class Inheritance02 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Dharani Ilango", 50000, 2025, "ABC123");

        // Test the getter methods
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        // Test the setter methods
        employee.setName("Bruce Wayne");
        employee.setAnnualSalary(60000);
        employee.setYearStarted(2023);
        employee.setNationalInsuranceNumber("CDE456");

        // Print the updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println(employee);
    }
}
