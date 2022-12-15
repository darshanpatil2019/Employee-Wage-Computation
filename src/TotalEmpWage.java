import java.util.Random;

public class TotalEmpWage {
    public static void main(String[] args) {
        final int is_Present = 1;
        final int is_PartTime = 2;
        final int wagePerHour = 20;
        final int numberOfWorkingDays = 20;

        //Variables
        int empHours;
        int empWage;
        int totalEmpWage = 0;

        Random random = new Random();
        for (int day = 0; day < numberOfWorkingDays; day++) {
            int empCheck = random.nextInt(3);

            //Checking Conditions using Switch Case

            switch (empCheck) {
                case is_Present:
                    System.out.println("Employee is Present");
                    empHours = 8;
                    break;

                case is_PartTime:
                    System.out.println("Employee is Part Time");
                    empHours = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHours = 0;
            }

            empWage = empHours * wagePerHour;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee Wage Day : " + (day+1) + " " + empWage);

        }
        System.out.println("Total Employee Wage is : " + totalEmpWage);
    }
}
