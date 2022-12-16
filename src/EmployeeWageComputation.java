import java.util.Random;

public class EmployeeWageComputation {
    //Constants
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    //Constructor

    public EmployeeWageComputation (String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void totalEmpWage(){
        EmployeeWageComputation accenture = new EmployeeWageComputation("Accenture",20,20,100);

        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        while (totalWorkingDays < accenture.numOfWorkingDays && totalWorkingHours < accenture.maxHoursPerMonth){
            totalWorkingDays++;

            int empCheck = random.nextInt(3);
            int empHours = 0;

             switch( empCheck ){

                case IS_PART_TIME -> empHours = 4 ;
                case IS_FULL_TIME -> empHours = 8 ;
                default -> empHours = 0 ;
            }
            totalWorkingHours = empHours + totalWorkingHours;
            empWage = empHours * accenture.wagePerHour;
            System.out.println("Day " + totalWorkingDays + " = " + empWage);
            totalEmpWage = empWage + totalEmpWage;
            }
        System.out.println("Wage of " + accenture.company +" "+ "Employee is " + totalEmpWage);

    }

    public static void main(String[] args) {
        totalEmpWage();
    }
}

