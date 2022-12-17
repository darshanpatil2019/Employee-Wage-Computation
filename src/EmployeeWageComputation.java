import java.util.Random;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    // Constructor

    public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void totalEmpWage() {
        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;


        while ((totalWorkingDays < numOfWorkingDays) && (totalWorkingHours < maxHoursPerMonth)) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            int empHours = 0;
            switch (empCheck) {

                case IS_PART_TIME -> empHours = 4;
                case IS_FULL_TIME -> empHours = 8;
                default -> empHours = 0;
            }
            totalWorkingHours = empHours + totalWorkingHours;
            empWage = empHours * empRatePerHour;
            System.out.println("Day " + totalWorkingDays + " Employee hours " + empHours);
        }
        totalEmpWage = totalWorkingHours * empRatePerHour;
    }

    public String toString() {
        return "Salary of " + company + " employee is " + totalEmpWage;

    }

    public static void main(String[] args) {

        EmployeeWageComputation accenture = new EmployeeWageComputation("Accenture", 20, 25, 100);
        accenture.totalEmpWage();
        System.out.println(accenture);

        EmployeeWageComputation wipro = new EmployeeWageComputation("Wipro", 20, 20, 100);
        wipro.totalEmpWage();
        System.out.println(wipro);
    }
}
