import java.util.Random;

public class PartTimeWage {
    public static void main(String[] args) {

        int is_Present = 1;
        int is_PartTime = 2;
        int wagePerHour = 20;
        int empHours;

        Random random = new Random();
        int empCheck = random.nextInt(3);

        if (empCheck == is_Present) {
            System.out.println("Employee is Present");
            empHours = 8;

        } else if (empCheck == is_PartTime) {
                System.out.println("Employee is Part Time");
                empHours = 4;
            }
         else {
            System.out.println("Employee is Absent");
            empHours = 0;
        }

        int empWage;

        empWage = wagePerHour * empHours;
        System.out.println("Daily Emp Wage is : " + empWage);
    }
}
