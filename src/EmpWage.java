import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {

        //Constants
        final int is_Present = 1;
        final int is_PartTime = 2;
        final int wagePerHour = 20;
        final int numberOfWorkingDays = 20;
        final int totalWorkingHours = 100;

        //Variables
        int empHours;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        Random random = new Random();
        //Condition for Calculate wages till total Working Hours or Days is reached for a month
        while (totalEmpHours <= totalWorkingHours && totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);

            //Checking Conditions using Switch Case

            switch (empCheck) {
                case is_Present:
                   // System.out.println("Employee is Present");
                    empHours = 8;
                    break;

                case is_PartTime:
                   // System.out.println("Employee is Part Time");
                    empHours = 4;
                    break;

                default:
                   // System.out.println("Employee is Absent");
                    empHours = 0;
            }

            //Computation

            totalEmpHours +=  empHours;
            System.out.println("Days = " + totalWorkingDays + " and Hours = " + totalEmpHours);
        }
        totalEmpWage = totalEmpHours * wagePerHour;

        System.out.println("Total Employee Wage = " + totalEmpWage);
    }
}