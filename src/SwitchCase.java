import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
        //Constants
        final int is_Present = 1;
        final int is_PartTime = 2;
        final int wagePerHour = 20;

        //Variables
        int empHours;
        int empWage;

        Random random = new Random();
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
        System.out.println("Employee Wage is : " + empWage);

    }
}
